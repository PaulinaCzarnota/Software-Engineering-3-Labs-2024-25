package com.se3.lab3;

public class Apartment {
	private String aptNumber;
	private double monthlyRent;
	private boolean occupied;

	public String getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}

	public double getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Apartment(String _aptNumber) {
		this.aptNumber = _aptNumber;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
}
