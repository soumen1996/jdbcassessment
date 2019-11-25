package com.ustglobal.phonesimulatorapp.util;
import com.ustglobal.phonesimulatorapp.dao.ContactDao;
import com.ustglobal.phonesimulatorapp.dao.ContactDaoImpl;

public class ContactManager {
	
	
	private ContactManager() {
		
	}
	
	public static ContactDao getContactDao() {
		
		return new ContactDaoImpl();
	}


}
