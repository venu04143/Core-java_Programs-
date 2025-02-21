package com.constructors;

public class Animal {
	
	String name;
	 
	Animal(){
		this("Lion");
		
	}
	Animal(String name){
		this.name=name;
	}
	

}
class Dog extends Animal{
	
	String breed;
	
	Dog(){
		this("German");
	}
	Dog(String breed){
		this("jackey",breed);
		this.breed=breed;
		
	}
	Dog(String name, String breed){
		super(name);
		this.breed=breed;
	}
	void display() {
		System.out.println("Dog name : "+name);
		System.out.println("Dog Breed : "+breed);
		System.out.println("\n***************\n");
		
	}
public static void main(String[] args) {
		
	   System.out.println(2^31);
		Dog d1 = new Dog();
		d1.display();
		Dog d2 = new Dog("Tiger","Pitbull");
		d2.display();
		Dog d3 = new Dog("Huskey");
		d3.display();
				
	}
	
}
