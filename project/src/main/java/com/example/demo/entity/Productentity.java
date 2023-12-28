package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Productentity {
	@Id
	private int groceryid;
	private String groceryname;
	private String grocerytype;
	private int manufacturedate;
	private int expirationdate;
	public int getGroceryid() {
		return groceryid;
	}
	public void setGroceryid(int groceryid) {
		this.groceryid = groceryid;
	}
	public String getGroceryname() {
		return groceryname;
	}
	public void setGroceryname(String groceryname) {
		this.groceryname = groceryname;
	}
	public String getGrocerytype() {
		return grocerytype;
	}
	public void setGrocerytype(String grocerytype) {
		this.grocerytype = grocerytype;
	}
	public int getManufacturedate() {
		return manufacturedate;
	}
	public void setManufacturedate(int manufacturedate) {
		this.manufacturedate = manufacturedate;
	}
	public int getExpirationdate() {
		return expirationdate;
	}
	public void setExpirationdate(int expirationdate) {
		this.expirationdate = expirationdate;
	}
	public Productentity(int groceryid, String groceryname, String grocerytype, int manufacturedate,
			int expirationdate) {
		super();
		this.groceryid = groceryid;
		this.groceryname = groceryname;
		this.grocerytype = grocerytype;
		this.manufacturedate = manufacturedate;
		this.expirationdate = expirationdate;
	}
	public Productentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
