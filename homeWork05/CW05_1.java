package firstPac;

public class CW05_1 {
	static int imax = 0;
	static int i = 0;
	static int sumPos = 0;
	static int amoNeg = 0;
	
	public static void main(String[] args) {
	int[] arr = {2,3,-1,3,5,-4,-7};
	
	getMax(arr);
	getSumPositive(arr);
	getAmoNegative(arr);
}
		//maximum
	static void getMax(int[]arr) {
		int max = arr[0];
		while (i < arr.length) {
		if (arr[i]>max) {
			max = arr[i];
			imax = i;}
		i++;
		}
		System.out.println("Maximum: " + max);
	}
		
	//summ positive	
	static void getSumPositive(int[]arr){
		int i = 0;
		while (i < arr.length) {
		if (arr[i] > 0) {
		sumPos += arr[i];}
		i++;
		}
		System.out.println("Sum Positive: " + sumPos);
	}
	
		//amount negative
	static void getAmoNegative(int[]arr){
		int i = 0;
		while (i < arr.length) {
		if (arr[i] < 0) {
		amoNeg++;}
		i++;
		}
		System.out.println("Amount of negativ: " + amoNeg);
		}
	
}
	
	
