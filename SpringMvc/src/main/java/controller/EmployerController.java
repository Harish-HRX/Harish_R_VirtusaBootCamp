package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.EmployerDao;
import model.Employer;
import model.Job;
import service.UserService;
import service.User;


@WebServlet("/employerController")
public class EmployerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option=request.getParameter("option");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>option="+request.getParameter("email"));
		switch(option) {
			case "signIn":{
				isValidUser(request,response);
			};
			break;
		
			case "signUp":{
				setEmployer(request,response);
			};
			break;
			
			case "viewApplicants":{ 
				request.setAttribute("applicants",EmployerDao.jobApplicantRetrieve());
				RequestDispatcher dispatcher=request.getRequestDispatcher("view/viewApplicants.jsp");
				dispatcher.forward(request, response);
			};
			break;
			case "postJobs":{
				jobPost(request,response);
			};
			break;
			case "logout":{	
				HttpSession session=request.getSession(false);
				session.invalidate();
				RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
				dispatcher.forward(request, response);
			};
			break;
		}
	}
	
	private static void isValidUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("isvalide Employer :"+request.getParameter("user")+" "+request.getParameter("Email")+" "+request.getParameter("Password"));
		User User = UserService.signInAs(request.getParameter("user"),request.getParameter("Email"),request.getParameter("Password"));
		
		if (User != null) {
				HttpSession session=request.getSession(true);
				session.setAttribute("userName", ((Employer) User).getName());
				session.setAttribute("userId", ((Employer) User).getEmployerId());
				System.out.println("Employer found");
				response.sendRedirect("view/EmployerLobby.jsp");
		}
	    else {
				System.out.println("Employer not found");
				RequestDispatcher dispatcher=request.getRequestDispatcher("view/SignInEmployer.jsp");
				dispatcher.forward(request, response);
		}
	}
	
	private static void jobPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*HttpSession session=request.getSession(false);
		String employerId=session.getAttribute("userId").toString();
		System.out.println("Jobpost:"+employerId+":"+(session.getAttribute("userName").toString()));
		Job job=new Job();
		job.setCompanyName((String)request.getAttribute("companyName"));
		job.setEmployerId(employerId);
		job.setEmployment((String)request.getAttribute("Employment"));
		job.setJobDescription((String)request.getAttribute("JobDescription"));
		job.setJobLocation((String)request.getAttribute("JobLocation"));
		StringBuffer sbr = new StringBuffer(employerId);
		job.setJobId( sbr.reverse().toString());
		job.setJobTitle((String)request.getAttribute("JobTitle"));
		job.setLanguage((String)request.getAttribute("Languages"));
		EmployerDao.jobstore(job);*/
		System.out.println("Job Posted");
		RequestDispatcher dispatcher=request.getRequestDispatcher("view/PostJobs.jsp");
		dispatcher.forward(request, response);
	}
	
	private static void setEmployer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	/*	Employer employer=new Employer();
		employer.setName(request.getParameter("Name"));
		employer.setEmail(request.getParameter("Email"));
		employer.setPassword(request.getParameter("Password"));
		employer.setPhone(request.getParameter("Phone"));
		employer.setCompanyName(request.getParameter("companyName"));
		employer.setCompanyType(request.getParameter("companyType"));
		employer.setJob(request.getParameter("Job"));
		employer.setEmployerId(employer.getPhone()+employer.getEmail());
		EmployerDao.employerStore(employer);*/
		System.out.println("SignedUpemployer");
		RequestDispatcher dispatcher=request.getRequestDispatcher("view/SignInEmployer.jsp");
		dispatcher.forward(request, response);
	}
	

}

