package me.kaveenk.binarytree;

public class MyBinaryTree {
	private int numInTree;
	private StudentInfo root;

	public MyBinaryTree() {
		this.root = null;
		this.numInTree = 0;
	}

	// Constructor Overload
	public MyBinaryTree(StudentInfo root) {
		this.root = root;
		this.numInTree = 1;

	}

	/* Start Getters and Setters */
	/* Getters */
	public StudentInfo getRoot() {
		return this.root;
	}

	public int getNumInTree() {
		return this.numInTree;
	}

	/* Setters */
	public void setRoot(StudentInfo root) {
		this.root = root;
	}

	public void setNumInTree(int numInTree) {
		this.numInTree = numInTree;
	}

	/* End Getters and Setters */

	/* Begin Methods */
	public boolean isEmpty() {
		return root == null;
	}

	// Overload
	public void addToTree(StudentInfo addition) {
		if (this.numInTree == 0) {
			this.root = addition;
		} else {
			addToTree(this.root, addition);

		}
	}

	public void addToTree(StudentInfo root, StudentInfo addition) {

		if (addition.getStudentNum() <= root.getStudentNum()) {
			if (root.getLeft() == null) {
				root.setLeft(addition);
			} else {
				addToTree(root.getLeft(), addition);
			}

		} 
		if (addition.getStudentNum() > root.getStudentNum()) {
			if (root.getRight() == null) {
				root.setRight(addition);
			} else {
				addToTree(root.getRight(), addition);
			}
		}

	}

	// Overload
	public void inorder() {
		if (this.getRoot() != null) {
			inorder(this.getRoot().getLeft());
			cleanPrint(this.getRoot());
			inorder(this.getRoot().getRight());
		}
	}

	public void inorder(StudentInfo starter) {

		if (starter != null) {
			inorder(starter.getLeft());
			cleanPrint(starter);
			inorder(starter.getRight());
		}
	}

	// Overload
	public void postorder() {
		if (this.getRoot() != null) {
			postorder(this.getRoot().getLeft());
			postorder(this.getRoot().getRight());
			cleanPrint(this.getRoot());
		}
	}

	public void postorder(StudentInfo starter) {
		if (starter != null) {
			postorder(starter.getLeft());
			postorder(starter.getRight());
			cleanPrint(starter);
		}
	}

	// Overload
	public void preorder() {
		if (this.root != null) {
			cleanPrint(this.getRoot());
			preorder(this.getRoot().getLeft());
			preorder(this.getRoot().getRight());
		}
	}

	public void preorder(StudentInfo starter) {
		if (starter != null) {
			cleanPrint(starter);
			preorder(starter.getLeft());
			preorder(starter.getRight());
		}
	}

	// Overload
	private void cleanPrint(StudentInfo printee) {
		System.out.print(printee.getStudentNum() + ", ");
	}

	private void cleanPrint(StudentInfo printee, boolean terminary) {
		if (!terminary) {
			System.out.print(printee.getStudentNum() + ", ");
		} else {
			System.out.print(printee.getStudentNum() + " ");
		}
		return;
	}

}
