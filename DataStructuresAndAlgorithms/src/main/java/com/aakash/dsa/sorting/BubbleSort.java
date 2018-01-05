package com.aakash.dsa.sorting;

public class BubbleSort {

	void sort(int data[]) {
		boolean swap = false;
		int temp = 0;
		for (int i = 0; i < data.length; i++) {
			swap = false;
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					swap = true;
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
			if (swap == false) {
				break;
			}
		}
	}

	void printArray(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.println("Element " + i + " is " + data[i]);
		}
	}

	public static void main(String[] args) {
		int data[] = { 5, 4, 6, 7, 2, 1, 9 };
		BubbleSort bs = new BubbleSort();

		System.out.println("Data before sorting");
		bs.printArray(data);
		bs.sort(data);
		System.out.println("Data after sorting");
		bs.printArray(data);
	}

}
