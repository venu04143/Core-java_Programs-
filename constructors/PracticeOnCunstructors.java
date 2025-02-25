package com.constructors;

public class PracticeOnCunstructors {
	
	String name;
	int id;
	
	PracticeOnCunstructors(){
		
	}
	
	PracticeOnCunstructors(String name, int id){
		if(name.charAt(0)=='S' ||name.charAt(0)=='R') {
			this.name="Erripuk";
			this.id =id;
			
		}else {
			this.name=name;
			this.id=id;
		}
	}
	

	public static void main(String[] args) {
		
		PracticeOnCunstructors work = new PracticeOnCunstructors("Venu",20);
		System.out.println(work.name);
		System.out.println(work.id);
		
		
		PracticeOnCunstructors task = new  PracticeOnCunstructors("Sai",30);
		
		System.out.println(task.name);
		System.out.println(task.id);
		
		PracticeOnCunstructors prepare= new PracticeOnCunstructors();
		
		prepare.name="Gopal";
		prepare.id=50;
		System.out.println(prepare.name);
		System.out.println(prepare.id);	
		
	}

}
