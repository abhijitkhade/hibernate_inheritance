package com.prowing.inheritance_join_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_jointTable_inheritance {
	
	
	public static void main(String[] args) {
		
		HDFC_Bank hf= new HDFC_Bank();
		hf.setBankID(1);
		hf.setBankType("private");
		hf.setBranchname("pune");
		hf.setIFSCCODE("ab123");
		
		SBI_Bank sb= new SBI_Bank();
		sb.setBankID(2);
		sb.setBankType("Goverment");
		sb.setBranchname("kolapur");
		sb.setIFSCCODE("SB123");
		
		
		

		Configuration cfg= new Configuration();
		cfg.configure();
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction trx= session.beginTransaction();
		
		session.save(hf);
		session.save(sb);
		
		trx.commit();
		session.close();
		
	}

}
