package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class A_BCTest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new A_BC();
		
		assertEquals('A', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new A_BC();
		
		char[] expectedArray = {'B', 'C'};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}