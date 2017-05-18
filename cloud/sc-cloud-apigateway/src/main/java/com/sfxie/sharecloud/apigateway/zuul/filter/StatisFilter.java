package com.sfxie.sharecloud.apigateway.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.sfxie.sharecloud.apigateway.zuul.hystrix.ResourceVO;
import com.sfxie.sharecloud.apigateway.zuul.util.SentinelUtil;
import com.sfxie.sharecloud.apigateway.zuul.util.ZuulConsts;
import com.sfxie.sharecloud.apigateway.zuul.util.ZuulUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.concurrent.atomic.LongAdder;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 16/8/22
 * Time: 下午7:48
 * CopyRight: taobao
 * Descrption:统计filter,在边缘位置追踪有意义的数据及统计结果
 * PV
 * QPS
 */

@Component
public class StatisFilter extends ZuulFilter {


    private static Logger log = LoggerFactory.getLogger(StatisFilter.class);

    @Override
    public String filterType() {
        return FilterTypeEnum.post.getCode();
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        if (ZuulUtil.isPreException()) {
            log.error(" pre filter is exception!");
            return false;
        }
        return true;
    }

    @Override
    public Object run() {
        log.info("-post ---.StatisFilter run!");
        //yingkhtodo:desc:forward
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        //增加header等.
//                  ctx.setResponseStatusCode(HttpServletResponse.SC_OK)      //我们可以设置一些自定义的错误码到响应头
        if (response == null) {
            return null;
        }
        response.setHeader(ZuulConsts.ALICP_HEADER_VERSION, "1.0.0");
        response.setHeader(ZuulConsts.ALICP_HEADER_COPYRIGHT, "alicp");
        log.info("header=" + response.getHeaderNames());

        //统计pv
        String uri = request.getRequestURI();
        LongAdder pv;
        if (ZuulConsts.pvMap.containsKey(uri)) {
            pv = ZuulConsts.pvMap.get(uri);
        } else {
            pv = new LongAdder();
        }
        SentinelUtil.increment(uri, ZuulUtil.getRemortIP(request));        //如果是限流的请求,限流的对象池也要更新
        ZuulConsts.pvMap.put(uri, pv);
        return null;
    }
}
