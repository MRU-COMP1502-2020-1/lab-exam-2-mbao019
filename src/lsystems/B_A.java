package lsystems;

public class B_A extends LRule {

	private char character;
	
	public B_A() {
		
		this.character = 'B';
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
