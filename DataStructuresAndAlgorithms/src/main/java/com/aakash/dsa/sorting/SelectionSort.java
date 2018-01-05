package com.aakash.dsa.sorting;

public class SelectionSort {
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
		SelectionSort ss = new SelectionSort();

		System.out.println("Data before sorting");
		ss.printArray(data);
		ss.sort(data);
		System.out.println("Data after sorting");
		ss.printArray(data);
	}

	private void sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			printArrayInLine(data);
			int min = i;
			for(int j = i; j < data.length; j++) {
				if(data[j] < data[min]) {
					min = j;
				}
			}
			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}
}
