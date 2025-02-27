package com.assignmentsoncunstructors;

public class Dog {
	
	String dogName;
	String breed;
	String color;
	int age;
	
	

	Dog(String dogName, String breed, String color, int age) {
		this.dogName = dogName;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	Dog(String dogName, String breed, String color) {
		this("Jackee","German","Black",1);
		this.dogName = dogName;
		this.breed = breed;
		this.color = color;
	}
	Dog(String dogName, String breed) {
		this("Jackee","German","Black");
		this.dogName = dogName;
		this.breed = breed;
	}
	Dog(String dogName) {
		this("Jackee","German");
		this.dogName = dogName;
	}
	Dog(){
		this("Jackee");
	}
	


	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.display();
		
		Dog d2 = new Dog("Tiger");
		d2.display();
		
		Dog d3 = new Dog("Nymeria","PitBull");
		d3.display();
		
		Dog d4 = new Dog("Ghost","Huskey","White");
		d4.display();

	}
	void display() {
		System.out.println(dogName);
		System.out.println(breed);
		System.out.println(color);
		System.out.println(age);
		System.out.println("\n***************\n");
	}

}
