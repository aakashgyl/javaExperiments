package com.rs.ds.adt;

import java.util.Arrays;

public class Stack {
	int[] data;
	int top;
	
	Stack(){
		data = new int[10];
		top = -1;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(12);
		stack.push(122);
		stack.push(123);
		stack.push(126);
		stack.push(127);
		stack.push(128);
		stack.push(120);
		stack.push(1211);
		stack.push(1212);
		stack.push(1232);
		stack.push(1254);
		stack.push(1265);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
	}
	
	public void push(int val) {
		if (top < data.length -1) {
			top++;
			data[top] = val;
		}else {
			System.out.println("Stack full");
		}
	}
	
	public int pop() {
		if(top < 0) {
			System.out.println("Stack empty");
			return -1;
		}else {
			return data[top--];
		}
	}
	
	public void print() {
		System.out.println("Array is: " + Arrays.toString(data) + " with top: " + top);
	}
}
