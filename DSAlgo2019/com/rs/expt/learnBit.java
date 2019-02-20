package com.rs.expt;

public class learnBit {

	public static void main(String[] args) {
		System.out.println(countOne(24));
	}
	
	public static int countOne(int number){
        int count = 0;
        for(int i =0; i<4; i++){
        	System.out.println(number);
        	System.out.println(number&1);
            if( (number&1) == 1) {
                count++;
            }
            number = number >>> 1;
        }
        return count;
    }
}
