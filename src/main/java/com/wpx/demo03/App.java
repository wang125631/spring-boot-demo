package com.wpx.demo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * 方式一:
 * 	
 * (1)使用spring-boot:run 方式
 * 需要将其他主程序注解掉
 * (2) 如果使用的run as – java application的话，那么还需要做一些处理。
 *把spring-loader-1.2.4.RELEASE.jar下载下来，放到项目的lib目录中，然后把IDEA的run参数里VM参数设置为：
 * -javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
 * 然后启动就可以了，这样在run as的时候，也能进行热部署
 * 
 * 
 * @author wangpx
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
