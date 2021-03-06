package com.sfxie.core.framework.mvc.exception.business;

import java.util.Date;

import com.sfxie.core.framework.exception.AbstractExceptionInfo;
import com.sfxie.core.framework.logger.log4j.LoggerUtil;
import com.sfxie.core.framework.mvc.exception.BusinessException;
import com.sfxie.core.framework.mvc.exception.ExceptionContainer;
import com.sfxie.core.framework.mvc.exception.ExceptionInfoJson;
import com.sfxie.core.framework.mvc.exception.MvcException;
import com.sfxie.core.framework.mvc.exception.logger.LoggerEvent;
import com.sfxie.core.framework.mvc.exception.logger.LoggerEventHandler;
import com.sfxie.core.utils.DateHelper;
import com.sfxie.core.utils.JsonUtil;

/**
 * logger异常处理监听者实现类
 * @author xieshengfeng
 * @email  xsfcy@126.com
 * @since 2015年7月20日下午2:39:34
 */
public class BusinessLoggerEventHandlerImpl extends LoggerEventHandler{

	
	public BusinessLoggerEventHandlerImpl( MvcException exception) {
		super(exception);
	}


	@Override
	public void handleEvent(LoggerEvent event) {
		MvcException exception = (MvcException) this.getException();
		ExceptionInfoJson exceptionEntity = (ExceptionInfoJson) exception.getExceptionInfo();
		String dateString = DateHelper.formatLongDate(new Date());
		String nameString = "业务异常";
		StringBuffer sb = new StringBuffer();
		sb.append("\r\n###############################################################");
		sb.append(nameString);
		sb.append("###############################################################");
		sb.append("\r\n异常发生时间: ");
		sb.append(dateString);
		sb.append("\r\n异常抛出位置: ").append(exceptionEntity.getErrorClassName()).append(".").append(exceptionEntity.getErrorMethodName()).append("()")
    	  .append("[行号: ").append(exceptionEntity.getErrorLineNumber()).append("]");
		sb.append("\r\n业务方法参数: ");
    	if(null!=ExceptionContainer.getPojoParameters() && ExceptionContainer.getPojoParameters().length>0){
    		sb.append("\r\n    参数(json): \r\n\t");
    		sb.append(JsonUtil.toJson(ExceptionContainer.getPojoParameters()));
    	}
    	if(null!=exception.getOtherExceptionMsg() && exception.getOtherExceptionMsg().size()>0){
    		sb.append("\r\n附带信息: ");
    		for(int i=0;i<exception.getOtherExceptionMsg().size();i++){
    			String obj = exception.getOtherExceptionMsg().get(i);
    			try {
    				sb.append("\r\n    附带信息");
					sb.append(i);
					sb.append(": \r\n\t");
					sb.append(obj);
				} catch (Exception e) {
				} 
    		}
    	}
		if(exception instanceof BusinessException || exception.getCause() instanceof BusinessException){
			sb.append("\r\n异常完整信息: ");
			sb.append("\t");
			if(exception.getCause() instanceof BusinessException){
				sb.append(exception.getCause().getLocalizedMessage());
			}else if(exception instanceof BusinessException){
				sb.append(exception.getLocalizedMessage());
			}
			sb.append("\r\n###############################################################");
			sb.append(nameString);
			sb.append("###############################################################");
			LoggerUtil.businessError(BusinessLoggerEventHandlerImpl.class, sb.toString());
		}
	}


	@Override
	public AbstractExceptionInfo exceptionInfo() {
		ExceptionInfoJson info = new ExceptionInfoJson();
		generateExceptionInfo(info);
		return info;
	}
}
