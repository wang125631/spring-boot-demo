package com.wpx.demo10.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.wpx.demo10.vo.Person;

public interface PersonMapper {

	@Select("select * from Person where id = #{id}")
	public Person findPersonById(Integer id);

	@Insert("insert into Person(name,age) values(#{name},#{age})")
	@Options(useGeneratedKeys=true,keyColumn="id",keyProperty="id")
	public long save(Person person);
	
	@Select("select * from Person where name like concat(concat('%',#{name}),'%')")
	public List<Person> findPeronByName(String name);
}
