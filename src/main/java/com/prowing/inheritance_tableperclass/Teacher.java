package com.prowing.inheritance_tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")
public class Teacher extends Person {
	
	@Column(name="YEAR_OF_EXP")
	int yearOfExperince;
	
	@Column(name="SALLARY")
	int sallary;
	
	public int getYearOfExperince() {
		return yearOfExperince;
	}
	public int getSallary() {
		return sallary;
	}
	public void setYearOfExperince(int yearOfExperince) {
		this.yearOfExperince = yearOfExperince;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return "Teacher [yearOfExperince=" + yearOfExperince + ", sallary=" + sallary + ", id=" + id + ", name=" + name
				+ "]";
	}

	
}
