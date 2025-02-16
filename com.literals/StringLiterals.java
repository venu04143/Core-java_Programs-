package com.literals;

public class StringLiterals {

	public static void main(String[] args) {
       
		String s ="Venu Gopal";   // String literals are store in String constant pool
		
		String s1 = new String("Venu Gopal"); // String Object
		
        System.out.println(s==s1); 
        
        System.out.println(s1.equals(s)); 
	}

}
