package com.vendorsystem.jobpostingservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vendorsystem.jobpostingservice.resource.JobPosting;
import com.vendorsystem.jobpostingservice.resource.JobPostingTemplate;
import com.vendorsystem.jobpostingservice.resource.Salary;

public class JobPostingService {

	@Autowired
	public JobPosting jobPosting;
	
	public JobPosting getJobPosting(String jpId) {
		if (jpId.equals(jpId)) {
			jobPosting.setCompany("Google");
			jobPosting.setJobPostingId(jpId);
			jobPosting.setSalary(new Salary());
			jobPosting.setTemplate(new JobPostingTemplate());
		}
		return jobPosting;
	}
}
