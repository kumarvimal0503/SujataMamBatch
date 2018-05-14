package com.springdemo.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private List<String> emails;

	private List<A> aList;
	
	private Set<String> subjectNames;
	
	private Set<Subject> subjects;
	
	private Map<String,Double> marks;
	
	private Properties attendenceDetails;
	
	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<A> getaList() {
		return aList;
	}

	public void setaList(List<A> aList) {
		this.aList = aList;
	}

	public Set<String> getSubjectNames() {
		return subjectNames;
	}

	public void setSubjectNames(Set<String> subjectNames) {
		this.subjectNames = subjectNames;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Map<String, Double> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Double> marks) {
		this.marks = marks;
	}

	public Properties getAttendenceDetails() {
		return attendenceDetails;
	}

	public void setAttendenceDetails(Properties attendenceDetails) {
		this.attendenceDetails = attendenceDetails;
	}

	
	
}
