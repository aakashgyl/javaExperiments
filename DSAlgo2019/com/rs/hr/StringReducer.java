package com.rs.hr;

public class StringReducer {

	public static void main(String[] args) {
		System.out.println(superReducedString("aacc"));

	}

	static String superReducedString(String s) {
		boolean change = true;
		int len = s.length();
		while (change != false) {
			change = false;
			for (int i = 0; i < len - 1; i++) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					StringBuilder delchar = new StringBuilder();
					delchar.append(s.charAt(i));
					delchar.append(s.charAt(i));
					s = s.replaceFirst(delchar.toString(), "");
					len = len - 2;
					change = true;
				}
			}
		}
		if (s.isEmpty()) {
			return "Empty String";
		} else {
			return s;
		}
	}
}
