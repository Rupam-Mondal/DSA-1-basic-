package Array_2D;

public class question {
	public static void main(String args[]) {
		int[][] arr = {{1 , 2 , 3 , 4 , 5} , {3 , 4 , 5 ,6 , 7} , {7 , 6 , 5 , 4 , 3} , {8 , 7 , 6 , 5 , 4}, {1 , 2 , 37 , 8 , 0}};
		int k = (arr.length - 1)/2;
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(" "+arr[i][k]);
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(i == k) {
				continue;
			}
			else {
				System.out.print(" "+arr[k][i]);
			}
		}
	}
}
