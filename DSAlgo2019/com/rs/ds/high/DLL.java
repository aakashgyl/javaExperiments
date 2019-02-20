package com.rs.ds.high;

import com.rs.ds.adt.Node;

public class DLL {
	Node head, tail;
	
	DLL(Node node){
		head = node;
		tail = node;
		head.setNextPtr(null);
		head.setPrevPtr(null);
		tail.setNextPtr(null);
		tail.setPrevPtr(null);
	}
	
	public void addNode(Node node) {
		tail.setNextPtr(node);
		node.setPrevPtr(tail);
		node.setNextPtr(null);
		tail = node;
	}
	
	public void printDLL() {
		System.out.println("forward print");
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.getData() + "->");
			curr = curr.getNextPtr();
		}
		System.out.println();
		
		System.out.println("reverse print");
		curr = tail;
		while(curr != null) {
			System.out.print(curr.getData() + "<-");
			curr = curr.getPrevPtr();
		}
	}
	
	public void moveToFront(Node node) {
		
	}
}
