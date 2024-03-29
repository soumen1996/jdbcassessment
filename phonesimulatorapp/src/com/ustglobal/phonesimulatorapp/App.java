
package com.ustglobal.phonesimulatorapp;

import java.util.List;
import java.util.Scanner;
import com.ustglobal.phonesimulatorapp.dao.ContactDao;
import com.ustglobal.phonesimulatorapp.dto.ContactBean;
import com.ustglobal.phonesimulatorapp.util.ContactManager;

class App {
	
public static void main(String[] args) {
		
		while(true)
		{
		System.out.println("********************************");
		System.out.println("1.Show All contact Details");
		System.out.println("2.Search for contact using name");
		System.out.println("3.operate contact");
		System.out.println("********************************");
		
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
		ContactDAO impl =  ContactManager.getContactDao();
		List<ContactBean> rs = impl.showAllCOntacts();
		for(ContactBean bean: rs) 
		{
			System.out.println(bean.getName());
		}
		break;
		
		case 2:
			ContactDAO impl1 =  ContactManager.getContactDao();
			System.out.println("Enter name you want to search");
			String name = sc.next();
			ContactBean bean =impl1.searchContact(name);
			if(bean!=null)
			{
			System.out.println(bean.getName());
			System.out.println(bean.getNumber());
			System.out.println(bean.getGroup());
			System.out.println("1.Press 1 to call");
			System.out.println("2.Press 2 to Message");
			System.out.println("3.Press 3 to go back main menu");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			  case 1:
				  		System.out.println("calling contact");
				  		break;
			  case 2:
				  		System.out.println("message to contact");
				  		break;
			  case 3:
			  		System.out.println("go back mainmenu");
			  		break;
			}
			}
			else {
				System.out.println("No Data Found");
			}
			break;
		
		case 3:
					System.out.println("Press 1 to add contact");
					System.out.println("Press 2 to delete contact");
					System.out.println("Press 3 to edit contact");
					System.out.println("Enter your choice");
	    }
  }
 }
		}
