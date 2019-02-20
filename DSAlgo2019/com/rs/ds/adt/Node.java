package com.rs.ds.adt;

public class Node {
	int data;
	public Node nextPtr;
	Node prevPtr;
	
	public Node(int value){
		data = value;
	}
	
	public void setData(int value){
		data = value;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNextPtr() {
		return nextPtr;
	}
	
	public void setNextPtr(Node node) {
		nextPtr = node;
	}
	
	public Node getPrevPtr() {
		return prevPtr;
	}
	
	public void setPrevPtr(Node node) {
		prevPtr = node;
	}
}