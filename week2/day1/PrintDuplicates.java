package week2.day1;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrLength = arr.length;

		System.out.println("The Duplicates in the array are :");
		for (int i = 0; i < arrLength; i++) {

			for (int j = i+1; j < arrLength; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[i]);
				}
			}
		}
	}

}
