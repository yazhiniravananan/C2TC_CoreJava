package com.cg.daytwo;
import java.util.Scanner;
public class Ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grade (A TO E):");
		char grade = sc.next().charAt(0);   
		if(grade<='A'&& grade<='C') {
			System.out.println("Pass");
		}
		else if(grade>='D') {
			System.out.println("Just Pass");
		}
		else {
			System.out.println("Failed :(");
		}
	}

}
