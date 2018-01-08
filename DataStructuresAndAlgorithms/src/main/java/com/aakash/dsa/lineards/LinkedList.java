package com.aakash.dsa.lineards;

import com.aakash.dsa.lineards.util.Node;

public class LinkedList {
	Node head;
	
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		ll.head = first;
		first.setNext(second);
		second.setNext(third);
		
		ll.printLL();
	}
	
	public void printLL() {
		Node curr = head;
		while(curr != null){
			System.out.println("Address -> "+ curr.toString() + "    Value -> " + String.valueOf(curr.getData()));
			curr = curr.getNext();
		}
	}
}
