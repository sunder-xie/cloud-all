package com.sfxie.web.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.sfxie.component.ui.ResourceEntity;
import com.sfxie.component.ui.ResourceList;
import com.sfxie.component.ui.UIConfiguration;

@ComponentScan(basePackages = { 
		"com.sfxie.core.framework",
		"com.sfxie.core.framework.core",
		"com.sfxie.core.framework.mvc.controller" ,
		"com.sfxie.services.center",
		"com.sfxie.web.tag",
		"com.sfxie.web.ui"
		})
@SpringBootApplication
@EnableAutoConfiguration(exclude={
		DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,
		XADataSourceAutoConfiguration.class
})
public class CenterApplication  {
	
	@Autowired  
    private RestTemplateBuilder builder; 
	
	@Bean  
    public RestTemplate restTemplate() {  
        return builder.build();  
    } 
	
	@Bean
	public ResourceList resourceList(){
		ResourceList resourceList = new ResourceList();
		List<ResourceEntity> resources = new ArrayList<ResourceEntity>();
		resources.add(new ResourceEntity()
		.addCssPath("/static/js/ui/zTree_v3/css/zTreeStyle/zTreeStyle.css")
		.addJsPath("/static/js/ui/zTree_v3/js/jquery.ztree.all.min.js")
		.addDescription("使用ztree")
		.addPageUri("/jsp/center/companyList.jsp")
		);
		resourceList.setResources(resources);
		return resourceList;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(new Object []{
				CenterApplication.class,
				UIConfiguration.class}, args);
	}

}