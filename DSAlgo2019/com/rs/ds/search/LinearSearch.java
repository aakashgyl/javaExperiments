package com.rs.ds.search;

import java.util.Arrays;

public class LinearSearch {
	
	public int doLinearSearch(Integer[] data, int key) {
		int index = -1;
		for (int val:data) {
			index++;
			if (key == val){
				return index;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		
		Integer[] arr = {1,2,3,4,5,6,7};
		int key = 4;
		int index = ls.doLinearSearch(arr, key);
		
		if (index == -1) {
			System.out.println("Key not found in the array");
		}else {
			System.out.println("Key " + key + " found at location " + index + " in array: " + Arrays.toString(arr));
		}
	}

}
