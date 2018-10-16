package arraysAndStrings;

import java.util.Scanner;

public class RotateA2DimensionalGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int[][] grid1 = new int[n][n];
		int counter = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid1[i][j] = counter;
				System.out.printf("%5s", grid1[i][j]);
				counter++;
			}
			System.out.println("");
		}
		rotate2DArray90Degrees(grid1);
	}
		
	private static void rotate2DArray90Degrees(int[][] grid) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("");
		int[][] grid2 = new int[grid.length][grid.length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid2[j][grid.length-i-1]= grid[i][j];
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.printf("%5s", grid2[i][j]);
			}
			System.out.println("");
		}
	}

}
