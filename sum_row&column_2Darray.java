//printing the sum of elements in row wise and column wise
package Strings;

public class _2Darray {
	public static void sum_row(int[][] arr) {
		System.out.println("Printing the sum in row wise");
		for(int i = 0;i<arr.length;i++) {
			int sum =0;
			for(int j = 0;j<arr[0].length;j++) {
				sum = sum + arr[i][j];
			}
			System.out.println(sum);
		}
	}
	public static void sum_colmn(int[][] arr) {
		System.out.println("Printing the sum in column wise");
		for(int i = 0;i<arr[0].length;i++) {
			int sum =0;
			for(int j = 0;j<arr.length;j++) {
				sum = sum + arr[j][i];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,7},{5,6,8}};
		
		sum_row(arr);
		sum_colmn(arr);
	}

}

