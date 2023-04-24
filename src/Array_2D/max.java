package Array_2D;

public class max {
	public static void main(String args[]) {
		int[][] arr = {{1 , 2 , 4 , 0} , {2 , 5 , 7 , -1} , {4 , 2 , 6 , 9}};
		int max = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Maximun element is = "+max);
	}
}
