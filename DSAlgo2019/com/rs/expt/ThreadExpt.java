package com.rs.expt;

public class ThreadExpt {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}

}

class MyThread extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Its working " + i);
		}
	}
}