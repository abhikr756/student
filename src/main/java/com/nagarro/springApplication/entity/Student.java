package com.nagarro.springApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
     
	@Id
	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
