package com.qa.shoes.domain;

public class Shoes {

	private String shoeName;
	private String brand;
	private String colour;
	private int size;

	public Shoes() {
		super();
	}

	public Shoes(String shoeName, String brand, String colour, int size) {
		super();
		this.shoeName = shoeName;
		this.brand = brand;
		this.colour = colour;
		this.size = size;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
