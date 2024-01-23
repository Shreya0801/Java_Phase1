package eg1;

public class RegexDemo {

	public static void main(String[] args) {
		/*
		 * Reg-Ex - Regular Expression
		 * Works based on Pattern Matching
		 * Reg-Ex provides set of wild cards which we can use to compare a pattern in your string
		 * 
		 * [] - refers to expression/pattern
		 * {} - length
		 * ^ - not
		 * [a-z]{5} - any 5 lowercase letters
		 * [A-Za-z]{10} - any word of 10 characters
		 * [0-9]{2} - any 2 digits
		 * [a-z0-9]{3,6} - any lowercase alpha numeric value between length 3 & 6
		 * [0-9]{1,} - minimum 1 digit
		 * [^0-9] - apart from digits
		 */
		
		String s="s  fdkZZ,, *90-.91.  jSSjhkd AAs";
		
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", ""));
	}

}