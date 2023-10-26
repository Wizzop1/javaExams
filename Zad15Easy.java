package algtut;

import java.util.Scanner;

public class Zad15Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String chara = "*";
		for(int i=0;i<num+1;i++) {
			System.out.println(chara.repeat(i));
		}
	}

}
