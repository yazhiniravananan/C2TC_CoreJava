package com.cg.day4;
import com.cg.day4.Accessmethod1;
import com.cg.day4.Accessmethod1;

public class Accessmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmethod1 a = new Accessmethod1();
		System.out.println(a.name);
		//private
//		System.out.println(a.id);
		
		//default
		System.out.println(a.mobile);
		
		//protected
		System.out.println(a.mail);

		//Only Public variable is called from another package
		
		//Methods
		
		a.display2();
		
		//only public methods calls
	}

}
