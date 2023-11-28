package com.pk1;

public class Protected extends AccessModifiersExample {

	public static void main(String[] args) {
		AccessModifiersExample ex1 = new AccessModifiersExample();
		
		 //Protected members are  accessible from  subclass example
		 System.out.println("Protected variable: " + ex1.c);
	        ex1.promethod();
	}

}
