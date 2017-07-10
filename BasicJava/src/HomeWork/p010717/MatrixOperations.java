package HomeWork.p010717;

public class MatrixOperations {

    static void print_positive_rows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            boolean positive_row = true;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] < 0) {
                    positive_row = false;
                    break;
                }
            }

            if (!positive_row)
                continue;

            System.out.println("Sum of row number " + i + ": " + sum);
        }
    }

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {-1, 2}, {0, 5, 6}};
        int[][] b = {{0, 0, 0}, {1, 2}, {-1, -2, -3}, {2}, {-3}};

        print_positive_rows(a);
        System.out.println();
        print_positive_rows(b);
    }

}
