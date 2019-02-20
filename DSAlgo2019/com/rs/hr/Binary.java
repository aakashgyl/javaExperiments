package com.rs.hr;

public class Binary {
	public static void main(String[] args) {
		String data = Integer.toBinaryString(439);
		System.out.println(data);
		int count = 0;
		int max = 0;
		char curr;

		for (int i = 0; i < data.length(); i++) {
			curr = data.charAt(i);
			if (curr == '1') {
				count++;
			} else {
				max = max > count ? max : count;
				count = 0;
			}

		}
		max = max > count ? max : count;
		System.out.println(max);
	}
}