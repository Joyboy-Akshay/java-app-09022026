package com.codegnan.javaapp09022026.mathematics.threedshapes;

import com.codegnan.javaapp09022026.mathematics.shapes.ThreeDshapes;

public class Sphere extends ThreeDshapes{
	int radius;
	
	public Sphere(int radius){
		this.radius=radius;
	}
	
	@Override
	public int calculateSurfaceArea(){
		int SurfaceArea = (int) (4*(3.14159265359)*(radius*radius));
		return SurfaceArea;
	}
	
	@Override
	public int calculateVolume(){
		int volume = (int)((4/3)*(3.14159265359)*(radius*radius*radius));
		return volume;
	}
	
	@Override
	public void displayShapeInfo(){
		System.out.println("radius of shpere :"+radius);
		
	}
	
}