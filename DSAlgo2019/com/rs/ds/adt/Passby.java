package com.rs.ds.adt;

public class Passby {

	int a;
	int b;
	
	public static void swap(Passby arg1, Passby arg2) {
		arg1.a = 100;
		arg1.b = 100;
		
		Passby temp = arg1;
		arg1 = arg2;
		arg2 = temp;
		arg2.a = 200;
		System.out.println(arg1.a + " " + arg1.b + " ---- " + arg2.a + " " + arg2.b);
		return;
	}
	
	public static void main(String[] args) {
		Passby ptr1 = new Passby();
		ptr1.a = 0;
		ptr1.b = 0;
		
		Passby ptr2 = new Passby();
		ptr2.a = 0;
		ptr2.b = 0;

		System.out.println(ptr1.a + " " + ptr1.b + " ---- " + ptr2.a + " " + ptr2.b);
		
		swap(ptr1, ptr2);
		
		System.out.println(ptr1.a + " " + ptr1.b + " ---- " + ptr2.a + " " + ptr2.b);
	}

}
