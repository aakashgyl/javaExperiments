package com.rs.ds.sort;

import java.util.Arrays;

public class InsertionSort {
	public void insertionSort(int[] arr) {
		for(int i=1; i < arr.length; i++) {
			for(int j=i; j>0;j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
	}	
	
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();

		int[] arr = { 7,6,5,4,3,2,1};
		is.insertionSort(arr);

		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {1,0,2,3,4,5,6,7,8,9};
		is.insertionSort(arr);

		System.out.println(Arrays.toString(arr));
	}
}
