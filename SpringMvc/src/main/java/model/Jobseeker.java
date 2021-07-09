package model;

import service.User;

public class Jobseeker implements User {

	private String name;
	private String password;
	private String email;
	private String phone;
	private String experience;
	private String city;
	private String jobseekerId;

	public Jobseeker() {
		super();
	}
	
	public Jobseeker(String name, String password, String email, String phone, String experience, String city,
			String jobseekerId) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.experience = experience;
		this.city = city;
		this.jobseekerId = jobseekerId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getjobSeekerId() {
		return name;
	}

	public void setjobSeekerId(String jobSeekerId) {
		this.jobseekerId = jobSeekerId;
	}

	@Override
	public String toString() {
		return "Jobseeker [name=" + name + ", password=" + password + ", email=" + email + ", phone=" + phone
				+ ", experience=" + experience + ", city=" + city + ", jobseekerId=" + jobseekerId + "]";
	}

	
}
