package com.prowing.inheritance_join_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="BANK")
@Inheritance(strategy = InheritanceType.JOINED)

public class Bank {
	@Id
	@Column(name="BANK_ID")
	int BankID;
	
	@Column(name="BANK_TYPE")
	
	String bankType;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankID, String bankType) {
		super();
		this.BankID = bankID;
		this.bankType = bankType;
	}
	@Override
	public String toString() {
		return "Bank [BankID=" + BankID + ", bankType=" + bankType + "]";
	}
	public int getBankID() {
		return BankID;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankID(int bankID) {
		BankID = bankID;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	

}
