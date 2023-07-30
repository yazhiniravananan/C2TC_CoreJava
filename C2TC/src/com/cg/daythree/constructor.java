package com.cg.daythree;

class constructor {
	constructor() {//default constructor
		System.out.println("This is a default constructor");

		// TODO Auto-generated constructor stub
	}

	}

class Stud{  
	int id;  
	String name;  
	public Stud(int id, String name) { //parameter constructor 
		super();
		this.id = id;
		this.name = name;
	}

	void display(){
		System.out.println(id+" "+name);
		// TODO Auto-generated method stub

	}

}
