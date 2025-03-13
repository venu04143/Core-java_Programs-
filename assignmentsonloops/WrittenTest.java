package com.assignmentsonloops;

public class WrittenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/* 1.*/	for(int i=0,j=5;i<j;i++,j--) {
		
			System.out.println(i + " "+ j);
			
		   }
		
		
		
	/* 2.*/	for(int i= 0;i<10;i+=(i%2==0)?1:2) {
		
			System.out.println(i);
			
		   }
		
		
		
        
// /* 3.*/	for(int i= 0;i<5;) {
//			System.out.println(i);
//			if(i%2==0) {
//				continue;                        it would cause infinite loop because of continue
//			}
//			i++;
//		}
		
		
		
		
/* 4.*/	int i =1;
		do {
			System.out.println(i);
			if(i==3)break;
			i++;
		}while(i<5);
		
		
		
 /* 5.*/   int j=0;
           for( ; ; ) {
    	      System.out.println(j);
    	      j++;
    	      if(j==5) {
    		    break;
    	      }
    	   
           }
           
    
       

	}

}
