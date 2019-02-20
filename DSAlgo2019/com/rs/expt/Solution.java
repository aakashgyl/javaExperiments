package com.rs.expt;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 1, 2, 3, 4, 6, 6, 7, 7, 7 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int i=1, j=1;
		int prev = arr[0];
		
		for(;i<arr.length;i++) {
			if(prev != arr[i]) {
				arr[j] = arr[i];
				j++;
				prev = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr) + " " + j);
	}
}
