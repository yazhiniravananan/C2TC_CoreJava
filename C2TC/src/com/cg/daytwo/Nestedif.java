package com.cg.daytwo;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter age: ");  
		int age= sc.nextInt(); 
		if(age<10) {
			if(age<=2) {
				System.out.println("Its just a baby");
			}
		}
		if(age<10) {
			if(age>=3 && age<=5) {
				System.out.println("Toddler");
			}
		}
	}

}
