package com.kh.practice.model;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return super.toString() + "너비 : " + width + ", 높이 : " + height + " / ";
	}
	
	@Override
	public String draw() {
		return super.toString() + "너비 : " + width + ", 높이 : " + height + " / ";
	}
}
