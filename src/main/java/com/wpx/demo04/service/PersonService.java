package com.wpx.demo04.service;



import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wpx.demo04.bean.Person;
import com.wpx.demo04.repository.Person2Repository;
import com.wpx.demo04.repository.PersonRepository;

@Service
public class PersonService {

	@Resource
	private PersonRepository personRepository;
	@Resource
	private Person2Repository person2Repository;
	
	
	@Transactional
	public void add(Person p) {
		personRepository.save(p);
	}
	@Transactional
	public void delte(Integer id) {
		personRepository.deleteById(id);
	}

	public Person getPerson(Integer id){
		return personRepository.findById(id).get();
	}
	
	public Person findByName(String name) {
		return person2Repository.findByName(name);
	}
	
	public Person findByName2(String name) {
		return person2Repository.findByName2(name);
	}
	
}
