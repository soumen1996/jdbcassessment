package com.ustglobal.phonesimulatorapp.dto;

import java.io.Serializable;

public class ContactBean implements Serializable {
	
	
	private String name;
	private int number;
	private String group;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGroups() {
		return group;
	}
	public void setGroup(String groups) {
		this.group = group;
	}
	public ContactBean() {
		
	}


}
