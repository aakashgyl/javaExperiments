package com.rs.ds.search;

public class BinarySearch {

	public int doBinarySearch(int[] data, int key, int l, int r) {
		System.out.println(l + " " + r);
		if (l <= r) {
			int mid = (l+r)/2;
			System.out.println(mid);
			if (data[mid] == key) {
				return mid;
			}else if(data[mid] < key) {
				return doBinarySearch(data, key, mid + 1, r);
			}else {
				return doBinarySearch(data, key, l, mid -1);
			}
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		BinarySearch bs = new BinarySearch();
		int index = bs.doBinarySearch(arr, 60, 0, arr.length -1);

		if (index == -1) {
			System.out.println("Key not found");
		} else {
			System.out.println("Key found at index " + index);
		}
	}
}
