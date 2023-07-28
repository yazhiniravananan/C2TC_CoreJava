package com.cg.dayfive.encapsulation;

public class Encapsule {
	private int age;
	private String name;
	private String mail;
	private int phno;
	public Encapsule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsule(int age, String name, String mail, int phno) {
		super();
		this.age = age;
		this.name = name;
		this.mail = mail;
		this.phno = phno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", mail=" + mail + ", phno=" + phno + "]";
	}
	

}
