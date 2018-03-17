package com.wpx.demo05.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpx.demo05.service.PersonService;
import com.wpx.demo05.vo.Person;

@RestController
@RequestMapping("/demo05")
public class PersonController {

	@Resource
	private PersonService personService;

	@RequestMapping("/select")
	private Person selectByName() {
		return personService.selectByName();
	}
}
