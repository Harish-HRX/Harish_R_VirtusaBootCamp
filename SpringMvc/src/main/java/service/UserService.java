package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import dao.EmployerDao;
import dao.JobseekerDao;
import model.Employer;
import model.Job;
import model.Jobseeker;

public class UserService {

	/*public static void filterjobs(String filter) {
		switch(filter) {
			case "city":{};
			break;
			case "city":{};
			break;
			case "location":{};
			break;
			case "city":{};
			break;
		}
	}*/
	
	public static List<Job> appliedJobs(String jobseekerId){
		System.out.println("Applied jobs");
		Map<String, Jobseeker> applicants =EmployerDao.jobApplicantRetrieve();
		List<Job> jobs=JobseekerDao.jobRetrieve();
		List<Job> appliedJobs=new ArrayList<Job>();
		
		for (Map.Entry<String,Jobseeker> entry : applicants.entrySet()) {
	        if((jobseekerId).equals(entry.getValue().getjobSeekerId())) {
	        	for(Job job:jobs) {
	        		if((job.getJobId()).equals(entry.getKey())) {
	        			System.out.println("="+job.getJobTitle());
	        			appliedJobs.add(job);
	        		}
	        	}
	        }
	    }
		
		return appliedJobs;
	}
	
	public static User isValidUser(String name,String email,String password){
		String pwd = "";
		User user = null;
		System.out.println("isValid : "+name+" "+email+" "+password);
		Map<String, Employer> employers=null;
		Map<String, Jobseeker> jobseekers=null;
		employers = EmployerDao.employerRetrieve();
		jobseekers = JobseekerDao.jobseekerRetrieve();
		
		if (name.equals("employer")) {
			if (employers.containsKey(email)) {
				user = employers.get(email);
				pwd =  employers.get(email).getPassword();
			} 
			else return null;
		} 
		else if (name.equals("jobseeker")) {
			if (jobseekers.containsKey(email)) {
				user = jobseekers.get(email);
				pwd = jobseekers.get(email).getPassword();
			} 
			else return null;
		}
		
		if (!password.equals(pwd)) 
			return null;
		 else
			return user;

	}
	
	public static User signInAs(String name,String email,String password){
		System.out.println("SignInas : "+name+" "+email+" "+password);
		
		User user = UserService.isValidUser(name,email,password);
		System.out.println("SignInas-User= : "+user);
		if (user != null) 
			return user;
	    else 
			return null;
		
	}
}
