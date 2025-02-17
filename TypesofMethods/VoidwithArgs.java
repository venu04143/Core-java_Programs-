package TypesofMethods;

public class VoidwithArgs {

	public static void main(String[] args) {
	
		VoidwithArgs method = new VoidwithArgs();
		
		method.multiplication(3.5f,3);
		
		multiplication1(3.5f,3);
		
		method.division(5.5f, 3);
		division1(6.2f,2);
		

	}
	// instance method with type void and arguments
	public void multiplication(float f, int i) {
		
		i = (int)(f*i);                                   //explicit type casting
		System.out.println(" multiplication :"+ i);
	}
	
	//static method with type void and arguments
	static void  multiplication1(float a, int b) {
		
		a= a*b;
		
		System.out.println(a);
		
	}
	
	public void division(float f , int i) {
		
		f=f/i;
		
		System.out.println(f);
		
    //  i=i/f;          Type mismatch: cannot convert from float to int
		
		i = (int)(f/i);  // type casting
		
		System.out.println(i);
			
	}
	
	static void division1(float f, int i  ) {
		
		f = f/i;
		System.out.println(f);
		
		f=i/f;
		
		System.out.println(f);
		
//		i = f/i ;                     Type mismatch: cannot convert from float to int
		
		i= (int)(f/i);
		System.out.println(i);
		
		i= (int)(i/f);
		System.out.println(i);
	}

}
