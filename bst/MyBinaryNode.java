package com.bst;

/**
 * @author jayeshkumar Implements the INode interface. Each node has left and
 *         right nodes.
 * 
 */
public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
	K key;
	MyBinaryNode<K> left, right;

	MyBinaryNode(K key) {
		this.key = key;
		this.right = null;
		this.left = null;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setkey(K key) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub

	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return null;
	}

}
