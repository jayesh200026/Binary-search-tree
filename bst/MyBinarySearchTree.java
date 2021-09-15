package com.bst;

/**
 * @author jayeshkumar Top most node is called root.Using this we traverse the
 *         binary tree.
 * 
 */
public class MyBinarySearchTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;

	/**
	 * method to add a new key to the binary search tree
	 * 
	 * @param key element to be added
	 */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	/**
	 * method containing steps of insertion
	 * 
	 * @param current node where the element is to be added
	 * @param key     element to be added
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
	 *             Algorithm Preorder(tree) 1. Visit the root. 2. Traverse the left
	 *             subtree, i.e., call Preorder(left-subtree) 3. Traverse the right
	 *             subtree, i.e., call Preorder(right-subtree)
	 * 
	 */
	void printPreorder(MyBinaryNode<K> node) {
		if (node == null)
			return;

		System.out.print(node.key + "  ");

		printPreorder(node.left);

		printPreorder(node.right);

	}

	/**
	 * method to print the elements
	 */
	void print() {
		printPreorder(root);
		System.out.println();
	}

	/**
	 * method to get the number of elements in the tree
	 * 
	 * @return size of the tree
	 */
	public int getSize() {
		return getSizeRecursive(root);
	}

	/**
	 * Method which actually consisting of steps
	 * 
	 * @param current = root of tree/subtree
	 * @return size of the treegit branch
	 * 
	 */
	private int getSizeRecursive(MyBinaryNode<K> current) {
		if (current == null) {
			return 0;
		}
		return 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);

	}

	/**
	 * method to search for a key in binary search tree
	 * 
	 * @param key element to be searched
	 */
	public void search(K key) {
		searchNode(root, key);
	}

	/**
	 * actual method to implement search operation
	 * 
	 * @param current Node of tree
	 * @param key     element to be searched
	 */
	private void searchNode(MyBinaryNode<K> current, K key) {
		if (current == null) {
			System.out.println(key + " not found");
			return;
		}
		int compResult = key.compareTo(current.key);
		if (compResult == 0) {
			System.out.println(key + " Found");
			return;
		}
		if (compResult < 0) {
			searchNode(current.left, key);
		} else {
			searchNode(current.right, key);
		}

	}

}
