package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {

		String text = "PayPal India";
		char[] charArray = text.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (Character character : charArray) {
			if(charSet.contains(character)) {
				dupCharSet.add(character);
			} else {
				charSet.add(character);
			}
		}
		charSet.removeAll(dupCharSet);
		for (Character character : charSet) {
			if(character != ' ') {
				System.out.println(character);
			}
		}

	}

}
