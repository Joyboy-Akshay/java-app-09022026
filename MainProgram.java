package com.codegnan.javaapp09022026.program;

import com.codegnan.javaapp09022026.mathematics.twodshapes.Rectangle;
import com.codegnan.javaapp09022026.mathematics.twodshapes.Square;
import com.codegnan.javaapp09022026.mathematics.threedshapes.Sphere;
import com.codegnan.javaapp09022026.mathematics.threedshapes.Cube;
import com.codegnan.javaapp09022026.nonmathematics.shape.Heart;
import com.codegnan.javaapp09022026.nonmathematics.shape.Arrow;

class MainProgram{
	public static void main(String[] args){
		
		Rectangle rectangle = new Rectangle(2,3);
		Square square = new Square(4);
		Cube cube = new Cube(4);
		Sphere sphere = new Sphere(6);
		
		int areaSquare = square.calculateArea();
		int perimeterSquare = square.calculatePerimeter();
		
		
		System.out.println(areaSquare);
		System.out.println(perimeterSquare);
		square.displayShapeInfo();
		
		int areaRectangle=rectangle.calculateArea();
		int perimeterRectangle = rectangle.calculatePerimeter();
		

		
		System.out.println(areaRectangle);
		System.out.println(perimeterRectangle);
		rectangle.displayShapeInfo();
		
		int surfaceAreaOfSphere=sphere.calculateSurfaceArea();
		int volumeOfSphere = sphere.calculateVolume();
		
		
		System.out.println(surfaceAreaOfSphere);
		System.out.println(volumeOfSphere);
		sphere.displayShapeInfo();
		
		int surfaceAreaOfCube=cube.calculateSurfaceArea();
		int volumeOfCube = cube.calculateVolume();
		
		
		System.out.println(surfaceAreaOfCube);
		System.out.println(volumeOfCube);
		cube.displayShapeInfo();
		
		Heart heart = new Heart();
		Arrow arrow = new Arrow();
		
		arrow.fillColor();
		arrow.draw();
		arrow.displayShapeInfo();
		
		heart.fillColor();
		heart.draw();
		heart.displayShapeInfo();
		
		
		
		
	}
	
}
		