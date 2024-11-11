package com.se3.lab3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LettingCompany {
	private String name;
	private List<Property> properties = new ArrayList<Property>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public LettingCompany(String _name) {
		this.name = _name; 
	}
	
	public void addProperty(Property property){
		properties.add(property);
	}
	
	public double computeTotalMonthlyRent() {
		double rent = 0;

		for (Property property : properties) {
			rent += property.computeMonthlyRent();
		}
		
		return rent;
	}
}
