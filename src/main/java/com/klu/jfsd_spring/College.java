package com.klu.jfsd_spring;

public class College {
	
	College()
	{
		//default constructor
	}
	String cname;
	Student stud; //here were are injecting student class
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	public String toString()
	{
		return (stud+" "+cname);
	}

}
