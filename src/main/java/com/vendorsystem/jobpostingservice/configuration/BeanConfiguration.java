package com.vendorsystem.jobpostingservice.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
