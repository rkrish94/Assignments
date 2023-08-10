package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {

		int number = -40;

		if(number < 0) {
			number = number * -1;

			/* Alternate ways to achieve the output
			number = -number;
			number = Math.abs(number); */

			System.out.println("The Output : " + number);
		}

	}

}
