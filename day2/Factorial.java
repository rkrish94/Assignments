package week1.day2;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int number = 5;
		for (int i = 1; i <= number; i++) {
			fact = fact*i;
		}
		System.out.println("The factorial for " + number + " is : " + fact);
	}

}
