package com.simpledatabaseadd.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class PersonalInfo {
	@Id
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String sex;
	
	public PersonalInfo(){
		
	}

	public PersonalInfo(String name, int age, String sex){
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", age="
				+ age + ", sex=" + sex + "]";
		
	}
}
