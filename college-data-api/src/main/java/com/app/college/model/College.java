package com.app.college.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	private String collegeAdress;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAdress() {
		return collegeAdress;
	}

	public void setCollegeAdress(String collegeAdress) {
		this.collegeAdress = collegeAdress;
	}
}
