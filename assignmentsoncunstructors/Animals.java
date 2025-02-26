package com.assignmentsoncunstructors;

public class Animals {
	
	String name;
	
	String voice;
    
	double height;
	
	double weight;
	
	

	Animals(String name, String voice, double height, double weight) {
        
		this.name = name;
		this.voice = voice;
		this.height = height;
		this.weight = weight;
	}
	Animals(String name, String voice, double height) {
		this("Goat","chedik",13.5,30);
		this.name = name;
		this.voice = voice;
		this.height = height;
	}
	Animals(String name, String voice) {
		this("Goat","salam",135,20);
		this.name = name;
		this.voice = voice;
	}
	Animals(String name) {
		this("Goat","oops",15,10);
		this.name = name;
	}
	Animals(){
		this("Goat","mehmeh",13.5,30);
		
	}
	
	void display() {
		System.out.println(name);
		System.out.println(voice);
		System.out.println(height);
		System.out.println(weight);
		System.out.println("\n********************\n");
	}



	public static void main(String[] args) {
		
		Animals a1 = new Animals();
		a1.display();
		
		Animals a2 = new Animals("Cat");
		a2.display();
		
		Animals a3 = new Animals("Dog","Bow Bow");
        a3.display();
        
        Animals a4 = new Animals("Monkey","Girr Girr",34);
        a4.display();
        
        Animals a5 = new Animals("Cattle","Ambha Ambha",45,67);
        a5.display();
        
        
	}

}
