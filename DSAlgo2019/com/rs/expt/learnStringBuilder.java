package com.rs.expt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class learnStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		
		StringBuilder sb = new StringBuilder();
		int op;
		int charnum;
		int length = 0;
		String str;
		int i = 0;
		while (i < count) {
			System.out.println(sb.toString());
			System.out.println(al);
			op = sc.nextInt();			
			switch (op) {
			case 1:// add
				str = sc.next().trim();
				sb.append(str);
				al.add("+" + str);
				break;
			case 2:// delete
				charnum = sc.nextInt();
				length = sb.length();
				al.add("-" + sb.substring(length - charnum));
				sb.delete(length - charnum, length);
				break;
			case 3:// print
				charnum = sc.nextInt();
				System.out.println(sb.charAt(charnum - 1));
				break;
			case 4:// undo
				if(al.get(al.size()-1).startsWith("-")){
					sb.append(al.get(al.size()-1).substring(1));
				}else {
					sb.delete(sb.length() -al.get(al.size()-1).length()+1, sb.length());
				}
				al.remove(al.size()-1);
				break;
			case 5:// undo
				System.out.println(sb.toString());
				System.out.println(al);
				break;
			case 6:// undo
				return;
			default:
				System.out.println("wrong input provided");
			}
			i++;
		}
		sc.close();
	}

}