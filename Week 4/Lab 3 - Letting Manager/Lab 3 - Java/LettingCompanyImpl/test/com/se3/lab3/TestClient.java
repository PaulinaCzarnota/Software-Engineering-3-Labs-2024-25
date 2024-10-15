package com.se3.lab3;

public class TestClient {

	public static void main(String[] args) {
		Apartment ap1 = new Apartment("1A");
		Apartment ap2 = new Apartment("1B");
		Apartment ap3 = new Apartment("1C");
		Apartment ap4 = new Apartment("1D");
		Apartment ap5 = new Apartment("1E");
		Apartment ap6 = new Apartment("1F");

		Property p1 = new Property("p1");
		Property p2 = new Property("p2");

		LettingCompany l1 = new LettingCompany("l1");

		ap1.setMonthlyRent(400);
		ap2.setMonthlyRent(500);
		ap3.setMonthlyRent(600);
		ap4.setMonthlyRent(700);
		ap5.setMonthlyRent(800);
		ap6.setMonthlyRent(900);

		p1.addApartment(ap1);
		p1.addApartment(ap2);
		p1.addApartment(ap3);

		p2.addApartment(ap4);
		p2.addApartment(ap5);
		p2.addApartment(ap6);

		l1.addProperty(p1);
		l1.addProperty(p2);

		System.out.println(l1.computeTotalMonthlyRent());
	}
}
