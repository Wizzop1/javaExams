package algtut;

public class Zad3 {
	int maxArr(int []arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	int minArr(int[]arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Zad3 obj = new Zad3();
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println(obj.maxArr(arr));
		System.out.println(obj.minArr(arr));
	}

}
