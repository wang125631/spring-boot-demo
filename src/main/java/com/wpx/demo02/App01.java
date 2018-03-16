package com.wpx.demo02;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 方式一:
 * 
 * (1) 启动类 extends WebMvcConfigurationSupport
 * (2) 覆盖方法configureMessageConverters
 * @author wangpx
 */
@SpringBootApplication
public class App01 extends WebMvcConfigurationSupport{
	
	public static void main(String[] args) {
		SpringApplication.run(App01.class, args);
	}

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		//定义转换器
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		//fastjson配置   
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//转化器设置
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		//添加一个转换器
		converters.add(fastJsonHttpMessageConverter);
	}
	
}
