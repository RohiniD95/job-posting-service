package com.vendorsystem.jobpostingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendorsystem.jobpostingservice.resource.JobPosting;
import com.vendorsystem.jobpostingservice.service.JobPostingService;

@RestController
@RequestMapping("/jobposting")
public class JobPostingController {

	@Autowired
	public JobPostingService jobPostingService;
	
	@RequestMapping("/Hello")
	public String sayHi() {
		return "Hi";
	}
		
	@RequestMapping("/{jpId}")
	public JobPosting getJp(@PathVariable("jpId") String jpId) {
		
		JobPosting jobPosting = jobPostingService.getJobPosting(jpId);
		
		return jobPosting;
		
	}
}
