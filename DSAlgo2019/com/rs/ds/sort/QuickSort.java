package com.rs.ds.sort;

import java.util.Arrays;

public class QuickSort {
	public void quickSort(int[] arr, int l, int r) {
		if(l>r) {
			int pi = partition(arr, l, r);
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, r);
		}
		
	}
	
	public int partition(int[] arr, int l, int r) {
		return 0;
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();

		int[] arr = { 7,6,5,4,3,2,1};
		qs.quickSort(arr, 0, arr.length -1);

		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {1,0,2,3,4,5,6,7,8,9};
		qs.quickSort(arr, 0, arr.length -1);

		System.out.println(Arrays.toString(arr));
	}
}
