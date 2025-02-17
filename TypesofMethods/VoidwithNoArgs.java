package TypesofMethods;

public class VoidwithNoArgs {

	public static void main(String[] args) {
		
		VoidwithNoArgs methods = new VoidwithNoArgs();
		methods.addition();
		
		addition1();
		
		methods.substract();
		substract1();
		

	}
	// instance method with void type and with no arguments
	
	public void addition() {
		int a = 100;
		int b= 200;
	    System.out.println("Addition :" +(a+b));
	}
	
	// static method with void type and with no args;
	
	static void addition1() {
		
		int a = 10;
		int b= 20;
	    System.out.println("Addition :" +(a+b));
		
	}
	// instance method 
	void substract() {
		int a = 100;
		int b= 50;
		System.out.println(a-b);
	}
	// static method
	static void substract1() {
		int a = 10;
		int b= 5;
		System.out.println(a-b);
	}

}
