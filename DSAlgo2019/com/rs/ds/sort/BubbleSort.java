package com.rs.ds.sort;

import java.util.Arrays;

public class BubbleSort {

	public void bubblesort(int[] data) {
		int size = data.length;
		int temp;
		boolean swap = false;
		for (int i = 0; i < size - 1; i++) {
			System.out.println(Arrays.toString(data));
			swap = false;
			for (int j = 0; j < size - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
					swap = true;
				}
			}
			if (swap == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();

		int[] arr = { 7,6,5,4,3,2,1};
		bs.bubblesort(arr);

		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {1,0,2,3,4,5,6,7,8,9};
		bs.bubblesort(arr);

		System.out.println(Arrays.toString(arr));
	}
}
