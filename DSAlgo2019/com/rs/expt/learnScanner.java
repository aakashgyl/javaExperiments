package com.rs.expt;

import java.util.Scanner;

public class learnScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		
		int i = sc.nextInt();
		s = sc.nextLine();
		System.out.println(i);
		System.out.println(s.trim());
		
		System.out.println(sc.toString());
	}

}
