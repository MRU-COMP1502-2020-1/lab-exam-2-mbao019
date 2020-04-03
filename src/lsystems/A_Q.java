package lsystems;

public class A_Q extends LRule {

	private char character;

	public A_Q() {
		
		this.character = 'A';
	}
	
	
	@Override
	public char getMatch() {

		return this.character;
	}

	@Override
	public char[] getBody() {

		return new char[] {'Q'};
	}

}
