package com.rs.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PickNum {

	public static void main(String[] args) {
		List<Integer> la = new ArrayList<Integer>(Arrays.asList(8,8,6,5,6,5,6,3,5,6));
		pickingNumbers(la);
	}

	public static void pickingNumbers(List<Integer> a) {
		HashMap<Integer, Integer> valCount = new HashMap<Integer, Integer>();
		List<Integer> vals = new ArrayList<Integer>();
		System.out.println(valCount.containsKey(2));

		for (int i = 0; i < a.size(); i++) {
			int val = a.get(i);
			int count = 0;
			if (valCount.containsKey(val)) {
				count = valCount.get(val);
			}else {
				vals.add(val);
			}
			valCount.put(val, ++count);
		}
		
		int currset = 0;
		int max = 0;
		for(int val:vals) {
			max = max > valCount.get(val)? max:valCount.get(val);
			if(vals.contains(val+1)) {
				currset = valCount.get(val) + valCount.get(val+1);
				max = max > currset? max:currset;
			}
		}
		System.out.println(valCount);
	}
}
