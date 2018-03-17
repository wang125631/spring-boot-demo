package com.wpx.demo04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpx.demo04.bean.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
