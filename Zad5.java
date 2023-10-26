package algtut;

import java.util.ArrayList;

public class Zad5 {
int sumOfDiagRepeating(int [][]arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			sum+=arr[i][j];
			sum+=arr[i][(arr.length-1)-i];
			break;
		}
	}
	//15
	//15
	return sum;
}
int sumOfDiagNoRepeating(int [][]arr) {
int sum=0;

	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(i!=(arr.length/2)) {
				sum+=arr[i][j];
				sum+=arr[i][(arr.length-1)-i];
				break;
				}else {
					sum+=arr[i][j];
					break;
				}
		}
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zad5 obj = new Zad5();
		int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		System.out.println(obj.sumOfDiagRepeating(arr));
		System.out.println(obj.sumOfDiagNoRepeating(arr));
	}

}
