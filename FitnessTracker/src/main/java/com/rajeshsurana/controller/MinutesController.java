package com.rajeshsurana.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rajeshsurana.model.Activity;
import com.rajeshsurana.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes( @ModelAttribute("exercise") Exercise exercise ){
		System.out.println("Exercise: " + exercise.getMinutes());
		return "addMinutes";
	} 
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes( @ModelAttribute("exercise") Exercise exercise ){
//		System.out.println("Exercising: " + exercise.getMinutes());
//		return "addMinutes";
//	} 
}
