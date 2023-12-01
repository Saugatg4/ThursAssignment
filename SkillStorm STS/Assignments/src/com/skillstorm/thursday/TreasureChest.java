package com.skillstorm.thursday;

import java.util.Arrays;

public class TreasureChest {

	private double weightInLbs;

	private double height;

	private double length;

	private double width;

	private boolean isLocked;

	private Treasure[] contents;

	public TreasureChest() {
	
		this.weightInLbs = 0;
		this.height = 0;
		this.length = 0;
		this.width = 0;
		this.isLocked = false;
		this.contents = new Treasure[0];


	}

	public TreasureChest(double weightInLbs, double height, double length, double width, 
			boolean isLocked, Treasure[] contents ) {

		this.weightInLbs =weightInLbs;
		this.height = height;
		this.length = length;
		this.width = width;
		this.isLocked = isLocked;
		this.contents = contents;

	}

	public double getWeightInLbs() {
		return weightInLbs;
	}

	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean Locked) {
		isLocked = Locked;
	}

	public Treasure[] getContents() {
		return isLocked ? null : contents;
	}

	public void setContents(Treasure[] contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return String.format("The %.1f\" x %.1f\" x %.1f\" treasure chest weighs %.1flbs and is %s.",
                length, width, height, weightInLbs, isLocked ? "locked" : "unlocked");
	}
	
	
}
