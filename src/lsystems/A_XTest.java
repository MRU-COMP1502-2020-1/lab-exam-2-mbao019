package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class A_XTest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new A_X();
		
		assertEquals('A', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new A_X();
		
		char[] expectedArray = {};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}