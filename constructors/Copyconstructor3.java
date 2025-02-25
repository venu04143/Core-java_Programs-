package com.constructors;

public class Copyconstructor3 {

	public static void main(String[] args) {
		
		Boll b1 = new Boll();
		b1.display();

		
       VollyBall v1 = new VollyBall();
       v1.display();
       
       VollyBall v2 = new VollyBall("Cisco",760);
       v2.display();
       
       VollyBall v3 = new VollyBall(v2,"8 Months");
       v3.display();
       
       VollyBall v4 = new VollyBall("VollyBall",42.56,"Bladder","SpikeZone","1 Year",1150);
       v4.display();
       
       VollyBall v5 = new VollyBall(v4,"1.5 Year");
       v5.display();
       
       VollyBall v6 = new VollyBall(v5,"BasketBall","Bluckbutor");
       v6.display();
       
       VollyBall v7 =new VollyBall(v6,1670);
       v7.display();
       
       Boll b2 = new Boll("Rubby",32.35,"Bladder");
       b2.display();
       
       VollyBall v8 = new VollyBall(b2,"Hockey");
       v8.display();
       
       
       
       VollyBall v9 = new VollyBall("Azure","5 months",650);
       
       Boll b3=new Boll("Throw",5.7,"Bladder");
       
       VollyBall v10 = new VollyBall(b3,v9);
       v10.display();
	}

}
class Boll{
	
	String name;
	double radious;
	String type;
	
	Boll(){
		this("Cricket ball");
	}
	
	Boll(String name){
		this(name,2.45);
		this.name=name;
	}
	Boll(String name, double radious){
		this(name,radious,"Rubber");
		this.name= name;
		this.radious=radious;
		
	}
	Boll(String name,double radious,String type){
		this.name=name;
		this.radious=radious;
		this.type=type;
	}
	void display() {
		System.out.println(name);
		System.out.println(radious);
		System.out.println(type);
		System.out.println("\n****************************\n");

	}
}
class VollyBall extends Boll{
	
	String companyName;
	String guaranty;
	double cost;
	
	VollyBall(){
		this("nivia",450);
	}
	VollyBall(String companyName,double cost){
		this(companyName,"3 Months",450);
		this.companyName=companyName;
		this.cost=cost;
	}
	
	VollyBall(String companyName, String guaranty, double cost) {
		
		this.companyName = companyName;
	    this.guaranty = guaranty;
		this.cost = cost;
	}
	VollyBall(Boll b,String name){
		this.name  = name;
		this.radious=b.radious;
		this.type=b.type;
	}
	VollyBall(VollyBall obj,String guaranty) {
		
		this.guaranty= guaranty;
		this.companyName=obj.companyName;
		this.cost=obj.cost;
		this.name=obj.name;
		this.type=obj.type;
		this.radious=obj.radious;
		
		
	}
   VollyBall(VollyBall obj,double cost) {
		
		this.guaranty= obj.guaranty;
		this.companyName=obj.companyName;
		this.cost=cost;
		this.name=obj.name;
		this.type=obj.type;
		this.radious=obj.radious;
		
		
	}
   VollyBall(VollyBall obj,String name,String companyName) {
	
	this.guaranty=obj. guaranty;
	this.companyName=companyName;
	this.cost=obj.cost;
	this.name=name;
	this.type=obj.type;
	this.radious=obj.radious;
	
	
}
    VollyBall(VollyBall obj,String type,double radious) {
	
	this.guaranty= obj.guaranty;
	this.companyName=obj.companyName;
	this.cost=obj.cost;
	this.name=obj.name;
	this.type=type;
	this.radious=radious;
	
	
}
    
	
	VollyBall(String name,double radious,String type,String companyName, String guaranty, double cost) {
		super(name,radious,type);
		this.companyName = companyName;
	    this.guaranty = guaranty;
		this.cost = cost;
	}
	
	VollyBall(Boll obj, VollyBall obj1){
		this.name=obj.name;
		this.radious=obj.radious;
		this.type=obj.type;
		
		this.companyName=obj1.companyName;
		this.guaranty=obj1.guaranty;
		this.cost=obj1.cost;
	}
	@Override
	void display() {
		System.out.println(name);
		System.out.println(radious);

		System.out.println(type);

		System.out.println(companyName);

		System.out.println(guaranty);
		System.out.println(cost);
		System.out.println("\n****************************\n");

		
		
	}
	
	
}
