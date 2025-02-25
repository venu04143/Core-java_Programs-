package com.constructors;

public class University {

	public static void main(String[] args) {
		Lecture l1= new Lecture();
		l1.display();
		l1.show();
		Collage c1= new Collage(16257,"SRI","CPT");
		Lecture l2 = new Lecture(102,"Pranay","SQL");
		l2.display();
		c1.show();
	}

}

class Collage {

	int collageId;
	String collageName;
	String collageAddr;

	Collage() {
		this(2090);
	}

	Collage(int collageId) {

		this(collageId, "Vcube");

		this.collageId = collageId;
	}

	Collage(int collageId, String collageName) {
        this(collageId,collageName,"HYDRABAD");
		this.collageId = collageId;
		this.collageName = collageName;

	}

	Collage(int collageId, String collageName, String collageAddr) {

		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddr = collageAddr;
	}
	void show() {
		System.out.println(collageId);
		System.out.println(collageName);
		System.out.println(collageAddr);
	}
}

class Lecture extends Collage{

	int lecId;
	String lecName;
	String lecSubject;
	double lecSal;
	long lecMobile;
	
	Lecture(){
		this(101);
	}
	Lecture(int lecId){
		this(lecId,"VenuGopal");
		this.lecId=lecId;
	}
	Lecture(int lecId ,String lecName){
		this(lecId,lecName,"JAVA");
		this.lecId=lecId;
		this.lecName=lecName;
		
	}
	Lecture(int lecId ,String lecName,String lecSubject){
		this(lecId,lecName,lecSubject,25000);
		this.lecId=lecId;
		this.lecName=lecName;
		this.lecSubject=lecSubject;
		
	}
	Lecture(int lecId ,String lecName,String lecSubject,double lecSal){
		this(lecId,lecName,lecSubject,25000,630055);
		this.lecId=lecId;
		this.lecName=lecName;
		this.lecSubject=lecSubject;
		this.lecSal=lecSal;
		
	}
	Lecture(int lecId ,String lecName,String lecSubject,double lecSal,long  lecMobile){
		this(lecId,lecName,lecSubject,lecSal,lecMobile,2090,"VCUBE","HYDRABAD");
		this.lecId=lecId;
		this.lecName=lecName;
		this.lecSubject=lecSubject;
		this.lecSal=lecSal;
		this.lecMobile=lecMobile;
	}
	Lecture(int lecId ,String lecName,String lecSubject,double lecSal,long  lecMobile,int collageId,String collageName,String collageAddr){
		super(collageId,collageName,collageAddr);
		this.lecId=lecId;
		this.lecName=lecName;
		this.lecSubject=lecSubject;
		this.lecSal=lecSal;
		this.lecMobile=lecMobile;
	}
	void display() {
		System.out.println(lecId);
		System.out.println(lecName);
		System.out.println(lecSubject);
		System.out.println(lecSal);
		System.out.println(lecMobile);
	}
	
}
