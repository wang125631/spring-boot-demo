/**
 * SpringBoot热部署
 * 在pom.xml文件中加入
 * 
 * <!-- 构建节点. -->
	<build>
		<plugins>
		
		
			<!-- 在这里添加springloader plugin
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
			 -->
			
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

 * 
 * @author wangpx    
 */
package com.wpx.demo03;