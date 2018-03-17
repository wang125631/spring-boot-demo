package com.wpx.demo05.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wpx.demo05.dao.PersonDao;
import com.wpx.demo05.vo.Person;

@Service
public class PersonService {

	@Resource
	private PersonDao personDao;
	
	public Person selectByName() {
		return personDao.selectByName();
	}
	
}
