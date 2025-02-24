package com.rivisionOncunstructors;

public class Experiment1 {
	
	Experiment1(int x){
      System.out.println("Parent Constructor called."+x);
	}

}
class Experiment2 extends Experiment1{
	Experiment2(int x){
		super(x);
		System.out.println("Child Constructor Called."+ x);
	}
	public static void main(String[] args) {
		Experiment2 ex =new Experiment2(200);
		
	}
}
