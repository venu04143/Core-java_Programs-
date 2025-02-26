package com.assignmentsoncunstructors;

public class Bottle {
	
	String type;
	String color;
	double width;
	double height;
	
	Bottle(){
		this("Plastic");
	}
	Bottle(String Type){
		this("Brown",12.3);
		type = Type;	
	}
	Bottle(String Color, double Width){
		this(3.4,6.8);
		color =Color;
		width = Width;
	}
	Bottle(double Width,double Height){
		this("Pink",34,22);
		width= Width;
		height= Height;
	}
	Bottle(String Color ,double Width,double Height){
		this("Wood","Brown",12.3,20);
		Color = color;
		width=Width;
		height = Height;
	}
	Bottle(String Type, String Color, double Width,double Height){
		
		type = Type;
		color = Color;
		Width = width;
		Height=height;
		
	}
	
	void display() {
		System.out.println("Bottle type : "+ type);
		System.out.println("Bottle Color : "+ color);
		System.out.println("Bottle Width : "+ width);
		System.out.println("Bottle Height : "+ height);
		System.out.println("\n********************\n");
	}
	
	
	

	public static void main(String[] args) {
		
		Bottle b1 = new Bottle();
		b1.display();
		
		Bottle b2 = new Bottle("Blue",20.34);
		b2.display();
		
		

	}

}
