package com.wpx.demo03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo03")
public class ModifyController {

	/**
	 * 尝试修改返回结果,刷新浏览器看响应结果
	 */
	@RequestMapping("/test")
	public String getTestResult() {
		//return "test01";
		return "test02";
	}
}
