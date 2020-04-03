package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class A_AATest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new A_AA();
		
		assertEquals('A', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new A_AA();
		
		char[] expectedArray = {'A', 'A'};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}