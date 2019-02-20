package com.rs.ds.sort;

import java.util.Arrays;

public class SelectionSort {
	public void selectionSort(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			int least = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[least] > arr[j]) {
					least = j;
				}	
			}
			
			if (least != i) {
				int temp = arr[i];
				arr[i] = arr[least];
				arr[least] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();

		int[] arr = { 7,6,5,4,3,2,1};
		ss.selectionSort(arr);

		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {1,0,2,3,4,5,6,7,8,9};
		ss.selectionSort(arr);

		System.out.println(Arrays.toString(arr));
	}
}
