package com.wpx.demo10.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wpx.demo10.mapper.PersonMapper;
import com.wpx.demo10.vo.Person;

@Service
public class PersonService {

	@Resource
	private PersonMapper personMapper;
	
	public Person findPersonById(Integer id) {
		return personMapper.findPersonById(id);
	}
	
	public long save(Person person) {
		return personMapper.save(person);
	}

	public List<Person> findPersonByName(String name){
		return personMapper.findPeronByName(name);
	}

}

