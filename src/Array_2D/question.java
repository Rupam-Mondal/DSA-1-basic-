package Array_2D;

public class question {
	public static void main(String args[]) {
		int[][] arr = {{1 , 2 , 3 , 4 , 5} , {3 , 4 , 5 ,6 , 7} , {7 , 6 , 5 , 4 , 3} , {8 , 7 , 6 , 5 , 4}, {1 , 2 , 37 , 8 , 0}};
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <arr[i].length ; j++) {
				if(j == (arr.length - 1)/2) {
					System.out.print(" "+arr[i][j]);
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <arr[i].length ; j++) {
				if(i == (arr.length - 1)/2) {
					if(i == j) {
						continue;
					}
					else {
						System.out.print(" "+arr[i][j]);
					}
				}
			}
		}
	}
}
