package com.codegnan.javaapp09022026.nonmathematics.shape;


import com.codegnan.javaapp09022026.shape.Shape;

public class Heart extends GeneralShape implements Shape{
	
	@Override
	public void fillColor(){
		System.out.println("colour filled");
	}
	
	@Override
	public void draw(){
		System.out.println("drawing completed");
	}
	
	@Override
	public void displayShapeInfo(){
		System.out.println("heart is drawn");
		
	}
}
	