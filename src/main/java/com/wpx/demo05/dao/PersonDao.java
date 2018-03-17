package com.wpx.demo05.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.wpx.demo05.vo.Person;
/**
 * 使用  @Repository 注解,标注这是一个持久化对象
 * @author wangpx
 */
@Repository
public class PersonDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Person selectByName() {
		/**
		 *1. 查询语句
		 *2. 结果集(RowMapper)
		 *3.执行
		 */
		String sql="select * from Person";
		RowMapper<Person> rowMapper=new BeanPropertyRowMapper<Person>(Person.class);
		Person person = jdbcTemplate.queryForObject(sql, rowMapper);
		return person;
	}
}
