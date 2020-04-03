package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class C_BTest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new C_B();
		
		assertEquals('C', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new C_B();
		
		char[] expectedArray = {'B'};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}