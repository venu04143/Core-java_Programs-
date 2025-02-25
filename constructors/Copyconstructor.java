package com.constructors;

public class Copyconstructor {
	public static void main(String[] args) {
		Movies m1 = new Movies("NagaChaitanya","Sai pallavi");
	   m1.display();
		
		Movies m2 = new Movies(m1,"Chandu","Alluaravind");
	    m2.display();
	}
}

class Movies{
	
	String hero;
	String heroien;
	String director;
	String producer;
	
//	Movies(String director,String producer,Movies m1){
//		this(m1,"AlluAravind");
//		this.hero=director;
//		this.heroien=producer;
//		
//	}
	Movies(){
		this("Chaiy","Pallavi");
	}
	
	Movies(Movies m,String director){
		this.director= director;
	}
	
	Movies(String hero,String heroien){
          this(hero,heroien,"unkwon","unkwon");
		
	}
	Movies(String hero,String heroien,String director,String producer){
		this.hero=hero;
		this.heroien=heroien;
		this.director=director;
		this.producer=producer;
		
	}
	Movies (Movies m,String director,String producer){
		this.hero=m.hero;
		this.heroien=m.heroien;
		this.producer = producer;
		this.director=director;
		
	}
	void display() {
		System.out.println("Hero Name : "+hero);
		System.out.println("Heroien Name : "+heroien);
		System.out.println("Director Name : "+director);
		System.out.println("Producer Name : "+producer);
		System.out.println("\n******************\n");
	}
	
}