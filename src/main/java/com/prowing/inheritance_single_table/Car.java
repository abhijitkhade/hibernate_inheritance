package com.prowing.inheritance_single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
@DiscriminatorValue ("CAR")

public class Car extends Vehical {
	
	@Column(name="NOOfWHEEl")
	int noOfWheels;
	
	@Column(name="STEERINGTYPE")
	String steeringType;
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public String getSteeringType() {
		return steeringType;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public void setSteeringType(String steeringType) {
		this.steeringType = steeringType;
	}
	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", steeringType=" + steeringType + ", id=" + id + ", name=" + name
				+ "]";
	}
	

}
