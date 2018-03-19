package com.wpx.demo08;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * SpringBoot 整合模板引擎
 * 
 * @author wangpx
 */
@Controller
@RequestMapping("/demo08")
public class HelloController {


	@RequestMapping("/hello")
	public String helloThymeleaf(Map<String,Object> map) {
		map.put("name", "wangpx");
		return "hello";
	}
	@RequestMapping("/helloFtl")
	public String helloFreeMarker(Map<String,Object> map) {
		map.put("name", "wangpx");
		return "helloFtl";
	}

}
