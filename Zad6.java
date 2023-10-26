package algtut;

public class Zad6 {
	void printTree(int n) {
		String star = "*";
		for(int i=0;i<n+1;i++) {
			System.out.println(star.repeat(i));
		}
	}
	public static void main(String[] args) {
		Zad6 obj = new Zad6();
		int n=3;
		obj.printTree(n);
		
	}

}
