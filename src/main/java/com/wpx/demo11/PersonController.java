package com.wpx.demo11;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * 
 * @author wangpx
 */
@RestController
@RequestMapping("/demo11")
public class PersonController {

	@Resource
	private PersonMapper personMapper;
	@Cacheable(value="findAll")
	@RequestMapping("/findAll")
	public List<Person> findAll() {
		System.out.println("使用缓存则该语句不会被输出");
		return personMapper.findAll();
	} 
}
