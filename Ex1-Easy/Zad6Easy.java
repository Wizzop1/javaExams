package algtut;

public class Zad6Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]arr = {{1,2},{3,4}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				sum+=arr[i][j];
				sum+=arr[i][(arr.length-1)-i];
				break;
			}
		}
		System.out.println(sum);

	}

}
