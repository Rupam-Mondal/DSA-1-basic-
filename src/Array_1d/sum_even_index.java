package Array_1d;

public class sum_even_index {
	public static void main(String args[]) {
		int[] arr = {3 , 20 , 4 , 6 , 9};
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Answer is = "+sum);
	}

}
