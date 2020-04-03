package lsystems;

public class LSystemSymbolException extends Exception {
		
	public String getSymbol() {
		
		return "no rule for the sequence";
	}
	
	
}
