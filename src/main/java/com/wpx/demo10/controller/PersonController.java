package com.wpx.demo10.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wpx.demo10.service.PersonService;
import com.wpx.demo10.vo.Person;

@RestController
@RequestMapping("/demo10")
public class PersonController {

	@Resource
	private PersonService personService;
	
	
	
	@RequestMapping("/findPersonById")
	public void findPersonById() {
		Person person = personService.findPersonById(2);
		Page<Object> startPage = PageHelper.startPage(1, 3);
		
		System.out.println(person);
		System.out.println(startPage.getPages());
		System.out.println(startPage.getPageSize());
		System.out.println(startPage.getStartRow());
		System.out.println(startPage.getEndRow());
	}
	/**
	 * http://127.0.0.1:8080/demo10/save?name=wangpx&&age=22
	 * @param name
	 * @param age
	 */
	@RequestMapping("/save")
	public void save(String name,String age) {
		try {
			Person person = new Person(name, Integer.parseInt(age));
			personService.save(person);
			System.out.println("插入成功");
		} catch (Exception e) {
			System.out.println("插入失败");
		}
	}
	/**
	 * 
	 *http://127.0.0.1:8080/demo10/findPersonByName?name=w
	 */
	@RequestMapping("/findPersonByName")
	public void findPersonByName(String name) {
		PageHelper.startPage(2, 1);
		List<Person> personList = personService.findPersonByName(name);
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
}
