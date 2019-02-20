package com.rs.hr;

public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllSubstrings("aakash");
	}
	
	public static void printAllSubstrings(String content) {
		int count = 0;
		for(int i = 1; i <= content.length(); i++) {//for length of output string
			for(int j=0; j < content.length() -i +1 ;j++) {
				System.out.println(content.substring(j, j+i));
				count++;
			}
		}
		System.out.println(count);
		System.out.println(content.length() * (content.length()+1)/2);
	}
}
