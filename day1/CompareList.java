package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class CompareList {

	public static void main(String[] args) {

		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list1.add(a[i]);
		}

		for (int j = 0; j < b.length; j++) {
			list2.add(b[j]);
		}

		System.out.println("Integers in List 01 : " + list1);
		System.out.println("Integers in List 02 : " + list2);

		List<Integer> commonIntegers = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					commonIntegers.add(a[i]);
				}
			}
		}
		System.out.println("Common Integers found in the above 2 list : " + commonIntegers);

	}

}
