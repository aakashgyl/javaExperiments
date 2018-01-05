package com.aakash.dsa.sorting;

public class InsertionSort {

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
		InsertionSort is = new InsertionSort();

		System.out.println("Data before sorting");
		is.printArray(data);
		is.sort(data);
		System.out.println("Data after sorting");
		is.printArray(data);
	}

	private void sort(int[] data) {
		int temp = 0;
		for (int i = 1; i < data.length; i++) {
			printArrayInLine(data);
			for (int j = i; j > 0; j--) {
				if(data[j] < data[j-1]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}

	}
}
