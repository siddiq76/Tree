package com.Tree.Tree;

public class MyBinaryNode<T extends Comparable<T>> {
	private T data;
	private MyBinaryNode left, right;

	/**
	 *  data,  the data stored in each node
	 * left,  the reference to left child
	 *  right, the reference to right child
	 */
	public MyBinaryNode(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public MyBinaryNode getLeft() {
		return left;
	}

	/**
	 *left the left to set
	 */
	public void setLeft(MyBinaryNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public MyBinaryNode getRight() {
		return right;
	}

	/**
	 * right the right to set
	 */
	public void setRight(MyBinaryNode right) {
		this.right = right;
	}
}
