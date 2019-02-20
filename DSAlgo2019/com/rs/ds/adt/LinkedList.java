package com.rs.ds.adt;

public class LinkedList {
	public Node head;
	int size;

	public void printLL() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.nextPtr;
		}
		System.out.println();
	}

	public void addElement(int data, int pos) {
		Node node = new Node(data);
		Node curr = head;

		// insert at end if expected position greater than size of LL
		if (head == null) {// add to empty list
			head = node;
			node.nextPtr = null;
		} else if (pos == 0) {// add to beginning
			node.nextPtr = head;
			head = node;
		} else {// add at position pos
			int i = 0;
			while (pos >= i) {
				if (pos == i + 1 || size == i + 1) {
					node.nextPtr = curr.nextPtr;
					curr.nextPtr = node;
					break;
				}
				curr = curr.nextPtr;
				i++;
			}
		}
		size++;
	}
	
	public void deleteElement(int pos) {
		if (size == 0){//list is empty
			return;
		}else{
			if(pos == 0) {//delete from starting
				head = head.nextPtr;
			}else {
				int i = 0;
				Node curr = head;
				
				while(pos > i) {
					if (pos == i+1 || size == i+2) {
						curr.nextPtr = curr.nextPtr.nextPtr;
						break;
					}
					curr = curr.nextPtr;
					i++;
				}
			}
			size--;
		}
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addElement(10, 0);
		ll.addElement(8, 0);
		ll.addElement(6, 0);
		ll.addElement(4, 0);
		ll.addElement(2, 0);
		ll.addElement(0, 0);

		ll.addElement(1, 1);
		ll.addElement(3, 3);
		ll.addElement(5, 5);
		ll.addElement(7, 7);
		ll.addElement(9, 9);
		ll.addElement(11, 11);
		ll.printLL();
		
		ll.deleteElement(11);
		ll.deleteElement(11);
		ll.deleteElement(11);
		ll.deleteElement(11);
		ll.printLL();
		
		ll.addElement(11, 11);
		ll.reverseLL();
		ll.addElement(11, 11);
		ll.printLL();
	}
	
	public void reverseLL() {
		Node curr = head;
		Node next;
		Node prev = null;
		
		while(curr != null) {
			next = curr.nextPtr;
			curr.nextPtr = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
}
