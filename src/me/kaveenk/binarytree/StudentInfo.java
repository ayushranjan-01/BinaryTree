package me.kaveenk.binarytree;

public class StudentInfo {
	private int studentNum;
	private String firstName;
	private String lastName;
	private StudentInfo left;
	private StudentInfo right;

	public StudentInfo() {
		this.studentNum = 000000;
		this.firstName = "";
		this.lastName = "";
		this.left = null;
		this.right = null;
	}

	public StudentInfo(String firstName, String lastName, int studentNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNum = studentNum;
		this.left = null;
		this.right = null;

	}

	/* Start Getters and Setters */
	/* Getters */

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getStudentNum() {
		return this.studentNum;
	}

	public StudentInfo getLeft() {
		return this.left;
	}

	public StudentInfo getRight() {
		return this.right;
	}
	/* Setters */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public void setLeft(StudentInfo left) {
		this.left = left;
	}

	public void setRight(StudentInfo right) {
		this.right = right;
	}
	/* End Getters and Setters */

}
