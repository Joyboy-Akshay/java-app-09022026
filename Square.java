package com.codegnan.javaapp09022026.mathematics.twodshapes;

import com.codegnan.javaapp09022026.mathematics.shapes.TwoDShapes;

import com.codegnan.javaapp09022026.shape.Shape;

public class Square extends TwoDShapes implements Shape{
	int side;
	
	public Square(int side){
		this.side=side;
		
	}
	@Override
	public int calculateArea(){
		
		int area = (side*side);
		return area;
	}
	
	@Override
	public int calculatePerimeter(){
		int perimeter = (4)*(side);
		return perimeter;
	}
	
	@Override
	public void displayShapeInfo(){
		System.out.println("side of shape :"+side);
		
	}
}
	