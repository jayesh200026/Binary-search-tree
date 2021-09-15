package com.bst;

/**
 * @author jayeshkumar
 * Top most node is called root.Using this we traverse the binary tree.
 * 
 */
public class MyBinarySearchTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;

	/**
	 * method to add a new key to the binary search tree
	 * @param key element to be added
	 */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	/**
	 * method containing steps of insertion
	 * @param current node where the element is to be added
	 * @param key element to be added
	 * @return root of the tree
	 */
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<K>(key);
		}
		int compResult = key.compareTo(current.key);
		if (compResult == 0) {
			return current;
		}
		if (compResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	/**
	 * @param node root of the tree/subtree
	 * 
	 *   Algorithm Preorder(tree) 
	 *   1. Visit the root. 
	 *   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
	 *   3. Traverse the right subtree, i.e., call Preorder(right-subtree)
	 *             
	 */
	void printPreorder(MyBinaryNode<K> node) {
		if (node == null)
			return;

		System.out.print(node.key + "-->");

		printPreorder(node.left);

		printPreorder(node.right);
	}

	/**
	 * method to print the elements
	 */
	void print() {
		printPreorder(root);
	}

}
