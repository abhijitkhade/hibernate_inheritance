package com.prowing.inheritance_tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student extends Person {
	
	
	
	@Column(name="GRADE")
	String grade;
	
	@Column(name="FEES")
	int fees;
	
	public String getGrade() {
		return grade;
	}
	public int getFees() {
		return fees;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", fees=" + fees + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
