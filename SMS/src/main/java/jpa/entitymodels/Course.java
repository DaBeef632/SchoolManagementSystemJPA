package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Course {
	// fields
	@Id
	@Column(name = "cId", nullable = false)
	private int cId;
	private String cName;
	private String cInstructorName;

	// default constructor
	public Course() {
	}

	// my constructor
	public Course(int cId, String cName, String cInstructorName) {
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	// getters and setters
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

}
