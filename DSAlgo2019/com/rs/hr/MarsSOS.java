package com.rs.hr;

public class MarsSOS {

	public static void main(String[] args) {
		String sos = "SOSTOSSOT";
		int repeattimes = sos.length()/3;
		StringBuilder sosactual = new StringBuilder();
		for (int i=0;i<repeattimes;i++) {
			sosactual.append("SOS");
		}
		
		int val = 0;
		
		for(int i=0;i<sos.length();i++) {
			if(sos.charAt(i) != sosactual.charAt(i)) {
				val++;
			}
		}
		System.out.println(val);
		
	}

}
