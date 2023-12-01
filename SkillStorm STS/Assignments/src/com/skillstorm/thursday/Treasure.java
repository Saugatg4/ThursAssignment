package com.skillstorm.thursday;

public class Treasure {
	
	private String name;

    private String description;

    private double value; // worth in dollars
    
    public Treasure() {
    	// default values
    	this.name = "";
    	this.description = "";
    	this.value = 0.0;
    }
    
    public Treasure(String name, String description, double value) {
    	this.name = name;
    	this.description = description;
    	this.value = value;
    	
    	 }
    
    public String getName() {
    	return name;
    }

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
    
	public String toString() {
		return String.format("%s worth $%.2f", description, value );
	}

}
