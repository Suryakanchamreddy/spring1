package com.example.Spring.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	public Student(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private float precentage;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public float getPrecentage() {
		return precentage;
	}
	public void setPrecentage(float precentage) {
		this.precentage = precentage;
	}
	public Student(int rollno, String firstname, String lastname, float precentage) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.precentage = precentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", precentage="
				+ precentage + "]";
	}
	

}
