package Array_1d;

public class travers {
	public static void main(String args[]) {
		int[] arr = {34 , 21 , 54 , 65 , 43};
		for(int n : arr) {
			if(n % 2 == 0) {
				System.out.println(" "+n);
			}
		}
	}

}
