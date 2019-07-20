package com.jspiders.pkg1;

public class Triangle {
	
	private int height;
	private String type;
	
	public Triangle(String type,int height){
		this.type=type;
		this.height=height;
	}
	public Triangle(String type){
		this.type=type;
	}
	public Triangle(int height){
		this.height=height;
	}
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void draw() {
		System.out.println(getType()+" Triangle is Drawn of Height"+getHeight());
	}

}