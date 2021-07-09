package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utility.ConnectionManager;
import model.Job;
import model.Jobseeker;

public class JobseekerDao {

	public static void jobseekerStore(Jobseeker jobseeker){
		String jobseekerstore = "insert into jobseeker values(?,?,?,?,?,?,?)";
		try{
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(jobseekerstore);
		
			pstmt.setString(1,jobseeker.getName());
			pstmt.setString(2,jobseeker.getPassword());
			pstmt.setString(3,jobseeker.getEmail());
			pstmt.setString(4,jobseeker.getPhone());
			pstmt.setString(5,jobseeker.getExperience());
			pstmt.setString(6,jobseeker.getCity());
			pstmt.setString(7,jobseeker.getjobSeekerId());
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static Map<String, Jobseeker> jobseekerRetrieve(){
		String jobskretrive = "select * from jobseeker";
		Map<String, Jobseeker> jobseekers = new HashMap<String, Jobseeker>();
		try{
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(jobskretrive);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Jobseeker jobseeker = new Jobseeker();
				jobseeker.setName(rs.getString(1));
				jobseeker.setPassword(rs.getString(2));
				jobseeker.setEmail(rs.getString(3));
				jobseeker.setPhone(rs.getString(4));
				jobseeker.setExperience(rs.getString(5));
				jobseeker.setCity(rs.getString(6));
				jobseeker.setjobSeekerId(rs.getString(7));
				jobseekers.put(jobseeker.getEmail(), jobseeker);
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		return jobseekers;
	}


	public static void jobApplicantStore(Jobseeker js, String jobid){
		String jobApplicantStore = "insert into jobapplicants values(?,?,?,?,?,?,?,?)";
		try{
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(jobApplicantStore);
			pstmt.setString(1, js.getName());
			pstmt.setString(2, js.getEmail());
			pstmt.setString(3, js.getPassword());
			pstmt.setString(4, js.getPhone());
			pstmt.setString(5, js.getExperience());
			pstmt.setString(6, js.getCity());
			pstmt.setString(7, jobid);
			pstmt.setString(8, js.getjobSeekerId());
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static List<Job> jobRetrieve(){
		String jobretrive = "select * from jobs";
		List<Job> jobs = new ArrayList<Job>();
		try{
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(jobretrive);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) 
			{
				Job job = new Job();
				job.setCompanyName(rs.getString(1));
				job.setJobTitle(rs.getString(2));
				job.setLanguage(rs.getString(3));
				job.setEmployment(rs.getString(4));
				job.setJobDescription(rs.getString(5));
				job.setJobLocation(rs.getString(6));
				job.setEmployerId(rs.getString(7));
				job.setJobId(rs.getString(8));
				jobs.add(job);
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		return jobs;
	}
}
