package com.cg.day6;

public class StaticVariable1{
	String name;
	int id;
	static String college = "IFET";

	public StaticVariable1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaticVariable1(String name, int id) {
		super();
		this.name = name;
		this.id=id;
	}
	static void methodStatic() {
		college =" IFET College Of Engineering";
	}
	public void display() {
		System.out.println(name +""+id +""+college);
		}
	public void display(String name, int id) {
		System.out.println(name +" "+id +" "+college);

}
}
		
