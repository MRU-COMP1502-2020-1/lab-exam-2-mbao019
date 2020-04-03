package lsystems;

public class A_AA extends LRule {

	private char character;
	
	public A_AA() {
		
		this.character = 'A';
	}
	
	@Override
	public char getMatch() {

		return this.character;
	}

	@Override
	public char[] getBody() {

		return new char[] {'A', 'A'};
	}

}
