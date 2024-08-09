import java.util.*;

public class exp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for Matrix 1
        System.out.println("Enter Matrix 1 Dimensions (n1 x n2):");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] a = new int[n1][n2];

        // Input dimensions for Matrix 2
        System.out.println("Enter Matrix 2 Dimensions (n3 x n4):");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println(
                "Matrix 1 Dimensions are " + n1 + " x " + n2 + " & Matrix 2 Dimensions are " + n3 + " x " + n4 + ".");

        // Check if addition and subtraction are possible
        if (n1 != n3 || n2 != n4) {
            System.out.println("Matrix addition and subtraction are not possible due to dimension mismatch.");
            sc.close();
            return;
        }

        int[][] b = new int[n3][n4];

        // Input Matrix 1 elements
        System.out.println("Enter Matrix 1 elements:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Display Matrix 1
        System.out.println("Matrix 1:");
        printMatrix(a, n1, n2);

        // Input Matrix 2 elements
        System.out.println("Enter Matrix 2 elements:");
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n4; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Display Matrix 2
        System.out.println("Matrix 2:");
        printMatrix(b, n3, n4);

        // Perform and display Matrix Addition
        int[][] sum = addMatrices(a, b, n1, n2);
        System.out.println("Sum of Matrices:");
        printMatrix(sum, n1, n2);

        // Perform and display Matrix Subtraction
        int[][] sub = subMatrices(a, b, n1, n2);
        System.out.println("Subtraction of Matrices:");
        printMatrix(sub, n1, n2);

        // Perform and display Matrix Multiplication
        int[][] mul = multiplyMatrices(a, b, n1, n2, n4);
        System.out.println("Product of Matrices:");
        printMatrix(mul, n1, n4);

        sc.close();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b, int n1, int n2) {
        int[][] sum = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subMatrices(int[][] a, int[][] b, int n1, int n2) {
        int[][] sub = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        return sub;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b, int n1, int n2, int n4) {
        int[][] product = new int[n1][n4];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n4; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
