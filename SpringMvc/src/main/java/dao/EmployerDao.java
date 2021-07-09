package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import utility.ConnectionManager;
import model.Employer;
import model.Job;
import model.Jobseeker;

public class EmployerDao {
	
		public static void employerStore(Employer employer){
		String employeestore = "insert into employer values(?,?,?,?,?,?,?,?)";
		try{
			Connection connection = ConnectionManager.getConnection();
		
			PreparedStatement pstmt = connection.prepareStatement(employeestore);
			pstmt.setString(1, employer.getName());
			pstmt.setString(2, employer.getPhone());
			pstmt.setString(3, employer.getEmail());
			pstmt.setString(4, employer.getPassword());
			pstmt.setString(5, employer.getCompanyName());
			pstmt.setString(6, employer.getCompanyType());
			pstmt.setString(7, employer.getJob());
			pstmt.setString(8, employer.getEmployerId());
			pstmt.executeUpdate();
	
			} 	
			catch (SQLException e) {
				System.out.println(e);
			}
		}
	
		public static Map<String, Employer> employerRetrieve(){
			String empretrive = "select * from employer";
			Map<String, Employer> employers = new HashMap<String, Employer>();
			try{
				Connection connection = ConnectionManager.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(empretrive);
			
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					Employer employer = new Employer();
					employer.setName(rs.getString(1));
					employer.setPhone(rs.getString(2));
					employer.setEmail(rs.getString(3));
					employer.setPassword(rs.getString(4));
					employer.setCompanyName(rs.getString(5));
					employer.setCompanyType(rs.getString(6));
					employer.setJob(rs.getString(7));
					employer.setEmployerId(rs.getString(8));
					employers.put(employer.getEmail(), employer);
				}
			} 
			catch (SQLException e) {
				System.out.println(e);
			}	
			return employers;
		}
		
		public static void jobstore(Job job){
			String jobstore = "insert into jobs values(?,?,?,?,?,?,?,?)";
			try{
				Connection connection = ConnectionManager.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(jobstore);
				
				pstmt.setString(1,job.getCompanyName());
				pstmt.setString(2,job.getJobTitle());
				pstmt.setString(3,job.getLanguage());
				pstmt.setString(4,job.getEmployment());
				pstmt.setString(5,job.getJobDescription());
				pstmt.setString(6,job.getJobLocation());
				pstmt.setString(7,job.getEmployerId());
				pstmt.setString(8,job.getJobId());
				pstmt.executeUpdate();
		
			} 
			catch (SQLException e) {
				System.out.println(e);
			}
		}
		
		public static Map<String, Jobseeker> jobApplicantRetrieve(){
			String jobapplicantretrive = "select * from jobApplicants";
			Map<String, Jobseeker> applicants = new HashMap<String, Jobseeker>();
			try{
				Connection connection = ConnectionManager.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(jobapplicantretrive);
				ResultSet rs = pstmt.executeQuery();
				
				while (rs.next()) {
					Jobseeker jobseeker = new Jobseeker();
					jobseeker.setName(rs.getString(1));
					jobseeker.setEmail(rs.getString(2));
					jobseeker.setPassword(rs.getString(3));
					jobseeker.setPhone(rs.getString(4));
					jobseeker.setExperience(rs.getString(5));
					jobseeker.setCity(rs.getString(6));
					jobseeker.setjobSeekerId(rs.getString(8));
					applicants.put(rs.getString(7), jobseeker);
				}
			} 
			catch (SQLException e) {
				System.out.println(e);
			}
			return applicants;
		}
}
