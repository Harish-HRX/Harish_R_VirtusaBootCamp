import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HomePage {
	
	protected Client client;
	protected static Map<String,Employer> employers=
			new HashMap<String,Employer>();
	protected static Map<String,JobSeeker> jobseekers=
			new HashMap<String,JobSeeker>();
	protected static List<Job> jobs=new ArrayList<Job>();
	List<JobSeeker>  applicants=new LinkedList<JobSeeker>();
	
	public Client createClient(){
			
			Scanner in=new Scanner(System.in);
			
			System.out.println("Register as\n");
			System.out.println("1.Employer  |  2.Job Seeker");
			int option;
			
			for(boolean valid=false;!valid;) {
				option=in.nextInt();
				if(option==1) {
					client=new Employer();
					valid=true;
				}
				else if(option==2) {
					client=new JobSeeker();
					valid=true;
				}
				else {
					System.out.println("Wrong option try again!!");
				}
			}
			
			return client;
			//in.close();
		}
		
		public void loginDetails(){
			
			
			
			Scanner in=new Scanner(System.in);
			SignUp signUp=new SignUp();
			System.out.println("========================================");
			System.out.println("\t\t Home");
			System.out.println("========================================");
			
			System.out.println("1.SignIn    |  2.SignUp");
			int option;
			
			
			for(boolean valid=false;!valid;) {
				option=in.nextInt();
				switch(option) {
				
					case 1:{
					lobby();
					valid=true;
					}
					break;
				
					case 2:{
					Client client=createClient();	
					signUp.signUpAs(client,HomePage.employers,HomePage.jobseekers);
					lobby();
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
		
		public void lobby() {
			SignIn signIn=new SignIn();
			EmployersLobby eLobby=new EmployersLobby();
			JobSeekersLobby jLobby=new JobSeekersLobby();
			
			Client client=signIn.signInAs(HomePage.employers,HomePage.jobseekers);
			
			if(client!=null)
			{
				if(client instanceof Employer) {
					eLobby.employersMenu(client,jobs);
				}
				else if(client instanceof JobSeeker) {
					jLobby.jobSeekersMenu(client,jobs);
				}
			}
			else {
				loginDetails();
			}
			
			
		}
}
