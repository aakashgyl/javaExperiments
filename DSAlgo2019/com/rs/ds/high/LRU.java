package com.rs.ds.high;

import java.util.HashMap;
import com.rs.ds.adt.Node;

public class LRU {
	HashMap<Integer, Node> lrumap = new HashMap<Integer, Node>();
	
	public static void main(String[] args) {
		Node node = new Node(12);
		DLL dll = new DLL(node);
		dll.addNode(new Node(13));
		dll.addNode(new Node(14));
		dll.addNode(new Node(15));
		dll.addNode(new Node(16));
		dll.addNode(new Node(17));
		dll.printDLL();
	}

}
