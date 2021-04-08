package com.vendorsystem.jobpostingservice.resource;

public class JobPosting {
	


	private String jobPostingId;
	private String company;
	private Salary salary;
	private JobPostingTemplate template;
	
	
	public JobPosting() {
		super();
	}
	
	public String getJobPostingId() {
		return jobPostingId;
	}
	public void setJobPostingId(String jobPostingId) {
		this.jobPostingId = jobPostingId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public JobPostingTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JobPostingTemplate template) {
		this.template = template;
	}
	

}
