package com.CSIS3275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamMemberController_GroupGroup {
	
	@GetMapping("/")
	public String getTeamMembers(Model model) {
		return "team-member-list";
	}
	
	@GetMapping("/team-member-bio")
	public String getTeamMemberByName(Model model) {
		
		/*
		 * TeamMember teamMember = new TeamMember();
		 * model.addAttribute("teamMember", teamMember);
		 * 
		 * */
		
		return "bio";
	}
}
