package com.prowing.inheritance_single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIKE")
@DiscriminatorValue ("BIKE")

public class Bike extends Vehical {
	@Column(name="NOOfWHEEl")
	int noOfWheels;
	
	

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [noOfWheels=" + noOfWheels + ", id=" + id + ", name=" + name + "]";
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	

}
