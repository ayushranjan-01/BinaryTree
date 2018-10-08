package me.kaveenk.binarytree;

public class TestBinaryTree {
	public static void main(String[] args) throws Exception {
		StudentInfo test = new StudentInfo("Kaveen", "Kumarasinghe", 5);
		StudentInfo test5 = new StudentInfo("Kaveen", "Kumarasinghe", 9);
		StudentInfo test4 = new StudentInfo("Kaveen", "Kumarasinghe", 18);
		StudentInfo test2 = new StudentInfo("Kaveen", "Kumarasinghe", 4);
		StudentInfo test3 = new StudentInfo("Kaveen", "Kumarasinghe", 3);
		StudentInfo test6 = new StudentInfo("Kaveen", "Kumarasinghe", 6);
		MyBinaryTree tree = new MyBinaryTree(test);
		tree.addToTree(tree.getRoot(), test2);
		tree.addToTree(tree.getRoot(), test3);
		tree.addToTree(tree.getRoot(), test4);
		tree.addToTree(tree.getRoot(), test5);
		tree.addToTree(tree.getRoot(), test6);
		tree.preorder();

	}

}
