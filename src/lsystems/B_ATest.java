package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;


public class B_ATest {


	@Test
	public void getMatch() {
		
		
		LRule rule = new B_A();
		
		assertEquals('B', rule.getMatch());
	
			
	}

	@Test
	public void getBody() {
			
		
		LRule rule = new B_A();
		
		char[] expectedArray = {'A'};
		
		assertArrayEquals(expectedArray, rule.getBody());
		
	}
	
}