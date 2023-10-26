package algtut;

public class Zad5Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		int temp=arr[0];
		for(int i =0 ;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println(temp);
	}

}
