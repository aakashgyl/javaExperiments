package com.rs.hr;

public class StrongPassword {

	public static void main(String[] args) {
		System.out.println(minimumNumber(4, "LY!Z"));
	}

	// Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		int spl = 0;
		int digit = 0;
		int upper = 0, lower = 0;
		int minchar = 4;

		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";

		for (int i = 0; i < password.length(); i++) {
			if (spl == 0) {
				System.out.println();
				System.out.println(special_characters.indexOf(password.charAt(i)));
				if (special_characters.indexOf(password.charAt(i)) > 0) {
					System.out.println("not cming inside");
					spl = 1;
					minchar = minchar - 1;
				}
			}
			if (digit == 0) {
				if (numbers.indexOf(password.charAt(i)) > 0) {
					digit = 1;
					minchar = minchar - 1;
				}
			}
			if (upper == 0) {
				if (upper_case.indexOf(password.charAt(i)) > 0) {
					upper = 1;
					minchar = minchar - 1;
				}
			}
			if (lower == 0) {
				if (lower_case.indexOf(password.charAt(i)) > 0) {
					lower = 1;
					minchar = minchar - 1;
				}
			}
		}
		System.out.println(minchar);
		if (n < 6) {
			if (6 - n >= minchar) {
				return 6 - n;
			} else {
				return minchar;
			}
		} else {
			return minchar;
		}
	}
}
