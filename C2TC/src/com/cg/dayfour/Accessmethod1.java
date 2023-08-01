package com.cg.dayfour;

public class Accessmethod1 {
	public String name = "Yazhini";
	private int id = 143;
	protected String mail = "yazhini0408@gmail.com";
	long mobile = 1234567;
	
	void display1() {
		System.out.println("default");
	}
	public void display2() {
		System.out.println("public");
	}
	@SuppressWarnings("unused")
	private void display3() {
		System.out.println("private");
	}
	protected void display4() {
		System.out.println("Protected");
}
}
