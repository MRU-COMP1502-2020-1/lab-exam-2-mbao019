package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	private boolean isMatch;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		
		if (line.length == 0) {
			throw new LSystemLengthException("no sequence of characters in it");
		}

		ArrayList<Character> characterList = new ArrayList<Character>();
		
		for (char c : this.line) {
			
			isMatch = false;
			
			for (LRule currRule : this.rules) {
				if (c == currRule.getMatch()) {
					
					isMatch = true;
					
					char[] list = currRule.getBody();
					for(char currChar : list) {
						characterList.add(currChar);
					}
				}
			}
			if(!isMatch) {
				throw new LSystemSymbolException();
			}
		}
		
		char[] toArray = listToArray(characterList);

		this.line = toArray;
	}
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
