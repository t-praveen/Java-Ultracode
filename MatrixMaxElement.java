package ultracode;
import java.util.Scanner;

public class MatrixMaxElement {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rows and columns in the matrix: ");
		int row = in.nextInt();
		int col = in.nextInt();
		int[][] matrix = prepareMatrix(row, col);
		findMaxInEachRow(matrix);
		in.close();
	}
	private static int[][] prepareMatrix(int row, int column){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of Matrix : ");
		int matrix[][] = new int[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Entered Matrix : " );
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print(" " +matrix[i][j]+"\t");
			}
			System.out.println();
		}
		return matrix;
	}

	private static void findMaxInEachRow(int[][] matrix){
		int[] tempArray = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			int max = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if(max < matrix[i][j]){
					max = matrix[i][j];
				}
				tempArray[i] = max;
			}         
		}
		for (int i = 0; i < tempArray.length; i++) {
			System.out.println("Maximum element in row-" + (i + 1) + " = " + tempArray[i]);
		}
	}

		
	}

