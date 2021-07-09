package test.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import service.User;
import org.junit.Test;
import service.UserService;

public class SignInTest {

	@Test
	public void should_ReturnNull_When_Not_InvalidEmployer() {
		String email="harish@123";
		String password="123";
		String name="employer";
		
		User user = UserService.isValidUser(name,email,password);

		assertNull(user);
	}
	
	@Test
	public void should_ReturnNotNull_When_ValidEmployer() {
		String email="harish@gmail.com";
		String password="Hh123";
		String name="employer";
		
		User user=UserService.isValidUser(name,email,password);
		
		assertNotNull(user);
	}
	
	@Test
	public void should_ReturnNull_When_Not_InvalidjobSeeekr() {
		String email="harish@123";
		String password="123";
		String name="jobseeker";
		
		User user1=UserService.isValidUser(name,email,password);

		assertNull(user1);
	}
	
	@Test
	public void should_ReturnNotNull_When_ValidjobSeeekr() {
		String email="deepak@gmail.com";
		String password="Dd123";
		String name="jobseeker";
		
		User user=UserService.isValidUser(name,email,password);

		assertNotNull(user);
	}

}