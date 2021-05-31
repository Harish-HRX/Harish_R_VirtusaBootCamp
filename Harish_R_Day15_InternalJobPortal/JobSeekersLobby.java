import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JobSeekersLobby {
	
	private List<Job> filteredJobs=new ArrayList<Job>(); 
	
	public void jobSeekersMenu(Client client,List<Job> jobs) {
		Scanner in=new Scanner(System.in);
		JobSeeker jobseeker=(JobSeeker)client;
		System.out.println("\nHello "+jobseeker.getName()+" What would you like to today?");
		
		filteredJobs.clear();
		for (Job job : jobs) {
			filteredJobs.add(job);
		}
		
		int option;
		System.out.println("\n1.Search Jobs\n2.ViewApplications\n3.Logout");
		for(boolean valid=false;!valid;) {
			option=in.nextInt();
			switch(option) {
			
				case 1:{
				searchJobs(client,jobs);
				valid=true;
				}
				break;
			
				case 2:{
				viewApplications(client,jobs);
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
	}
	
	public void searchJobs(Client client,List<Job> jobs) {
		
		Scanner in=new Scanner(System.in);
		
		for (Job job : filteredJobs) {
			System.out.println("--"+job.jobId+"-------------------");
            System.out.println("Company: "+job.companyName+" Job Title: "+job.jobTitle);
            System.out.println("Employment: "+job.employment+" Skill Required: "+job.language);
            System.out.println("Locatin: "+job.jobLocation+" Description: "+job.jobDescription);
		}
		
		System.out.println("\n1.Apply for a job\n2.Apply filter");
		int option;
		for(boolean valid=false;!valid;) {
			option=in.nextInt();
			switch(option) {
			
				case 1:{
				applyJobs(client,jobs);
				valid=true;
				}
				break;
			
				case 2:{
				filterJobs(client,jobs);
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
	}	
	
	public void filterJobs(Client client,List<Job> jobs) {
		 
		 Scanner in=new Scanner(System.in);
		 System.out.println("1.Company name   2.Job Title");
		 System.out.println("\n3.Language        4.Location");
		 int option;
		 String filter="";
		 
		 for(boolean valid=false;!valid;) {
				option=in.nextInt();
				switch(option) {
				
					case 1:{
						System.out.println("Enter the Company name:");
						in.nextLine();
						filter=in.nextLine();
						System.out.println("Enter the Company name:"+filter);
						for (Job job : filteredJobs) {
							if((job.companyName).equals(filter)) {
							System.out.println("--"+job.jobId+"------------------");
				            System.out.println("Company: "+job.companyName+" Job Title: "+job.jobTitle);
				            System.out.println("Employment: "+job.employment+" Skill Required: "+job.language);
				            System.out.println("Locatin: "+job.jobLocation+" Description: "+job.jobDescription);
							}
							
						}	
					valid=true;
					}
					break;
				
					case 2:{
						System.out.println("Enter the Job Title:");
						filter=in.nextLine();
						for (Job job : filteredJobs) {
							if((job.jobTitle).equals(filter)) {
							System.out.println("--"+job.jobId+"-------------------\n");
				            System.out.println("Company: "+job.companyName+" Job Title: "+job.jobTitle);
				            System.out.println("Employment: "+job.employment+" Skill Required: "+job.language);
				            System.out.println("Locatin: "+job.jobLocation+" Description: "+job.jobDescription);
				            filteredJobs.add(job);
							}
							else 
								filteredJobs.remove(job);
						}	
					valid=true;
					}
					break;
					
					case 3:{
						System.out.println("Enter the Language name:");
						filter=in.nextLine();
						for (Job job :filteredJobs) {
							if((job.language).equals(filter)) {
							System.out.println("--"+job.jobId+"-------------------\n");
				            System.out.println("Company: "+job.companyName+" Job Title: "+job.jobTitle);
				            System.out.println("Employment: "+job.employment+" Skill Required: "+job.language);
				            System.out.println("Locatin: "+job.jobLocation+" Description: "+job.jobDescription);
				            filteredJobs.add(job);
							}
							else 
								filteredJobs.remove(job);
						}	
					valid=true;
					}
					break;
					
					case 4:{
						System.out.println("Enter the Location name:");
						filter=in.nextLine();
						for (Job job : filteredJobs) {
							if((job.jobLocation).equals(filter)) {
							System.out.println("--"+job.jobId+"-------------------\n");
				            System.out.println("Company: "+job.companyName+" Job Title: "+job.jobTitle);
				            System.out.println("Employment: "+job.employment+" Skill Required: "+job.language);
				            System.out.println("Locatin: "+job.jobLocation+" Description: "+job.jobDescription);
							filteredJobs.add(job);
							}
							else 
								filteredJobs.remove(job);
						}	
					}
					break;

					default:{
					System.out.println("Wrong option try again!!");
					}
				}
			}
		 	System.out.println("\n1.Apply\n2.Menu\n3.Logout");
			for(boolean valid=false;!valid;) {
				option=in.nextInt();
				switch(option) {
				
					case 1:{
					applyJobs(client,jobs);
					valid=true;
					}
					break;
					
					case 2:{
					jobSeekersMenu(client,jobs);
					valid=true;
					}
					break;
					
					case 3:{
					SignOut signOut=new SignOut();
					signOut.signOut();
					valid=true;
					}
					break;
				
					default:{
					System.out.println("Wrong option try again!!");
					}
				}
			}
	} 
	
	public void viewApplications(Client client,List<Job> jobs) {
		Scanner in=new Scanner(System.in);
		JobSeeker jobseeker=(JobSeeker)client;
		boolean flag=false;
		
		for(Job appliedJob: jobs) {
			for(JobSeeker applicantions :appliedJob.applicants) {
				if((applicantions.getjobSeekerId()).equals(jobseeker.getjobSeekerId())){
					System.out.println("--"+appliedJob.jobId+"-------------------");
		            System.out.println("Company: "+appliedJob.companyName+" Job Title: "+appliedJob.jobTitle);
		            System.out.println("Employment: "+appliedJob.employment+" Skill Required: "+appliedJob.language);
		            System.out.println("Locatin: "+appliedJob.jobLocation+" Description: "+appliedJob.jobDescription);
		            flag=true;
				}
			}
		}
		
		if(!flag) {
			System.out.println("You have not yet applied for a job!!\n");
		}
		
		System.out.println("\n1.Menu\t2.Logout");
	 	int option=in.nextInt();
		for(boolean valid=false;!valid;) {
			
			switch(option) {
				
				case 1:{
				jobSeekersMenu(client,jobs);
				valid=true;
				}
				break;
				
				case 2:{
				SignOut signOut=new SignOut();
				signOut.signOut();
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
	}
	
	
	public void applyJobs(Client client,List<Job> jobs) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Job ID number to be applied:");
		int id=in.nextInt();
		JobSeeker jobseeker=(JobSeeker)client;
		
		for(Job job:filteredJobs) {
			System.out.println("--"+job.jobId+"----------------------------\n");
            System.out.println("Company: "+job.companyName+" Job Title: "+job.jobTitle);
            System.out.println("Employment: "+job.employment+" Skill Required: "+job.language);
            System.out.println("Locatin: "+job.jobLocation+" Description: "+job.jobDescription);
		}
		
		boolean flag=false;
		for (Job job : jobs) {
			if(job.jobId==id) {
				job.applicants.add(jobseeker);
				System.out.println("\nSuccessfully applied for the job");
				flag=true;
			}
		}
		
		if(!flag) {
			System.out.println("No Such Job Id found, Try again");
		}
	
	 	System.out.println("\n1.Menu\t2.Logout");
	 	int option=in.nextInt();
		for(boolean valid=false;!valid;) {
			
			switch(option) {
				
				case 1:{
				jobSeekersMenu(client,jobs);
				valid=true;
				}
				break;
				
				case 2:{
				SignOut signOut=new SignOut();
				signOut.signOut();
				valid=true;
				}
				break;
			
				default:{
				System.out.println("Wrong option try again!!");
				}
			}
		}
	} 
	
}
