package com.CSIS3275.Model;

public class GroupMember {

	public String Name;
	public String Email;
	public int StudentId;

	public GroupMember(String name, String email, int studentId) {
		Name = name;
		Email = email;
		StudentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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
