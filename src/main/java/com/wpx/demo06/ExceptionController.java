package com.wpx.demo06;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 	访问
 *	http://127.0.0.1:8080/demo06/exception
 *	显示异常信息
 * 
 * @author wangpx
 */
@RestController
@RequestMapping("/demo06")
@SuppressWarnings("all")
public class ExceptionController {

	@RequestMapping("/exception")
	public void getException() {
		int i =1/0;
	}
	
	
}

