package com.rs.hr;

import java.util.ArrayList;
import java.util.Arrays;

public class Calorie {
	public static void main(String[] args) {
		int[] calorie = {1,3,2};
		Arrays.sort(calorie);
		System.out.println(Arrays.toString(calorie));
		long miles = 0;
		for (int i = 0; i < calorie.length - 1; i++) {
			miles = (long) (java.lang.Math.pow(2, i) * calorie[calorie.length - i - 1]) + miles;
			System.out.println(miles);
		}
		System.out.println(miles);
		ArrayList al = new ArrayList<Object>();
		al.wait
	}
}
