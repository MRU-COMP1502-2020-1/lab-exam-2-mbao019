package lsystems;

public class A_A extends LRule {

	private char character;
	
	
	public A_A() {
		
		this.character = 'A';
	} 
	
	@Override
	public char getMatch() {

		return this.character;
	}

	@Override
	public char[] getBody() {

		return new char[] {'A'};
	}

}
