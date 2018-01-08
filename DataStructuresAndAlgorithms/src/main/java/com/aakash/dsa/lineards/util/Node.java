package com.aakash.dsa.lineards.util;

public class Node {
	int data;
	Node next;
	Node prev;
	
	public Node(int d){
		data = d;
		next = null;
		prev = null;
	}
	
	public void setNext(Node node) {
		next = node;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
	
	public boolean hasNext() {
		if (next == null){
			return false;
		}
		return true;
	}
	
	public void setPrev(Node node) {
		prev = node;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public boolean hasPrev() {
		if (prev == null){
			return false;
		}
		return true;
	}
}
