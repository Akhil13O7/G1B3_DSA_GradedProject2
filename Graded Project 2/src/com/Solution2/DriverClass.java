package com.Solution2;

public class DriverClass {
	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		System.out.print("Output : ");
		tree.UpdatingTransacationBST(tree.node);
		tree.TransactionTreeTraversal(tree.newHead);
	}

}
