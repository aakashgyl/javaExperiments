package com.rs.ds.adt.nonlinear;

public class BinarySearchTree {
	Node root = null;

	public void insert(int data) {
		if (root == null) {
			Node node = new Node(data);
			root = node;
		} else {
			insertRecr(root, data);
		}
	}

	private void insertRecr(Node curr, int data) {
		if (curr.data == data) {
			System.out.println("Key already present");
		} else if (curr.data > data) {
			if (curr.left != null) {
				insertRecr(curr.left, data);
			} else {
				curr.left = new Node(data);
				return;
			}
		} else {
			if (curr.right != null) {
				insertRecr(curr.right, data);
			} else {
				curr.right = new Node(data);
				return;
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(12);
		bst.insert(10);
		bst.insert(14);
		bst.insert(100);
		bst.insert(141231);
		bst.insert(142);
		bst.insert(1);
		bst.printTree(bst.root);
		System.out.println();
		System.out.println(bst.isPresent(bst.root, 12));
		System.out.println(bst.isPresent(bst.root, 112312));
		System.out.println(bst.isPresent(bst.root, 11234));
	}

	public void printTree(Node curr) {
		if (curr != null) {
			printTree(curr.left);
			System.out.print(curr.data + " ");
			printTree(curr.right);
		}
	}
	
	public boolean isPresent(Node curr, int data) {
		if(curr == null) {
			return false;
		}else if(curr.data == data) {
			return true;
		}else if(curr.data > data) {
			return isPresent(curr.left, data);
		}else {
			return isPresent(curr.right, data);
		}
	}
}
