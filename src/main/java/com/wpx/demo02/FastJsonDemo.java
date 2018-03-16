package com.wpx.demo02;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FastJsonDemo {

	private int id;
	private String name;
	private String address;
	@JSONField(format="yyyy-MM-dd")
	private Date createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public FastJsonDemo(int id, String name, String address, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "FastJsonDemo [id=" + id + ", name=" + name + ", address=" + address + ", createTime=" + createTime
				+ "]";
	}
	
	
}
