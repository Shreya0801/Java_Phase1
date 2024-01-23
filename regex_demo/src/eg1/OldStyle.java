package eg1;

public class OldStyle {

	public static void main(String[] args) {
	
		String s="s  fdkZZ,, *90-.91.  jSSjhkd AAs";
		int alpha=0,upper=0,lower=0,digits=0,alphanum=0,spaces=0,special=0 ;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digits++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				spaces++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println("Alphabets count = "+alpha);
		System.out.println("Upper Alphabets count = "+upper);
		System.out.println("Lower Alphabets count = "+lower);
		System.out.println("Digts count = "+digits);
		System.out.println("AlphaNumeric count = "+alphanum);
		System.out.println("Spaces count = "+spaces);
		System.out.println("Special count = "+special);
	}

}