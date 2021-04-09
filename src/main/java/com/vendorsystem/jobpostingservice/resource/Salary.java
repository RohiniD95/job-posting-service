package com.vendorsystem.jobpostingservice.resource;

public class Salary {

	private String jptId;
	private String salaryId;
	private String minSalary;
	private String maxSalary;
	
	public String getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(String salaryId) {
		this.salaryId = salaryId;
	}


	public String getJptId() {
		return jptId;
	}

	public void setJptId(String jptId) {
		this.jptId = jptId;
	}

	public String getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}

	public String getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Salary() {
		super();
	}
	
}
