package com.cg.daytwo;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter age: ");  
		int age= sc.nextInt(); 
		if(age>18) {
			System.out.println("Adult");
		}else {
			System.out.println("Not an adult");
		}
		
	}

}
