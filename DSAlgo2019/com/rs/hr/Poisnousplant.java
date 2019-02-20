package com.rs.hr;

import java.io.IOException;
import java.util.Arrays;

public class Poisnousplant {

	// Complete the poisonousPlants function below.
	static int poisonousPlants(int[] p) {
		int days = 0;
		boolean change = true;
		int i = 1;
		int l;
		while (change) {
			change = false;
			l = p[0];

			for (; i < p.length; i++) {
				if (p[i] != 0) {
					if (p[i] > l) {
						l = p[i];
						p[i] = 0;
						change = true;
					} else {
						l = p[i];
					}
				}
			}

			i = 1;
			days++;
		}
		System.out.println(Arrays.toString(p));
		return --days;
	}

	public static void main(String[] args) {
		System.out.println(poisonousPlants(new int[] {6,5,8,4,7,10,9}));
	}
}