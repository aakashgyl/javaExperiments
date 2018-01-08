package com.aakash.dsa.sorting;

public class MergeSort {
	void printArray(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.println("Element " + i + " is " + data[i]);
		}
	}

	void printArrayInLine(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int data[] = { 5, 4, 6, 7, 2, 1, 9 };
		MergeSort ss = new MergeSort();

		System.out.println("Data before sorting");
		ss.printArray(data);
		ss.sort(data, 0, data.length);
		System.out.println("Data after sorting");
		ss.printArray(data);
	}

	private void sort(int[] data, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(data, l, mid);
			sort(data, mid + 1, r);
			merge(data, l, mid, r);
		}
	}

	private void merge(int[] data, int l, int mid, int r) {
		
	}
}
