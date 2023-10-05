package com.CSIS3275.Model;

public class GroupMember {

	public String name;
	public String email;
	public int studentId;
	public String link;
	public String linkToBio;

	public GroupMember(String name, String email, int studentId, String link) {
		super();
		this.name = name;
		this.email = email;
		this.studentId = studentId;
		this.link = link;
	}

	public GroupMember(String name, String email, int studentId, String link, String linkToBio) {
		this.name = name;
		this.email = email;
		this.studentId = studentId;
		this.link = link;
		this.linkToBio = linkToBio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLinkToBio() {
		return linkToBio;
	}

	public void setLinkToBio(String linkToBio) {
		this.linkToBio = linkToBio;
	}

}
