package com.wpx.demo02;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo02")
public class FastJsonController {

	@RequestMapping("/fastjson")
	public FastJsonDemo getFastJson() {
		FastJsonDemo fastJsonDemo = new  FastJsonDemo(1, "wangpx", "HeNan",new Date());
		return fastJsonDemo;
	}
	
}
