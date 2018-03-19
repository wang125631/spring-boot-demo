package com.wpx.demo11;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.wpx.demo11")
/**
 *  此注解@EnableCaching表示使用缓存
 * 
 * 
 * @author wangpx
 */
public class App {
public static void main(String[] args) throws Exception {
	SpringApplication.run(App.class, args);
}

}
