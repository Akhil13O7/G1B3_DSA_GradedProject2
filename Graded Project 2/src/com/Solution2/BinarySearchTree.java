package com.Solution2;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTree {
	Node node;
	Node prev = null;
	Node newHead = null;

	void UpdatingTransacationBST(Node root) {
		if (root == null)
			return;

		UpdatingTransacationBST(root.left);
		Node rightNode = root.right;

		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {

			prev.right = root;
			root.left = null;
			prev = root;
		}
		UpdatingTransacationBST(rightNode);
	}

	void TransactionTreeTraversal(Node root) {

		if (root == null)
			return;
		System.out.print(root.data + " ");
		TransactionTreeTraversal(root.right);
	}

}
