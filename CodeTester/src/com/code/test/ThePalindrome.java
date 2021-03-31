package com.code.test;

public class ThePalindrome {

	public int find(String s) {
		String parseS = s;
		for (int j = 0; j < (s.length() * 2); j++) {
			int i;
			for (i = 0; i < parseS.length(); i++) {
				if (parseS.charAt(i) != parseS.charAt((parseS.length() - 1) - i)) {
					break;
				}
			}
			if (i == parseS.length()) {
				return parseS.length();
			}
			parseS = s;
			for (int k = j; k >= 0; k--) {
				parseS = parseS + s.charAt(k);
			}
		}
		return parseS.length();			
	}
	
	public static void main(String[] args) {
		ThePalindrome thisClass = new ThePalindrome();
		thisClass.find("abababb");
	}
}
