package com.rs.hr;

import java.util.Arrays;
import java.util.HashMap;

public class Waiter {
	static int fib_curr = 2;
	static int fib_old = 1;
	

	static int[] waiter(int[] number, int q) {
		int btop = 0;
		int temptop = 0;
		int[] temp = new int[number.length];
		int[] b = new int[number.length];
		int top = number.length - 1;

		for (int i = 0; i < q; i++) {
			int fibn = getNextFib();
			
			for (; top >=0; top--) {
				if (number[top] % fibn == 0) {
//					System.out.println(Arrays.toString(b));
					b[btop++] = number[top];
				} else {
					temp[temptop++] = number[top];
				}
			}
			number = temp;
			top = temptop;
			System.out.println(Arrays.toString(b));
		}
		
		for(int i =0; i< temptop;i++) {
			b[btop++] = temp[i];
		}
		
		return b;
	}

	static int getNextFib() {
		int temp;

		temp = fib_curr;
		fib_curr = fib_curr + fib_old;
		fib_old = temp;

		return fib_old;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(waiter(new int[] {3,3,4,4,9}, 2)));
	}

}
