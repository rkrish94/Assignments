package week4.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		int[] data = {4,3,6,8,29,1,2,4,7,8};

		Set<Integer> dataSet = new LinkedHashSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			if(dataSet.contains(data[i])) {
				System.out.println(data[i]);
			} else {
				dataSet.add(data[i]);
			}
		}
	}

}
