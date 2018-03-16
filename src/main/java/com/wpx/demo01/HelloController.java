package com.wpx.demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RestController  相当于Controller + ResponseBody
 * 
 * @author wangpx
 */
@RestController
@RequestMapping("/demo01")
public class HelloController {
	
	
	@RequestMapping("/say")
	public String say() {
		return "Hello World";
	}
	
	@RequestMapping("/json")
	public JsonDemo getDemo() {
		JsonDemo jsonDemo = new JsonDemo(1, "wpx", "Guangdong");
		return jsonDemo;
	}
	
}
