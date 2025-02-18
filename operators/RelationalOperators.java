package com.operators;

public class RelationalOperators {
	
	public static void main(String[] args) {
	
	                                                // == , != ,< , > , <= , >= 
	int a = 110;
	 
	int b =10;
	 
    // the below name and name1 will store in SCP (String constant pool)
	String name ="Venu Gopal";
	
	String name1 = "Venu Gopal";
	
	String name2 = new String("Venu Gopal");     // the name2 will store in heap with a different address
	
	
	System.out.println(name2.equals(name1));   
	
	System.out.println( a > b );
	
	System.out.println(name == name1);      // == operator always compare primitive types directly with values
	                                        // 
	
	System.out.println(name1 == name2);     // when it comes to object data type which will compare references of the object not the values
	
	System.out.println(name2.equals(name1));   // .equals method always checks the content of the objects
	
	System.out.println(name == name1 || name1 == name2 );
	
   System.out.println(name == name1 && name1 == name2);
   
   byte b1 = 127;
   byte b2 = 124;
   
   Byte b3 =new Byte((byte)127);
   
   System.out.println(b3.equals(b1));
   
  // System.out.println(b3 == b1);
   
   
   
//   System.out.println( b1  + " " + b2);
//   
//   System.out.println( b2 > b1 );
//   
//   System.out.println( b2 < b1 );
//   
//   System.out.println(b1 != b2);
//   
//   System.out.println(b > b2);
//   
//   System.out.println(name != name1);
//   
      short s=21;
//  
     short s1 = 21;
     
     Short s2 = new Short((short)21);
     
     System.out.println(s2.equals(s1));
     
     //System.out.println(s2== s1);
//  
//  System.out.println( s < s1);
//   
//  System.out.println( s > s1);
//  System.out.println( s == s1);
//  System.out.println( s != s1);
//  
//  System.out.println( s <= s1);
//  System.out.println( s >= s1);
//  
//  
     double d = 2.0453;
     double d1 = 2.0452;
     
     Double d2 = new Double(2.0452);
     
     System.out.println(d2.equals(d1));
     
    // System.out.println(d2==d1);
//   
//  System.out.println( d < d1);
//  
//  System.out.println( d > d1);
//  System.out.println( d == d1);
//  System.out.println( d != d1);
//  
//  System.out.println( d <= d1);
//  System.out.println( d >= d1);
//  
//  
//  System.out.println( d < s1);
//  
//  System.out.println( d > s1);
//  System.out.println( d == s1);
//  System.out.println( d != s1);
//  
//  System.out.println( d <= s1);
//  System.out.println( d >= s1);
//   
	int i1=34;
	int i2=34;
	
	Integer i3 = new Integer(34);
	System.out.println(i3 == i2);
//	
//	System.out.println(se==so);
//	
     float f1 = 5.3F;                
     Float  f2 = new Float(5.3F);
     
     System.out.println(f2.equals(f1));
     
//     System.out.println(f1==f2);
     
     /* The == operator works as expected when comparing primitive types,
      *  but f2 is a Float object and f1 is a primitive float. 
      *  In Java, there's a feature called autounboxing, 
      *  which automatically converts an object of wrapper class (like Float) 
      *  to its corresponding primitive type (like float).*/

}
}
