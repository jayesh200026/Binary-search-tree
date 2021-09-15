package com.bst;

public class MyBinaryTreeTest {
	public static void main(String[] args) {
		MyBinarySearchTree<Integer> myBinaryTree = new MyBinarySearchTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		System.out.println("size of the binary search tree is " + myBinaryTree.getSize());
		myBinaryTree.print();
		myBinaryTree.search(95);
		myBinaryTree.search(100);

	}

}
