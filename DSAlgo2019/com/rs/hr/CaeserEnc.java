package com.rs.hr;

public class CaeserEnc {

	public static void main(String[] args) {
		String str = "www.abc.xy";
		int k = 87;
		k = k%26;
		StringBuilder strf = new StringBuilder();
		
		for(int i = 0; i <str.length(); i++) {
			int place = str.charAt(i);
			
			if(place >=65 && place <= 90) {
				int rem = (place + k)%91;
				if(rem < 65) {
					strf.append((char)(65+rem));
				}else {
					strf.append((char)(place + k));
				}
			}else if(place >= 97 && place <= 122) {
				int rem = (place + k)%123;
				System.out.println(rem);
				if(rem < 97) {
					strf.append((char)(97+rem));
				}else {
					strf.append((char)(place + k));
				}
			}else {
				strf.append((char)place);
			}
		}
		System.out.println(strf);
	}

}
