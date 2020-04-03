package lsystems;

public class A_X extends LRule {

	private char character;
	
	public A_X() {
		
		this.character = 'A';
	}
	
	@Override
	public char getMatch() {

		return this.character;
	}

	@Override
	public char[] getBody() {

		return new char[] {};
	}

}
