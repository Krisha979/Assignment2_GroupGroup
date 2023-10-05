package com.CSIS3275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CSIS3275.Model.Group;
import com.CSIS3275.Model.GroupMember;

@Controller
public class TeamMemberController_GroupGroup {
	
	@GetMapping("/")
	public String getTeamMembers(Model model) {
		Group group = new Group("GroupGroup", 3, "Collaborative team working on Csis3275");
		
		model.addAttribute("groupDetails",group);
		
		return "team-member-list";
	}
	
	@GetMapping("/team-member-bio")
	public String getTeamMemberByName(Model model) {
		
		GroupMember member = new GroupMember("Leung, Kin Shing", "leungk24@student.douglascollege.ca", 300369660);
		
		model.addAttribute("groupMember", member);
		
		return "bio";
	}
	
	@GetMapping("/profile-kle-41")
	public String renderProfileKle41(Model model) {
		
		//instantiate groupMember object
		GroupMember memberKle41 = new GroupMember("Kirby Le", "lek6@student.douglascollege.ca", 300258741);
		
		//set path for profile picture
		memberKle41.setProfilePicturePath("/imgs/profile_kle_41.jpg");
		
		
		return "profile-kle-41";
	}
}
