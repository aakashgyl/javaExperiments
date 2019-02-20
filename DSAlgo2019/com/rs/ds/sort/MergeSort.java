package com.rs.ds.sort;

import java.util.Arrays;

public class MergeSort {
	public void mergeSort(int[] arr, int l, int r) {
//		System.out.println(Arrays.toString(arr) + "   " + l + "   " + r);
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public void merge(int[] arr, int l, int m, int r) {
//		System.out.println("Start " + Arrays.toString(arr) + "   " + l + "   " + m + "   " + r);
		int sl = m - l + 1;
		int sr = r - m;
		int i, j = 0;

		int[] arrl = new int[sl];
		int[] arrr = new int[sr];

		for (i = 0; i < sl; i++) {
			arrl[i] = arr[l + i];
		}
//		System.out.println(Arrays.toString(arrl));

		for (i = 0; i < sr; i++) {
			arrr[i] = arr[m + i + 1];
		}
//		System.out.println(Arrays.toString(arrr));

		i = 0;
		j = 0;
		while (i < sl && j < sr) {
			if (arrl[i] <= arrr[j]) {
//				System.out.println("inside i");
				arr[l + i + j] = arrl[i];
				i++;
			} else if (arrl[i] > arrr[j]) {
//				System.out.println("inside j");
				arr[l + i + j] = arrr[j];
				j++;
			}
		}

		if (i != sl) {
			for (; i < sl; i++) {
				arr[l + i + j] = arrl[i];
			}
		} else if (j != sr) {
//			System.out.println("sr " + sr);
			for (; j < sr; j++) {
				int temp = arrr[j];
//				System.out.println(l+i+j);
				arr[l + i + j] = temp;
			}
		}
//		System.out.println("End -> " + Arrays.toString(arr) + "   " + l + "   " + m + "   " + r);
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();

		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
		ms.mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

		 arr = new int[] { 1, 0, 2, 3, 4, 5, 6, 7, 8, 9 };
		 ms.mergeSort(arr, 0, arr.length - 1);
		
		 System.out.println(Arrays.toString(arr));
	}
}
