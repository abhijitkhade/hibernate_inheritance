package com.prowing.inheritance_tableperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_table_perClass {

	public static void main(String[] args) {
		

		Student std = new Student();

		std.setId(1);
		std.setName("Abhi");
		std.setGrade("A+");
		std.setFees(5000);

		Teacher t = new Teacher();
		t.setId(2);
		t.setName("UKD");
		t.setSallary(10000);
		t.setYearOfExperince(10);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Transaction trx = session.beginTransaction();

		session.save(std);
		session.save(t);
		
		trx.commit();
		session.close();

	}
}
