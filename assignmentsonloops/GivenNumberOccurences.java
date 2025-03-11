package com.assignmentsonloops;

public class GivenNumberOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4344554;
		int target = 5;
		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem == target) {
				count++;
			}
			num /= 10;
		}
		System.out.println("The number of Occurences of a Given Number is : " + count);
		
		
		int n=11;
		int i=2;
		boolean ans = true;
		while(i<=n/2) {
			if(n%i==0) {
				ans=false;
				break;
			}
			i++;
		}
		if(ans) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number ");
		}

	}

}
