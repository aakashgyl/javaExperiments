package com.aakash.dsa.searching;

public class LinearSearch {

	public static void main(String[] args) {
		//ArrayList<Integer> data = new ArrayList(Arrays.asList(6,5,4,3,1,2,12,5));
		int data[] = {1,3,4,5,6,7,8,9};
		
		System.out.println("Found element at location " + linearSearch(data, 10));
		System.out.println("Found element at location " + linearSearch(data, 4));
	}

	public static int linearSearch(int data[], int elem){
		for(int i = 0; i< data.length;i++) {
			if(elem == data[i]) {
				return i;
			}
		}
		return -1;
	}
}
