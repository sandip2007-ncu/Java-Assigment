import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int rows = input.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int columns = input.nextInt();

        int[][] first_Matrix = new int[rows][columns];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                first_Matrix[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter rows of second matrix: ");
        int rows2 = input.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int columns2 = input.nextInt();

        int[][] second = new int[rows2][columns2];

        System.out.println("Enter second matrix:");

        for (int i = 0; i < rows2; i++) {

            for (int j = 0; j < columns2; j++) {

                second[i][j] = input.nextInt();
            }
        }
        System.out.println("\nFirst Matrix:");
        printMatrix(first_Matrix);
        int[] row = rowSums(first_Matrix);

        System.out.println("Row Sums:");

        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        int[] column = columnSums(first_Matrix);

        System.out.println("\nColumn Sums:");

        for (int i = 0; i < column.length; i++) {
            System.out.print(column[i] + " ");
        }

        int[][] trans = transpose(first_Matrix);

        System.out.println("\nTranspose:");
        printMatrix(trans);
        System.out.println("\nSecond Matrix:");
        printMatrix(second);
        int[] row2 = rowSums(second);

        System.out.println("Row Sums:");

        for (int i = 0; i < row2.length; i++) {
            System.out.print(row2[i] + " ");
        }
        int[] column2 = columnSums(second);

        System.out.println("\nColumn Sums:");

        for (int i = 0; i < column2.length; i++) {
            System.out.print(column2[i] + " ");
        }
        int[][] trans2 = transpose(second);

        System.out.println("\nTranspose:");

        printMatrix(trans2);
    }
    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
    static int[] rowSums(int[][] matrix) {

        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                sum = sum + matrix[i][j];
            }

            result[i] = sum;
        }

        return result;
    }
    static int[] columnSums(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] result = new int[columns];

        for (int j = 0; j < columns; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {

                sum = sum + matrix[i][j];
            }

            result[j] = sum;
        }

        return result;
    }
    static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] reverse = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                reverse[j][i] = matrix[i][j];
            }
        }

        return reverse;
    }
}
