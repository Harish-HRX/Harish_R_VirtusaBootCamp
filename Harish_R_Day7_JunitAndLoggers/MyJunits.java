
import static org.junit.Assert.*;

import org.junit.Test;

public class MyJunits {
	@Test
	public void testJUnit() {
		String s1=new String("Harish");
		String s2=new String("Harish");
		String s3="Harish";
		String s4="Harish";
		int i1=1,i2=2,i3=1;
		
		assertTrue(i1==i3);
	//	assertnotTrue(i1==i2);
		assertSame(s3,s4);
		assertNotSame(s1,s2);
		assertNull(s1);
	//	asserNotNull(s3);
		assertEquals("a","a");
	}
}