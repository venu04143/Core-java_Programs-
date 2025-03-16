package com.casestudies;

import java.util.Arrays;
import java.util.Scanner;
/*1. Scenario: in a school 
 *   * A Class room has 7 rows of bench
 *   * Each bench has 3 Students
 *   * Assign marks to each student in an examination
 *   * Calculate the total Marks for Each bench
 *   find the Average marks per student in the class using 2D arrays
 *   
 *2.Find the Highest and Lowest Marks in the Class  */

public class CaseStudyOn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int[][] studentMarks = new int[7][3];
		
		
		for(int i=0;i<studentMarks.length;i++) {
			for(int j=0;j<studentMarks[i].length;j++) {
				System.out.print("Enter "+(i+1)+" bench and "+(j+1)+" student marks :");
				studentMarks[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<studentMarks.length;i++) {
			int eachBenchTotalMarks=0;
			for(int j=0;j<studentMarks[i].length;j++) {
				eachBenchTotalMarks+=studentMarks[i][j];
			}
			System.out.println("The "+(i+1)+" Bench Total Marks is :"+eachBenchTotalMarks);	
		}
		
		int totalMarksOfStudents=0;
		int totalStudents=0;
		for(int i=0;i<studentMarks.length;i++) {
			for(int j=0;j<studentMarks[i].length;j++) {
				totalMarksOfStudents+=studentMarks[i][j];
				totalStudents++;
			}
		}
		int averageMarksPerStudent = totalMarksOfStudents/totalStudents;
		System.out.println("Aerage Marks Per Student is :"+averageMarksPerStudent);
		
		int highestMarks = studentMarks[0][0];
		int lowestMarks =  studentMarks[0][0];
		
		int[] lowestMarksstudentIndex = null;
		int[] heighestMarksstudentIndex =null;
		for(int i=0;i<studentMarks.length;i++) {
			for(int j=0;j<studentMarks[i].length;j++) {
				if(lowestMarks>studentMarks[i][j]) {
					lowestMarks=studentMarks[i][j];
					lowestMarksstudentIndex=new int[] {i,j};
				}else if(highestMarks<studentMarks[i][j]) {
					highestMarks=studentMarks[i][j];
					heighestMarksstudentIndex=new int[] {i,j};
				}
			}
		}
	
		System.out.println("Lowest marks is "+ lowestMarks + " and Scored by "+(lowestMarksstudentIndex[0]+1)+" Bench "+lowestMarksstudentIndex[1]+" student");
		System.out.println("Highest marks is "+ highestMarks + " and Scored by "+(heighestMarksstudentIndex[0]+1)+" Bench "+heighestMarksstudentIndex[1]+" student");
		
	}

}
