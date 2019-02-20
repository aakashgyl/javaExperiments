package com.rs.expt;

import java.util.*;

class countbits {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] data = new int[count];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i =0; i< count; i++){
            s.nextLine();
            data[i] = s.nextInt();
        }
        
        int bit = 0;
        int last =0;
        int sum = 0;
        int val;
        int[] data2 = data.clone(); 
        System.out.println(Arrays.toString(data));
        Arrays.sort(data2);
        System.out.println(Arrays.toString(data2));
        
        for(int i = 0; i < count;i++){
        	if(map.containsKey(last)) {
        		sum = map.get(last);
        	}else {
        		sum = 0;
        	}
        	
        	val = data2[i];
            for(int j = last+1; j <= val; j++){
                bit = Integer.bitCount(j);   
                if(bit == 2){
                    sum = sum + j;
                }
            }
            last = data2[i];
            map.put(data2[i], sum);
        }
        System.out.println(map);
        
        for(int i = 0; i< count;i++){
            System.out.println(map.get(data[i]));
        }
    }
}
