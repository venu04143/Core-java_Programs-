package com.introduction;

public class TestDemo2 {
	
	
	
	public static void main(String[] args) {
		
		TestDemo2 t2= new TestDemo2();
		
		
		System.out.println("Main Method ");      //as per ChatGpt o/p: Static Block
				                                 //                    Instance Block
	}                                            //                    Instance Block
	                                             //                    Main Method		
	 static {                                    //  Static Blocks runs first because it is executed when the class is first loaded by the JVM 
		 System.out.println("Static Block");     //  (prior to any method or instance creation).
		                           
		}                                        //  Instance Blocks runs each time when an instance is created 
	 
		                                         //  Main Method runs last, after the static initialization and instance creations have completed.
		{
			
			System.out.println("Instance Block");
		}
		
	static {
		System.out.println("Static Block 2 Called");
	}
	{
		System.out.println("Instance method 2 called");
	}

	

}
