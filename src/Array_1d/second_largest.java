package Array_1d;

public class second_largest {
	public static void main(String args[]) {
		int[] arr = {34 , 21 , 54 , 65 , 43};
		int max = 0;
		int sec_max = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(max == arr[i]) {
				arr[i] = 0;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > sec_max) {
				sec_max = arr[i];
			}
		}
		System.out.println("Answer is = "+sec_max);
	}

}
