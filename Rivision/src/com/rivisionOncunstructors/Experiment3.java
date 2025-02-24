package com.rivisionOncunstructors;

public class Experiment3 {
	
	int x;
	int y;
	
	Experiment3(){
		
	}
	Experiment3(int x, int y){
		x = this.x;
		y=this.y;
	}
	@Override
	public String toString() {
		return "x ="+x +"  y = "+y+"";
		
	}

	public static void main(String[] args) {
		
		Experiment3 ex =new Experiment3(20,30);
		System.out.println(ex);
		
		
	}

}
