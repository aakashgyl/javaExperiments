package com.aakash.dsa.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int data[] = {1,2,3,4,5,6,7,8};
		System.out.println("Found element at location " + binarySearch(data, 1, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 2, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 3, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 4, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 5, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 6, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 7, 0, data.length));
		System.out.println("Found element at location " + binarySearch(data, 8, 0, data.length));
	}
	
	public static int binarySearch(int data[], int elem, int l, int r) {
		 int mid = (l+r)/2;
		 
		 if (data[mid] == elem) {
			 return mid;
		 }else if(data[mid] < elem) {
			 return binarySearch(data, elem, mid+1, r);
		 }else {
			 return binarySearch(data, elem, l, mid-1 );
		 }
	}
}
