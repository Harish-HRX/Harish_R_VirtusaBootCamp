package controller;

import java.io.IOException;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.JobseekerDao;
import model.Jobseeker;
import service.UserService;
import service.User;

public class JobseekerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option=request.getParameter("option");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>option="+option);
		switch(option) {
			case "signIn":{
				isValidUser(request,response);
			};
			break;
		
			case "signUp":{
				setJobseeker(request,response);
			};
			break;
			
			case "applyjob":{
				applyJob(request,response);
			};
			break;
			
			case "appliedjobs":{
				request.setAttribute("appliedjobs",UserService.appliedJobs(request.getParameter("jobseekerId")));	
				RequestDispatcher dispatcher=request.getRequestDispatcher("view/viewAppliedJobs.jsp");
				dispatcher.forward(request, response);
			};
			break;
			
			case "searchjobs":{
				request.setAttribute("searchjobs", JobseekerDao.jobRetrieve());	
				RequestDispatcher dispatcher=request.getRequestDispatcher("view/viewJobs.jsp");
				dispatcher.forward(request, response);
			};
			break;
			
			case "logout":{	
				HttpSession session=request.getSession(false);
				session.invalidate();
				RequestDispatcher dispatcher=request.getRequestDispatcher("src/main/webapp/view/index.jsp");
				dispatcher.forward(request, response);
			};
			break;
		}
	}
	
	private static void isValidUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("isvalide Jobseeker :"+request.getParameter("user")+" "+request.getParameter("Email")+" "+request.getParameter("Password"));
		User User = UserService.signInAs(request.getParameter("user"),request.getParameter("Email"),request.getParameter("Password"));
		
		if (User != null) {
				HttpSession session=request.getSession(true);
				session.setAttribute("userName", ((Jobseeker) User).getName());
				session.setAttribute("userId", ((Jobseeker) User).getjobSeekerId());
				System.out.println("Jobseeker found");
				response.sendRedirect("view/JobseekerLobby.jsp");
		}
	    else {
				System.out.println("Jobseeker not found");
				RequestDispatcher dispatcher=request.getRequestDispatcher("view/SignInJobseeker.jsp");
				dispatcher.forward(request, response);
		}

	}
	
	private static void applyJob(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*
		HttpSession session=request.getSession(false);
		String jobseekerId=session.getAttribute("userId").toString();
		String jobid=request.getParameter("jobId");
		Jobseeker jobseeker=new Jobseeker();
		Map<String, Jobseeker> jobseekers=JobseekerDao.jobseekerRetrieve();
		
		for (Map.Entry<String, Jobseeker> entry : jobseekers.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	        if((entry.getValue().getjobSeekerId()).equals(jobseekerId)){
	        	jobseeker.setCity(entry.getValue().getCity());
	        	jobseeker.setEmail(entry.getValue().getEmail());
	        	jobseeker.setExperience(entry.getValue().getExperience());
	        	jobseeker.setjobSeekerId(entry.getValue().getjobSeekerId());
	        	jobseeker.setName(entry.getValue().getName());
	        	jobseeker.setPhone(entry.getValue().getPhone());
	        	jobseeker.setPassword(entry.getValue().getPassword());
	        	JobseekerDao.jobApplicantStore(jobseeker,jobid);
	        	break;
	        }
		}*/
		System.out.println("\nSuccessfully applied for this job");
	}
	
	private static void setJobseeker(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/*Jobseeker jobseeker=new Jobseeker();
		jobseeker.setName(request.getParameter("Name"));
		jobseeker.setEmail(request.getParameter("Email"));
		jobseeker.setPassword(request.getParameter("Password"));
		jobseeker.setPhone(request.getParameter("Phone"));
		jobseeker.setCity(request.getParameter("City"));
		jobseeker.setExperience(request.getParameter("Experience"));
		jobseeker.setjobSeekerId(jobseeker.getEmail()+jobseeker.getPhone() );
		JobseekerDao.jobseekerStore(jobseeker);*/
		System.out.println("SignedUpJobseeker");
		RequestDispatcher dispatcher=request.getRequestDispatcher("view/SignInJobseeker.jsp");
		dispatcher.forward(request, response);
	}
	

}
