package com.fundamentals;

public class DataTypes {
	
	byte b= 34;                 //default-->0
	 
   short s= 32767;               //default -->0
   
   int i=63;                   //default -->0
   
   long l=123456786543L;       //default -->0
   
   char c ='M';                //default --> a space like []
	
   float f=12.234567456F;      //default -->0.0
   
   double d=12.234567456;      //default -->0.0
   
   boolean B;                     //default --> false
	

	public static void main(String[] args) {
		
		                                              // data type are two types 1)primitive data types
                                                       //                         2)object data types or non- primitive data types
	DataTypes data =new  DataTypes();
	
	System.out.println("Byte value : " + data.b);
	
	System.out.println("Short value : " + data.s);
	
	System.out.println("Int Value : " + data.i);
	
	System.out.println("Long value : " +data.l );
	
	System.out.println("Char value : "+ data.c);
	
	System.out.println("Float value : " + data.f);    // if we want to represent a limit decimal points(like 6 to 7) then we use float data type
	
	System.out.println("Double value :" + data.d);    // if we want to represent all decimal points of value then we use double
	
	System.out.println("Boolean Value : " + data.B);
	
	
	char ch = 100;
	System.out.println(ch);                      // we can store integers value in char data type..
	                                            // it internally converts the given integer to character based on ASCII values.
	                                                
	int n ='c';
	System.out.println(n);                     // we can store the Single Characters in int data type ...
	                                           // based on ASCII values it converts char to integer value
	
	    // byte b1 = 234                    // everything that left side of byte,short,int,long value considered as integer; 
	
	              /*long l1 = 'c';
	               byte b2= 'D';      ASCII values will store;
	               short s2 = 'S';*/
	}                                 
	
	
	
	
}