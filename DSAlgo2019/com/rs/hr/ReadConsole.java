package com.rs.hr;

import java.util.Scanner;

public class ReadConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tnum = sc.nex
        String line;
        sc.nextLine();
        StringBuilder odd = null;
        StringBuilder even = null;

        for (int i=0; i< tnum;i++){
            line = sc.nextLine();
            odd = new StringBuilder();
            even = new StringBuilder();
            for(int j=0; j<line.length();j++) {
            	if(j%2 == 0) {
            		even.append(line.charAt(j));
            	}else {
            		odd.append(line.charAt(j));
            	}
            }
            System.out.println(even + " " + odd);
        }
    }
}
