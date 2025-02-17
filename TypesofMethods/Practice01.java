package TypesofMethods;

public class Practice01 {

	public static void main(String[] args) {
		byte b1=34;
		byte b2= 34;
		
		Practice01 obj = new Practice01();
		obj.method1(b1,b2);    // for both  two methods 1  & 2 we can't pass values directly because those method arguments are byte data type 
		obj.method2(b1, b2);    // and short data type so if we pass number directly it consider  as integer so int can not convert to low data type until we specify
		
		obj.method3(10,10);
		obj.method4(20, 20);
		obj.method5("Onitipuli","VenuGopal");
		obj.method6('\u0040','\u0067');

	}
	void method1(byte b ,byte c) {
		byte d = (byte) (b+c);
		System.out.println(d);
	}
	void method2(short a, short b) {
		short s =  (short) (a+b);                  // by default whatever the number in right consider as integer (so we have to covert it into short)
		System.out.println(s);
	}
	void method3(int a, int b) {
		int c =a+b;
		System.out.println(c);
	}
	void method4(long a, long b) {
		
		long c =a+b;
		System.out.println(c);
	}
	void method5(String surname,String name) {
		String fulname=surname +" "+  name;
		System.out.println(fulname);
	}
	void method6(char c ,char c1) {
		char c2 = (char) (c+c1);
		System.out.println(c2);
	}
	void method7(boolean b, boolean b1) {
		//boolean t =b+b1; The operator + is undefined for the argument type(s) boolean, boolean
	}
	
}



