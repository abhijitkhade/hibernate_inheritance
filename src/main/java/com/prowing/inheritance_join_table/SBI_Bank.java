package com.prowing.inheritance_join_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SBI_BANK")
public class SBI_Bank extends Bank {
	
	
	
	@Column(name="BRANCHNAME")
	String Branchname;
	@Column(name="IFSCCode")
	String IFSCCODE;
	public String getBranchname() {
		return Branchname;
	}
	public String getIFSCCODE() {
		return IFSCCODE;
	}
	public void setBranchname(String branchname) {
		Branchname = branchname;
	}
	public void setIFSCCODE(String iFSCCODE) {
		IFSCCODE = iFSCCODE;
	}
	@Override
	public String toString() {
		return "SBI_Bank [Branchname=" + Branchname + ", IFSCCODE=" + IFSCCODE + ", BankID=" + BankID + ", bankType="
				+ bankType + "]";
	}
	
	}
	


