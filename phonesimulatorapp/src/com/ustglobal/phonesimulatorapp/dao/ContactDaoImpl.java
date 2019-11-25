package com.ustglobal.phonesimulatorapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ustglobal.phonesimulatorapp.dto.ContactBean;

public class ContactDaoImpl implements ContactDao{

	@Override
	public ArrayList<ContactBean> showAllCOntacts()
	{
		System.out.println("Called");
		try {
				Class.forName("com.mysql.jdbc.Driver");
				try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactfile?user=root&password=root"))
				{
					try(Statement stmt = con.createStatement()) {
							
						ResultSet rs = stmt.executeQuery("select *from contact");
						
						ArrayList<ContactBean> result = new ArrayList<ContactBean>();
						while(rs.next())
						{
							ContactBean bean = new ContactBean();
							
							String name = rs.getString(1);
							bean.setName(name);
							
							int number = rs.getInt(2);
							bean.setNumber(number);
							
							String group  = rs.getString(3);
							bean.setGroup(group);
							
							result.add(bean);
								
						}
						return result;
					}
					
				}
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ContactBean searchContact(String name)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactfile?user=root&password=root"))
		{
			
			try(PreparedStatement pstm = (PreparedStatement) con.prepareStatement("select *from contact where name = ?")) {
				pstm.setString(1, name);
				ResultSet rs = pstm.executeQuery();
				if(rs.next()) {
					
					ContactBean bean = new ContactBean();
					bean.setName(rs.getString(1));
					bean.setNumber(rs.getInt(2));
					bean.setGroup(rs.getString(3));
					return bean;
					
				}
				else {
					return null;
				}
			}		
		}					
	   }
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
  }
	
	
	}
