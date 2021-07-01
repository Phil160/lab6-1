package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {
	private int studentId;
	private String name;
	private LocalDate dateOfAdmission;
	public Student(int studentId, String name, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return String.format("Student [studentId=%s, name=%s, dateOfAdmission=%s]", studentId, name, dateOfAdmission);
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

}
