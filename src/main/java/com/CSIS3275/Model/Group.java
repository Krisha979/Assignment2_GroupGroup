package com.CSIS3275.Model;

public class Group {
	public String groupName;
	public int numOfMemb;
	public String desc;

	public Group(String groupName, int numOfMemb, String desc) {
		this.groupName = groupName;
		this.numOfMemb = numOfMemb;
		this.desc = desc;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getNumOfMemb() {
		return numOfMemb;
	}

	public void setNumOfMemb(int numOfMemb) {
		this.numOfMemb = numOfMemb;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
