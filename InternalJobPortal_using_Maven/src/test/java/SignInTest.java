import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignInTest {

	
	void should_ReturnNull_When_Not_InvalidEmployer() {
		String email="harish@123";
		String password="123";
		int option=1;
		
		Client client=SignIn.isValidUser(email,password,option);

		assertNull(client);
	}
	
	@Test
	void should_ReturnNotNull_When_ValidEmployer() {
		String email="harish@gmail.com";
		String password="Hh123";
		int option=1;
		
		Client client=SignIn.isValidUser(email,password,option);
		System.out.println(client);
		
		assertNotNull(client);
	}
	

	void should_ReturnNull_When_Not_InvalidjobSeeekr() {
		String email="harish@123";
		String password="123";
		int option=2;
		
		Client client=SignIn.isValidUser(email,password,option);

		assertNull(client);
	}
	
	
	void should_ReturnNotNull_When_ValidjobSeeekr() {
		String email="44";
		String password="44";
		int option=2;
		
		Client client=SignIn.isValidUser(email,password,option);

		assertNotNull(client);
	}

}
