package algtut;

public class Zad4 {
	boolean simpNum(int n) {
		boolean simp=true;
		for (int i = 2; i <= n / 2; i++)  {
			if (n % i == 0) {
	            simp= false;
	        }
	}
		if(n<2) simp = false;
		
		return simp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zad4 obj = new Zad4();
		int num = 5;
		System.out.println(obj.simpNum(num));
	}

}
