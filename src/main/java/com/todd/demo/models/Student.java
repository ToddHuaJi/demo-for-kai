package com.todd.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student extends Person {

	@Id
	private int id;
	private int grade;

	public Student(int id, int grade) {
		super();
		this.id = id;
		this.grade = grade;
	}

	public Student(int age, String name) {
		super(age, name);
	}

	public Student() {
		super();
	}

	public Student(int grade) {
		super();
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
