package com.vendorsystem.jobpostingservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vendorsystem.jobpostingservice.resource.JobPosting;
import com.vendorsystem.jobpostingservice.service.JobPostingService;

@Configuration
public class BeanConfiguration {

	@Bean
	public JobPosting getJobPosting() {
		return new JobPosting();
	}
	
	@Bean
	public JobPostingService getJobPostingService() {
		return new JobPostingService();
	}
}
