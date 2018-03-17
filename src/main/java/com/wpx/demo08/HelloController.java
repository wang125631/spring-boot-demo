package com.wpx.demo08;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo08")
public class HelloController {

	@RequestMapping("/hello")
	public String hellothymeleaf(Map<String,Object> map) {
		map.put("name", "wangpx");
		return "hello";
	}
}
