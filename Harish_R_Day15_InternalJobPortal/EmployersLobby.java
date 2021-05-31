import java.util.List;
import java.util.Scanner;

public class EmployersLobby {
	
	public void employersMenu(Client client,List<Job> jobs) {
		
		Scanner in=new Scanner(System.in);
		SignOut signout=new SignOut();
		Employer employer=(Employer)client;
		System.out.println("Hello "+employer.getName()+" What would you like to do today?");
		
		int option;
		System.out.println("\n1.PostJobs\n2.ViewApplicants\n3.View ShortListedApplicants\n4.Logout");
		for(boolean valid=false;!valid;) {
			option=in.nextInt();
			switch(option) {
			
				case 1:{
				postJobs(client,jobs);
				valid=true;
				}
				break;
			
				case 2:{
				viewApplicants(client,jobs);
				valid=true;
				}
				break;
				
				case 3:{
				shortListApplicant(client,jobs);	
				valid=true;
				}
				
				case 4:{
				signout.signOut();
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
		
	}
	
	public void shortListApplicant(Client client,List<Job> jobs) {
		Scanner in=new Scanner(System.in);
		SignOut signout=new SignOut();
		Employer employer=(Employer)client;
		int count=0;
		
		for(Job job:jobs) {
			if((job.employerId).equals(employer.getEmployerId())) {
				for(JobSeeker applicant:job.applicants) {
					System.out.println("--"+(++count)+"------------------------");
					System.out.println("Name: "+applicant.getName());
					System.out.println("E-mail ID: "+applicant.getEmail());
					System.out.println("Password: "+applicant.getPassword());
					System.out.println("Phone number: "+applicant.getPhone());
					System.out.println("City: "+applicant.getCity());
					System.out.println("Experience:"+applicant.getExperience());
				}
			}
		}
		
		int option;
		System.out.println("\n1.Menu\n2.Logout");
		for(boolean valid=false;!valid;) {
			option=in.nextInt();
			switch(option) {
			
				case 1:{
				employersMenu(client,jobs);
				valid=true;
				}
				break;
			
				case 2:{
				signout.signOut();
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
	}
	
	
	public void viewApplicants(Client client,List<Job> jobs) {
		
		Scanner in =new Scanner(System.in);
		SignOut signout=new SignOut();
		Employer employer=(Employer)client;
		int choice;
			boolean flag=false;
			int count=0;
			for(Job jobsPosted:jobs) {
				if((jobsPosted.employerId).equals(employer.getEmployerId())) {
					flag=true;
					for(JobSeeker applicant:jobsPosted.applicants) {
						System.out.println("--"+(++count)+"------------------------");
						System.out.println("Name: "+applicant.getName());
						System.out.println("E-mail ID: "+applicant.getEmail());
						System.out.println("Password: "+applicant.getPassword());
						System.out.println("Phone number: "+applicant.getPhone());
						System.out.println("City: "+applicant.getCity());
						System.out.println("Experience:"+applicant.getExperience());
						System.out.println("Shortlist this applicant?");
						System.out.println("1.Yes\t2.No");
						choice=in.nextInt();
					}
				}
			}
			if(count==0) {
				System.out.println("No Applicants have applied!!");
			}
			if(!flag) {
				System.out.println("No jobs posted yet!!");
			}
			
				
		/*if((employer.jobsposted).size()!=0) {
			int count=0;
			for(Job jobsPosted:employer.jobsposted) {
				if((employer.jobsposted).size()!=0) {
					for(JobSeeker applicants:jobsPosted.applicants) {
						System.out.println((count++)+"."+applicants);
					}
				}
				else {
					System.out.println("No Applicants have applied!!");
				}
			}
		}
		else { 
			System.out.println("No jobs posted yet!!");
		}*/
		int option;
		System.out.println("\n1.Menu\n2.Logout");
		for(boolean valid=false;!valid;) {
			option=in.nextInt();
			switch(option) {
			
				case 1:{
				employersMenu(client,jobs);
				valid=true;
				}
				break;
			
				case 2:{
				signout.signOut();
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
	}
	
	public void postJobs(Client client,List<Job> jobs) {
		
		Scanner in=new Scanner(System.in);
		Employer employer=(Employer)client;
		
		Job job=new Job();
		System.out.println("Enter your Company name:");
		job.companyName=in.nextLine();
		System.out.println("Enter the Job title:");
		job.jobTitle=in.nextLine();
		System.out.println("Enter the main language:");
		job.language=in.nextLine();
		System.out.println("Enter the kind of employment:");
		job.employment=in.nextLine();
		System.out.println("Enter the Job description:");
		job.jobDescription=in.nextLine();
		System.out.println("Enter the Job Location:");
		job.jobLocation=in.nextLine();
		job.jobId=jobs.size()+1;
		job.employerId=employer.getEmployerId();
		
		jobs.add(job);
		System.out.print("Job posted successfully\n");
		SignOut l=new SignOut();
		
		int option;
		System.out.println("\n1.Menu\n2.Logout");
		for(boolean valid=false;!valid;) {
			option=in.nextInt();
			switch(option) {
			
				case 1:{
				employersMenu(client,jobs);
				valid=true;
				}
				break;
			
				case 2:{
				l.signOut();
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
		//in.close();
	} 
	
	
}
