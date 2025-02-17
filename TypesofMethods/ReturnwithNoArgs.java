package TypesofMethods;

public class ReturnwithNoArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnwithNoArgs RwnA = new ReturnwithNoArgs();
		
		System.out.println(RwnA.add());
		System.out.println(add1());

		System.out.println(RwnA.Name());
		
		System.out.println(name1());
		
	}

	// instance method with return type and No arguments
	int add() {

		int a = 100;
		int b = 50;
		return a + b;
	}

	// static method with return type and no arguments

	static int add1() {

		int a = 5;
		int b = 3;
		return a + b;
	}

	// instance method

	 String Name() {		
		String name="Venu";
		
		return name;
		
	}
	static String name1() {
		
		String name="Gopal";
		
		return name;
	}

}
