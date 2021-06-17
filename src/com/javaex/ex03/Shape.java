package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor;
	protected String LineColor;
	
	
	//생성자 
	public Shape() {
		
	}
	
	public Shape(String fillColor, String LineColor) {
		this.fillColor = fillColor ;
		this.LineColor = LineColor;
	}
	

	
	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		this.LineColor = lineColor;
	}

	//메소드 일반 
	
	
}

