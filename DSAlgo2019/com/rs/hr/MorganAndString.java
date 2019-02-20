package com.rs.hr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class MorganAndString {

	public static void main(String[] args){
		String fileName = "C:\\Users\\aagoyal\\eclipse-workspace-oxygen\\ds\\src\\main\\java\\com\\rs\\hr\\stra";
		File file = new File(fileName);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(fis, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(isr);

		String line;
		try {
			while((line = br.readLine()) != null){
			     //process the line
			     System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String a = 
//		String b = 
//		System.out.println(morganAndString(a, b));

	}

    static String morganAndString(String a, String b) {
        int i=0,j=0;
        StringBuilder str = new StringBuilder();

        while(i != a.length() && j != b.length()){
            if(a.charAt(i) > b.charAt(j)){
                str.append(b.charAt(j));
                j++;
            }else if(a.charAt(i) < b.charAt(j)){
                str.append(a.charAt(i));
                i++;
            }else if(a.charAt(i) == b.charAt(j)){
                if(i+1 != a.length() && j+1 != b.length()){
                    if (a.charAt(i+1) > b.charAt(j+1)) {
                        str.append(a.charAt(i));
                        i++;
                    } else if (a.charAt(i+1) < b.charAt(j+1)) {
                        str.append(b.charAt(j));
                        j++;
                    }else{
                        str.append(a.charAt(i));
                        i++;
                    }
                }else if(i+1 == a.length()){
                    str.append(a.charAt(i));
                    i++;
                }else{
                    str.append(a.charAt(j));
                    j++;
                }
            }
        }
        if(i != a.length()){
            while (i != a.length()){
                str.append(a.charAt(i));
                i++;
            }
        }else if (j != b.length()) {
            while (j != b.length()) {
                str.append(b.charAt(j));
                j++;
            }
        }
        return str.toString();
    }
	
}
