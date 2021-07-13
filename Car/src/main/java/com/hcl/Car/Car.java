package com.hcl.Car;

public class Car {
	
	private int carID;

	private String make;

	private String model;

	private int years;

	private double salesPrice;

	public Car() {
	}

	public Car(int carID, String make, String model, int years, double salesPrice) {
		super();
		this.carID = carID;
		this.make = make;
		this.model = model;
		this.years = years;
		this.salesPrice = salesPrice;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	
}
