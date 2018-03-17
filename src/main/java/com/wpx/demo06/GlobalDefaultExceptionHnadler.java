package com.wpx.demo06;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalDefaultExceptionHnadler {

	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public String defaultErrorHandler() {
		return "浏览器异常显示,请刷新重试";
	}
	
}
