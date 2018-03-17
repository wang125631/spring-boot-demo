package com.wpx.demo04.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.wpx.demo04.bean.Person;
/** 
 *  关于父类Repository   
    1.Repository接口为空接口,即是一个标记接口 
    2.若自定义的接口继承Repository,那么这个接口会被IOC容器识别为一个Repository Bean,可以在接口中定义满足一定规范的方法(如果用Spring整合一定要配置扫描) 
    3.可以用@RepositoryDefinition(domainClass=Student.class,idClass=Integer.class) 
     
    关于springData的规范 
    按照 Spring Data 的规范，查询方法以 find | read | get 开头， 
     涉及条件查询时，条件的属性用条件关键字连接，要注意的是：条件属性以首字母大写。  
 *  
 * @author wangpx 
 */  
public interface Person2Repository extends Repository<Person, Integer>{

	public Person findByName(String name);
	/**
	 * 使用HQL
	 */
	@Query("from Person where name=:name")
	public Person findByName2(@Param("name")String name);
}
