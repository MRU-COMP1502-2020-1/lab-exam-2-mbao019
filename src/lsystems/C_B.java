package lsystems;

public class C_B extends LRule {

	private char character;
	
	public C_B() {
		
		this.character = 'C';
		
	}
	
	@Override
	public char getMatch() {
		
		return this.character;
	}

	@Override
	public char[] getBody() {
		
		return new char[] {'B'};
	}

}
