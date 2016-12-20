package com.zju.homework.bean;

public class Person {
	
	private String name;
	private String phonenum;
	private String birthPlace;
	private String IDcard;
	
	public Person()
	{
		
	}
	
	
	public Person(String birthplace) {
		this.birthPlace =birthplace;
	}


	public Person(String name, String phonenum, String birthPlace, String iDcard) {
		super();
		this.name = name;
		this.phonenum = phonenum;
		this.birthPlace = birthPlace;
		this.IDcard = iDcard;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	
	

}
