package com.wpx.demo04.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpx.demo04.bean.Person;
import com.wpx.demo04.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Resource
	private PersonService personService;
	
	@RequestMapping("/save")
	private String save() {
		Person person = new Person(1, "wangpx", 21);
		personService.add(person);
		return "save person success!";
	}
	@RequestMapping("/find")
	private Person find() {
		Person person = personService.getPerson(1);
		return person;
	}
	@RequestMapping("/delete")
	private String delete() {
		try {
			personService.delte(1);
			return "delete  successs";
		} catch (Exception e) {
			e.printStackTrace();
			return "delete fail";
		}
	}
	@RequestMapping("/findByName")
	private Person findByName() {
		Person person = personService.findByName("wangpx");
		return person;
	}
	
	@RequestMapping("/findPersonByName")
	private Person findPersonByName() {
		Person person = personService.findByName2("wangpx");
		return person;
	}
}
