package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {

		int firstNumber = 0, secondNumber = 1, sum;

		System.out.println("Fibonacci series for the first 8 numbers");
		System.out.println(firstNumber);
		System.out.println(secondNumber);

		for (int count = 3, range = 8; count <= range; count++) {
			sum = firstNumber + secondNumber;
			System.out.println(sum);
			firstNumber = secondNumber;
			secondNumber = sum;
		}
	}

}
