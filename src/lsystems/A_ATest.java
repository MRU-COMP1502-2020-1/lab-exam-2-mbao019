package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class A_ATest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new A_A();
		
		assertEquals('A', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new A_A();
		
		char[] expectedArray = {'A'};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}
