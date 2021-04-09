package com.vendorsystem.jobpostingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vendorsystem.jobpostingservice.resource.JobPosting;
import com.vendorsystem.jobpostingservice.resource.JobPostingTemplate;
import com.vendorsystem.jobpostingservice.resource.Salary;
import com.vendorsystem.jobpostingservice.service.JobPostingService;

@RestController
@RequestMapping("/jobposting")
public class JobPostingController {

	@Autowired
	public JobPostingService jobPostingService;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@RequestMapping("/Hello")
	public String sayHi() {
		return "Hi";
	}
		
	@RequestMapping("/{jpId}")
	public JobPosting getJp(@PathVariable("jpId") String jpId) {
		
		JobPosting jobPosting = jobPostingService.getJobPosting(jpId);
		
		
		String url = "";
		//make call to job posting template via restTemplate
		url = "http://job-posting-template-service/jobpostingtemplate/"+jobPosting.getJptId();
		JobPostingTemplate jobPostingTemplate = restTemplate.getForObject(url, JobPostingTemplate.class);
		//set the JPT response in JP 
		jobPosting.setTemplate(jobPostingTemplate);
		
		
		//make call to job posting salary via restTemplate
		url = "http://job-posting-salary-service/salary/"+jobPostingTemplate.getSalaryId();
		Salary salary = restTemplate.getForObject(url, Salary.class);
		//set the JPS response in JP 
		jobPosting.setSalary(salary);
		
		return jobPosting;
		
	}
}
