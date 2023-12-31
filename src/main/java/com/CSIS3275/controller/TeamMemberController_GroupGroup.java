package com.CSIS3275.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CSIS3275.Model.Group;
import com.CSIS3275.Model.GroupMember;

@Controller
public class TeamMemberController_GroupGroup {
	private ArrayList<GroupMember> GroupMembList = new ArrayList<GroupMember>();
	public TeamMemberController_GroupGroup()	{
		GroupMembList.add(new GroupMember("Leung, Kin Shing", "leungk24@student.douglascollege.ca", 300369660, "/imgs/kle_60_pic.jpeg","/profile-kle-60"));
		GroupMembList.add(new GroupMember("Krisha Mahat", "mahatk@student.douglascollege.ca", 300368184, "/imgs/Kma_84_pic.jpg","/profile-kma-84"));;
		GroupMembList.add(new GroupMember("Kirby Le", "lek6@student.douglascollege.ca", 300258741, "/imgs/profile_kle_41.jpg","/profile-kle-41"));
	}
	
	@GetMapping("/")
	public String getTeamMembers(Model model) {
		Group group = new Group("GroupGroup", 3, "Collaborative team working on Csis3275");
		
		model.addAttribute("groupDetails",group);
		model.addAttribute("groupMemberAttribute", GroupMembList);
		
		return "team-member-list";
		
	}
	
	@GetMapping("/profile-kle-41")
	public String renderProfileKle41(Model model) {
		
		//instantiate groupMember object
		GroupMember memberKle41 = new GroupMember("Kirby Le", "lek6@student.douglascollege.ca", 300258741, "/imgs/profile_kle_41.jpg");
		
		model.addAttribute("groupMember", memberKle41);
		
		return "profile";
	}
	
	@GetMapping("/profile-kle-60")
	public String renderProfileKle60(Model model) {
		
		//instantiate groupMember object
		GroupMember memberKle60 = new GroupMember("Leung, Kin Shing", "leungk24@student.douglascollege.ca", 300369660, "/imgs/kle_60_pic.jpeg");
		
		model.addAttribute("groupMember", memberKle60);
		
		return "profile";
	}
	
	@GetMapping("/profile-kma-84")
	public String renderProfileKma84(Model model) {
		
		//instantiate groupMember object
		GroupMember memberKma84 = new GroupMember("Krisha Mahat", "mahatk@student.douglascollege.ca", 300368184, "/imgs/Kma_84_pic.jpg");
		
		model.addAttribute("groupMember", memberKma84);
		
		return "profile";
	}
}
