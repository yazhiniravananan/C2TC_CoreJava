package com.cg.day6;

public class Staticclass {
	int studentid ;
	String studentname;
	static String collegename="ifet";//static variable
	Staticclass(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}
	void display() {
		System.out.println(studentid +" "+studentname+" "+collegename);
	}

public static void main(String args[]) {
	Staticclass sc=new Staticclass(123,"abcd");
	sc.display();

}

}
