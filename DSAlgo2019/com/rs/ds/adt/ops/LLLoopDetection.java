package com.rs.ds.adt.ops;

import com.rs.ds.adt.LinkedList;
import com.rs.ds.adt.Node;

public class LLLoopDetection {
	
	
	public static void main(String args[]) 
	{ 
		LLLoopDetection ld = new LLLoopDetection();
		LinkedList llist = new LinkedList(); 

		llist.addElement(20,0);
		llist.addElement(4,0);
		llist.addElement(15,0);
		llist.addElement(10,0);
		llist.addElement(12,0);
		
		/*Create loop for testing */
		llist.head.nextPtr.nextPtr.nextPtr.nextPtr.nextPtr = llist.head; 

		ld.detectLoop(llist);
	} 
	
	public void detectLoop(LinkedList ll) {
		Node r = ll.head;
		Node t = ll.head;
		int i = 0;
		
		while (r != null && t != null && r.getNextPtr() != null) {
			r = r.nextPtr.nextPtr;
			t = t.nextPtr;
			
			if (r == t) {
				System.out.println("Loop detected " + i);
				return;
			}
			i++;
		}
		System.out.println("No loop");
	}
}