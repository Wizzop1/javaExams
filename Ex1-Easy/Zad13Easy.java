package algtut;
import java.util.Scanner;

public class Zad13Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		boolean simp=true;
		for (int i = 2; i <= n / 2; i++)  {
			if (n % i == 0) {
	            simp= false;
	        }
		}
		if(n<2) simp = false;
		
		System.out.println(simp);
	}

}
