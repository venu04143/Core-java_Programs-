package com.assignmentsoncunstructors;

public class Human {
	
	String name;
	
	String color;
	
	char gender;
	
	double height;
	
	double weight;
	

	public Human(String name, String color, char gender, double height, double weight) {

		this.name = name;
		this.color = color;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	public Human(String name, String color, char gender, double height) {
		this("Unkown","brown",'M',5.6,60);
		this.name = name;
		this.color = color;
		this.gender = gender;
		this.height= height;
	}
	public Human(String name, String color, char gender) {
		this("Unkown","brown",'M',5.6);
		this.name = name;
		this.color = color;
		this.gender = gender;
	}
	public Human(String name, String color) {
         this("Unkown","brown",'M');
		this.name = name;
		this.color = color;
	}
	public Human(String name) {
         this("Unkown","Brown");
		this.name = name;
	}
	public Human() {
      this("Unkown");
	}
	
	void display() {
		System.out.println("Human name : "+name);
		System.out.println("Human color : "+color);
		System.out.println("Human gender : "+gender);
		System.out.println("Human height : "+height);
		System.out.println("Human weight : "+weight);
		System.out.println("\n*****************\n");
	
		
	}



	public static void main(String[] args) {
		
		
		Human h1 = new  Human();
		h1.display();
		
		Human h2 = new Human("Venu");
		h2.display();
		
		Human h3 = new Human("Eswar","Red");
		h3.display();
		
		Human h4 = new Human("Vyshu","Black",'F');
		h4.display();
		
		Human h5 = new Human("Harshini","White",'F',4.5,35);
		h5.display();

	}

}
