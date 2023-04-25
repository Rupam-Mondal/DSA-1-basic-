package Array_2D;

public class question1 {
	public static void main(String args[]) {
		int[][] arr = {{1 , 2 , -3 , 4} , {0 , 0 , -4 , 2} , {1 , -1 , 2 , 3} , {-4 , -5 , -7 , 0}};
		int countpos = 0 , countneg = 0, countodd = 0, counteven = 0, countzero = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <arr[i].length ; j++) {
				if(arr[i][j] > 0) {
					countpos++;
				}
				else if(arr[i][j] < 0) {
					countneg++;
				}
				else {
					countzero++;
				}
				if(arr[i][j] % 2 == 0) {
					counteven++;
				}
				else {
					countodd++;
				}
			}
		}
		System.out.println(countpos);
		System.out.println(countneg);
		System.out.println(countodd);
		System.out.println(counteven);
		System.out.println(countzero);
	}
}
