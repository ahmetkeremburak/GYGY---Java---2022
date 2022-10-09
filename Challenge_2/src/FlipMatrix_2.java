
public class FlipMatrix_2 {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrixFlipped = arrayFlip(matrix);
		arrayPrinter(matrixFlipped);

	}
	
	private static void arrayPrinter(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	// The variable matrix is flipped clockwise
	private static int[][] arrayFlip(int[][] array) {
		
		int[][] arrayFlipped = new int[array.length][array[1].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				arrayFlipped[i][j] = array[-j+2][i]; 
			}
		}
		return arrayFlipped;
	}

	}

