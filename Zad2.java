package algtut;

import java.util.Arrays;

public class Zad2 {
	int[] reverseArray(int []arr) {
		int []reversedArray = new int[10];
		for(int i=9;i>=0;i--) {
			reversedArray[9-i] = arr[i];
			System.out.println(reversedArray[9-i]);
		}
		return reversedArray;
	}
	public static void main(String[] args) {
		Zad2 obj = new Zad2();
		int []newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(obj.reverseArray(newArray)));

	}

}
