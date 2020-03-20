package com.bal.sqlserverdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Address")
public class Address {

	@Id
	private Integer c_Id;
	private String address;
	public Integer getC_Id() {
		return c_Id;
	}
	public void setC_Id(Integer c_Id) {
		this.c_Id = c_Id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
