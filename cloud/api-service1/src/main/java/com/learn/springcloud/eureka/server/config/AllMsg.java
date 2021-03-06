package com.learn.springcloud.eureka.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类  
 * 
 * @author xiesf
 * @since 2016-11-29
 */
@Configuration
@RefreshScope
public class AllMsg {

	public AllMsg() {
	}

	@Value("${error.auth.emptyTime}")
	private String emptyTime;

	public String getEmptyTime() {
		return emptyTime;
	}

	public void setEmptyTime(String emptyTime) {
		this.emptyTime = emptyTime;
	}

}
