package com.cg.daytwo;

public class Breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------Break ststement----------");
		int n;
		for(n=0;n<5;n++) {
			System.out.println(n);
			n+=1;
			System.out.println(n);
			break;
		}
		System.out.println("-------Continue ststement----------");
		for(n=0;n<5;n++) {
			System.out.println(n);
			continue;
		}
	}

}
