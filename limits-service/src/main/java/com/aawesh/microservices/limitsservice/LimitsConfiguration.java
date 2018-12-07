package com.aawesh.microservices.limitsservice;

public class LimitsConfiguration {
	private int maxium;
	private int minimum;
	
	public LimitsConfiguration() {
		super();
	}
	
	public LimitsConfiguration(int maxium, int minimum) {
		super();
		this.maxium = maxium;
		this.minimum = minimum;
	}
	
	public int getMaxium() {
		return maxium;
	}
	public void setMaxium(int maxium) {
		this.maxium = maxium;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
