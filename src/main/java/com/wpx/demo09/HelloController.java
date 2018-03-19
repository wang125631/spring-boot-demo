package com.wpx.demo09;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo09")
public class HelloController {

	@RequestMapping("/hello")
	public String helloJsp() {
		return "helloJsp";
	}
}
