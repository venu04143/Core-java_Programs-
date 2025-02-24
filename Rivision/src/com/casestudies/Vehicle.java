package com.casestudies;

public class Vehicle {
	
	String type;
	
	Vehicle(){
		
	}
	
	Vehicle(String type){
		this.type=type;
	}

}
class Car extends Vehicle{
	
	String brand;
	double speed;
	
	Car(){
		this("BMW",250);
	}
	Car(String brand,double speed){
		super("Car");
		this.brand= brand;
		this.speed=speed;
	}
	Car(String type,String brand,double speed){
		super(type);
		this.brand=brand;
		this.speed=speed;
	}
	void display() {
		System.out.println("Vechile Type : " + super.type);
		System.out.println(super.type+" Brand : "+ brand);
		System.out.println(super.type+" Speed :"+ speed);
		System.out.println("\n**********************\n");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.display();
		
		Car c2 = new Car("Jaguar",235.8);
		c2.display();
		
		Car c3 = new Car("Sports Car","F1",340);
		c3.display();
		
		Bike b1 = new Bike();
		b1.dispaly();
		
		Bike b2 = new Bike("Pulsur",120);
		b2.dispaly();
		
		Bike b3 = new Bike("Kawasaki Ninja H2r",425,7500000);
		b3.dispaly();
	}
}
class Bike extends Vehicle{
	String brand;
	double speed;
	double price;
	
	Bike(){
		this("MT",140,150000);
	}
	
	Bike(String brand,double speed){
		super("Bike");
		this.brand=brand;
		this.speed=speed;
	}
	
	Bike(String brand, double speed, double price) {
		super("Bike");
		this.brand = brand;
		this.speed = speed;
		this.price = price;
	}
	void dispaly() {
		
		System.out.println("Vechile Type : " + super.type);
		System.out.println(super.type+" Brand : "+ brand);
		System.out.println(super.type+" Speed :"+ speed);
		System.out.println(super.type+" Price :"+ price);
		System.out.println("\n**********************\n");
	}
	
	
}
