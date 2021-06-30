package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recruiter")
public class Recruiter {

	@Id
	@Column(name="recruiter_id")
	private String recruiterId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="job")
	private String job;
	
	@Column(name="phone")
	private String phone;

	public Recruiter() {
		super();
	}

	public Recruiter(String recruiterId, String name, String email, String password, String job, String phone) {
		super();
		this.recruiterId = recruiterId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.job = job;
		this.phone = phone;
	}

	public String getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(String recruiterId) {
		this.recruiterId = recruiterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Recruiter [recruiterId=" + recruiterId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", job=" + job + ", phone=" + phone + "]";
	}
	
		
}
