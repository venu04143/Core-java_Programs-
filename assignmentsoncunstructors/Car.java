package com.assignmentsoncunstructors;

public class Car {
	
	String brand;
	
	String model;
	
	String color;
	
	double horsePower;
	
	double milege;
	
	
	public Car(String brand, String model, String color, double horsePower, double milege) {
		System.out.println("5th parameter called...");
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
		this.milege = milege;
	}


	Car(String brand, String model, String color, double horsePower) {
		
        this("Porche","Panamera","Black",1550,23.5);
        System.out.println("4th parameter called...");
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;

	}
	Car(String brand, String model, String color) {
		
        this("NISSAN","G T R","Indigo",1500);
        System.out.println("3rd parameter called...");
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	Car(String brand, String model) {
		
        this("Lamborghini","Temerario","Yellow");
        
        System.out.println("2nd parameter called...");
		this.brand = brand;
		this.model = model;
		
	}
	
	Car(String brand) {
		
		this("Ferrari","Ferrari-Fs-20");
        System.out.println("1st parameter called...");
		this.brand = brand;
		
	}
	
	Car(){
		
		this("Ambassador");
		System.out.println("no-arg constructor called...\n");
		
	}
	
	void dispaly() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(color);
		System.out.println(horsePower);
		System.out.println(milege);
		System.out.println("\n*****************\n");
	}



	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.dispaly();
		
		Car c2 = new Car("Suzuki");
		c2.dispaly();
		
		Car c3 = new Car("Tayota","Tetla");
		c3.dispaly();
		
		Car c4 = new Car("Benz","Bullet","Orange");
		c4.dispaly();
		
		Car c5 = new Car("Jaguar","jaguar-x3","Black",1230);
		c5.dispaly();
		
		Car c6 = new Car("TaTa","NaNo","Blue",260.50,40);
		c6.dispaly();
	}

}
