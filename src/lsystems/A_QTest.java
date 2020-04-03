package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class A_QTest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new A_Q();
		
		assertEquals('A', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new A_Q();
		
		char[] expectedArray = {'Q'};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}