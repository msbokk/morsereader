package com.mirtunjay.morsereader.tree;

public class Node {
	Node leftNode;
	Node rightNode;
	char character;

	public Node(char c) {
		this.character = c;
		this.leftNode = null;
		this.rightNode = null;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public void setLeftRight(Node left, Node right) {
		setLeftNode(left);
		setRightNode(right);

	}
}
