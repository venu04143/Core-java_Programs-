package com.datatypes;

import java.math.BigInteger;

public class PredefinedObjectDatatypes {
	
	String S = "Venu";
	String S1=new String("Gopal");
	
	BigInteger B=new BigInteger("1234");
    BigInteger B1=new  BigInteger("1234");
    

	public static void main(String[] args) {
		
		PredefinedObjectDatatypes data =new PredefinedObjectDatatypes();
		
         System.out.println(data.S+data.S1);
         System.out.println(data.B.add(data.B1));
      
        
	}
	

}
