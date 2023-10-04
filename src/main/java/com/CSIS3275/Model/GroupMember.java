package com.CSIS3275.Model;

public class GroupMember {

	public String FirstName;
	public String LastName;
	public String Email;
	public int StudentId;
	public String ProfileDescription;

	//four parameter constructor
	public GroupMember(String fName, String lName, String email, int studentId) {
		this.FirstName = fName;
		this.LastName = lName;
		this.Email = email;
		this.StudentId = studentId;
	}
	
	
	public String getProfileDescription() {
		return ProfileDescription;
	}

	public void setProfileDescription(String profileDescription) {
		ProfileDescription = profileDescription;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

}
