package com.wpx.demo11;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface PersonMapper {

	@Select("select * from Person")
	public List<Person> findAll();
}
