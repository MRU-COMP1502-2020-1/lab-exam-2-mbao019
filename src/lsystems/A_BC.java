package lsystems;

public class A_BC extends LRule {

	private char character;
	
	public A_BC() {
		
		this.character = 'A';
	}
	
	@Override
	public char getMatch() {

		return this.character;
	}

	@Override
	public char[] getBody() {
		
		return new char[] {'B', 'C'};
	}

}
