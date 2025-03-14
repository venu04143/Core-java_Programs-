package com.casestudies;

import java.util.Scanner;

/*
 * A school wants to develop a simple system to manage student marks for a particular subject.
 * The system should be able to :
 *           a) Store marks of Multiple Students using an Array 
 *           b) Display all Student marks.
 *           c)Find the Highest and Lowest Marks.
 *           d) Calculate the Average Marks of the class.
 *           e) Count the Number of Students Who passed (marks >=40 */
public class CaseStudyOnArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] studentMarks = new int[8];
		System.out.println("Enter the Student Marks one after one :");
		for(int i = 0;i<studentMarks.length;i++) {
			studentMarks[i]=sc.nextInt();
		}
		for(int marks :studentMarks) {
			System.out.print(marks + " ");
		}
		System.out.println();
		int lowestMarks =studentMarks[0];
		int highestMarks = studentMarks[0];
	
		for(int i=1;i<studentMarks.length;i++) {
			if(lowestMarks > studentMarks[i]) {
				lowestMarks = studentMarks[i];
			}
			else if(highestMarks < studentMarks[i]) {
				highestMarks=studentMarks[i];
			}
			
		}
		
		System.out.println("Lowest Marks in Given StudentMarks Array is : "+ lowestMarks);
		System.out.println("Highest Marks in Given StudentMarks Array is :"+ highestMarks);
		
		int totalMarksSum=0;
		for(int i=0;i<studentMarks.length;i++) {
			totalMarksSum+=studentMarks[i];
		}
		int averageMarks = totalMarksSum/studentMarks.length;
		System.out.println("The Average Marks of a Class is : " + averageMarks);
		
		int countOfPassedStudents=0;
		int countOfFailedStudents=0;
		for(int i = 0;i<studentMarks.length;i++) {
			if(studentMarks[i]>=40) {
				countOfPassedStudents++;
			}
			else {
				countOfFailedStudents++;
			}
		}
		System.out.println(countOfPassedStudents+" Students are Passed.");
		System.out.println(countOfFailedStudents+ " Students are Failed.");

	}

}
