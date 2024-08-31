package com.example.SpringBootJdbc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private int sId;
	private String sName;
	private int sMarks;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsMarks() {
		return sMarks;
	}
	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}
	
	

}
