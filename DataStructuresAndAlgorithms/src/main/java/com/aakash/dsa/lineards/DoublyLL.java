package com.aakash.dsa.lineards;

import com.aakash.dsa.lineards.util.Node;

public class DoublyLL {

	Node head;
	
	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();

		dll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		dll.head.setNext(second);
		second.setNext(third);
		
		second.setPrev(dll.head);
		third.setPrev(second);
		
		dll.printDLL();
	}
	
	private void printDLL() {
		Node curr = head;
		while (curr!= null) {
			System.out.println("Value -> "+ String.valueOf(curr.getData())+ "  Prev-> "+ curr.getPrev()+ "   Next-> " + curr.getNext());
			curr = curr.getNext();
		}
	}

}
