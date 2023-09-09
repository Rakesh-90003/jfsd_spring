package com.klu.jfsd_spring;

public class Student {
	int id;
	String sname;
	Student()
	{
		//default constructor have no arguments
		
	}
	public Student(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
		//parameterized constructor
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String toString()
	{
		return (id+" "+sname);
	}
	
	

}
