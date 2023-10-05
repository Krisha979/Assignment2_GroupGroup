package com.CSIS3275.Model;

public class Group {
	public String GroupName;
	public int NumOfMemb;
	public String Desc;

	public Group(String groupName, int numOfMemb, String desc) {
		GroupName = groupName;
		NumOfMemb = numOfMemb;
		Desc = desc;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	public int getNumOfMemb() {
		return NumOfMemb;
	}

	public void setNumOfMemb(int numOfMemb) {
		NumOfMemb = numOfMemb;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

}
