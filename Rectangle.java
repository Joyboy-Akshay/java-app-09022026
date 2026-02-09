package com.codegnan.javaapp09022026.mathematics.twodshapes;

import com.codegnan.javaapp09022026.mathematics.shapes.TwoDShapes;
import com.codegnan.javaapp09022026.shape.Shape;

public class Rectangle extends TwoDShapes implements Shape{
	int length;
	int width;
	public Rectangle(int length , int width){
		this.length=length;
		this.width=width;
		
	}
	

		
	@Override
	public int calculateArea(){
		
		int area = (length*width);
		return area;
	}
	@Override
	public int calculatePerimeter(){
		int perimeter = 2*(length+width);
		return perimeter;
	}
	
	@Override
	public void displayShapeInfo(){
		System.out.println("lenght of rectangle :"+length);
		System.out.println("width of rectangle :"+width);
	}
}
		
		