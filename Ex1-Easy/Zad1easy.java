package algtut;

import java.util.Scanner;

public class Zad1easy {

	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int []arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
