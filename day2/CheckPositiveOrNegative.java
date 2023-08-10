package week1.day2;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {

		int number = -40;
		if (number < 0) {
			System.out.println("The given number " + number + " is negative");
		} else if(number > 0) {
			System.out.println("The given number " + number + " is positive");
		} else {
			System.out.println("The given number " + number + " is neither positive nor negative");
		}
	}

}
