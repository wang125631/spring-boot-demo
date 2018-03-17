/**
 * SpringBoot热部署 
 * 方式一: springloader
 * 在pom.xml文件中加入
 * 
 * <!-- 构建节点. -->
	<build>
		<plugins>
		
		
			在这里添加springloader plugin
			<plugin>
          		<groupId>org.springframework.boot</groupId>
          		<artifactId>spring-boot-maven-plugin </artifactId>
          		<dependencies>  
		           <dependency>  
		               <groupId>org.springframework</groupId>  
		               <artifactId>springloaded</artifactId>  
		               <version>1.2.4.RELEASE</version>
		           </dependency>  
		        </dependencies>  
		        <executions>  
		           <execution>  
		               <goals>  
		                   <goal>repackage</goal>  
		               </goals>  
		               <configuration>  
		                   <classifier>exec</classifier>  
		               </configuration>  
		           </execution>  
	       		</executions>
			</plugin>
			
			
			<!-- 这是spring boot devtool plugin -->
			<plugin>
	            <groupId>org.springframework.boot</groupId>
	            <artifactId>spring-boot-maven-plugin</artifactId>
	            <configuration>
	          		<!--fork :  如果没有该项配置，肯呢个devtools不会起作用，即应用不会restart -->
	                <fork>true</fork>
	            </configuration>
	        </plugin>
			
			
		</plugins>
		
	</build>	

	方式二:
	devtools 工具
	
	<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
           <scope>true</scope>
	</dependency>
	
	方式一可改变结果,对添加新的方法不能正确响应,方式二可以
	
	devtools说明:
	1. devtools会监听classpath下的文件变动，并且会立即重启应用（发生在保存时机），注意：因为其采用的虚拟机机制，该项重启是很快的。
	2. devtools可以实现页面热部署（即页面修改后会立即生效，这个可以直接在application.properties文件中配置spring.thymeleaf.cache=false来实现(这里注意不同的模板配置不一样)。

		
 * 
 * @author wangpx    
 */
package com.wpx.demo03;