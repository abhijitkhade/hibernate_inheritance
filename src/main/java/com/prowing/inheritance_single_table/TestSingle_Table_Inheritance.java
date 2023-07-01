package com.prowing.inheritance_single_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSingle_Table_Inheritance {

	public static void main(String[] args) {
		
		
		Bike b= new Bike();
		b.setId(1);
		b.setName("shine");
		b.setNoOfWheels(2);
		
		Car c= new Car();
		c.setId(2);
		c.setName("tatapunch");
		c.setNoOfWheels(4);
		c.setSteeringType("PowerSteering");
		
		
		Configuration cfg= new Configuration();
		cfg.configure();
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction trx= session.beginTransaction();
		
		session.save(b);
		session.save(c);
		
		
//		Bike bike= session.get(Bike.class, 1);
//		System.out.println(bike);
//		
		
		//Vehical retrivedvehical= session.get(Vehical.car.class, 1);
		//System.out.println(retrivedvehical);
//		
		trx.commit();
		session.close();
	}
	
	
	
}
