import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignUpTest {

	@Test
	void should_ReturnFalse_When_Not_ValidMailandPassword() {
		String email="harish@123.com";
		String password="123";
		
		boolean valid=SignIn.isValidMail(email,password);

		assertFalse(valid);
	}
	
	@Test
	void should_ReturnTrue_When_ValidMailandPassword() {
		String email="harish@gmail.com";
		String password="Hrx123";
		
		boolean valid=SignIn.isValidMail(email,password);

		assertTrue(valid);
	}

}
