package algtut;

public class Zad4Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 5};
		int arr2[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[(arr.length-1)-i];

		}
		System.out.println("!!!!!!!!1");
		for(int i:arr2) {
			System.out.println(i);
		}
		
	}

}
