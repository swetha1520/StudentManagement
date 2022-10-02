package com.example.springboot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentmodel")
public class StudentModel {

	@Id
	private int id;
	private String name;
	private String section;
	private int marks;
	public StudentModel() {
		// TODO Auto-generated constructor stub
	}
	public StudentModel(int id,String name,String section,int marks) {
		super();
		this.id=id;
		this.name=name;
		this.section=section;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
