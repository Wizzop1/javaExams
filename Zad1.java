package algtut;

import java.util.Scanner;

public class Zad1 {
	int sumOfElements(int [] arr) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	int sumOfEvenElements(int [] arr) {
		int sumEven=0;
		for(int i:arr) {
			if(i%2==0) sumEven+=i;
		}
		return sumEven;
	}
	int sumOfOddElements(int [] arr) {
		int sumOdd=0;
		for(int i:arr) {
			if(i%2>=1) sumOdd+=i;
		}
		return sumOdd;
	}
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		int length5arr [] = {1, 2, 3, 4, 5};
		Zad1 obj = new Zad1();
		System.out.println("Sum: " + obj.sumOfElements(length5arr));
		System.out.println("Even: "+obj.sumOfEvenElements(length5arr));
		System.out.println("Odd: "+obj.sumOfOddElements(length5arr));
	}

}
