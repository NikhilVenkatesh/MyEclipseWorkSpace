package org.practice.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.practice.hibernate.dto.Address;
import org.practice.hibernate.dto.UserDetails;
import org.practice.hibernate.dto.Vehicle;

public class HIbernateTest {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		//user.setUserId(1);
		user.setUserName("First User");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
				
		//user.setAddress("First User Address");
		//user.setJoinedDate(new Date());
		//user.setDescription("Description of user goes here");
		
		/*Address homeAddress = new Address();
		homeAddress.setStreet("376  Avon Rd");
		homeAddress.setCity("Devon");
		homeAddress.setState("PA");
		homeAddress.setPincode("19333");
		
		
		Address officeAddress = new Address();
		officeAddress.setStreet("Lancaster Avenue");
		officeAddress.setCity("Villanova");
		officeAddress.setState("PA");
		officeAddress.setPincode("19085");

		user.getListOfAddress().add(homeAddress);
		user.getListOfAddress().add(officeAddress);
*/
		//user.setOfficeAddress(officeAddress);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		
		session.getTransaction().commit();
		session.close();
		
		/*user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails)session.get(UserDetails.class, 1);
		System.out.println("User Name returned is " + user.getUserName());
		session.close();
		System.out.println(user.getListOfAddress().size());*/

	}

}
