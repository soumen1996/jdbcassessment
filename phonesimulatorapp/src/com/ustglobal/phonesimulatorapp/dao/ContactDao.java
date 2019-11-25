package com.ustglobal.phonesimulatorapp.dao;

import java.util.List;

import com.ustglobal.phonesimulatorapp.dto.ContactBean;

public interface ContactDao {
	
	public ArrayList<ContactBean>showAllCOntacts();
	public ContactBean searchContact(String name);

}
