package com.todd.demo.models;

public class Teacher extends Person {

	private int credits;

	public Teacher() {
		super();
	}

	public Teacher(int age, String name) {
		super(age, name);
	}

	public Teacher(int credits) {
		super();
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Teacher [credits=" + credits + ", toString()=" + super.toString() + "]";
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}
