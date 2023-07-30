package com.cg.daythree;
import java.io.InputStream;
public class Scanner {
	
		public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
			System.out.print("Enter number: ");  
			int n= sc.nextInt(); 
			System.out.println("Entered number:"+n);
}

		private int nextInt() {
			// TODO Auto-generated method stub
			return 0;
		}
}