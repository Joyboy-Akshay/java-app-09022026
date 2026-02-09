package com.codegnan.javaapp09022026.mathematics.threedshapes;

import com.codegnan.javaapp09022026.mathematics.shapes.ThreeDshapes;

public class Cube extends ThreeDshapes{
	int side;
	public Cube(int area){
		this.side=side;
	}
	
	@Override
	public int calculateSurfaceArea(){
		int SurfaceArea = 6*(side*side);
		return SurfaceArea;
	}
	
	@Override
	public int calculateVolume(){
		int volume = side*side*side;
		return volume;
	}
	
	@Override
	public void displayShapeInfo(){
		System.out.println("side of cube :"+side);
		
	}
	
}
		