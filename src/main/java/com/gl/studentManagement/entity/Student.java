package com.gl.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	//define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int studentId;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="course")
	private String course;

	@Column(name ="country")
	private String country;
	
	//define constructors
	
	public Student() {
		
	}

	public Student(int studentId, String firstName, String lastName, String course, String country) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

	//define getters/setters
	
	public int getId() {
		return studentId;
	}

	public void setId(int id) {
		this.studentId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	//define toString
	@Override
	public String toString() {
		return "Student [id=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", course=" + course
				+ ", country=" + country + "]";
	}

	
	
	
}
