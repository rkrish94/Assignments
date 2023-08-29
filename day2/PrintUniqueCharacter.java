package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "radhakrishnan";
		char[] charArray = name.toCharArray();

		Set<Character> charSet = new HashSet<Character>();

		for (Character character : charArray) {
			charSet.add(character);
		}
		System.out.println(charSet);

	}

}
