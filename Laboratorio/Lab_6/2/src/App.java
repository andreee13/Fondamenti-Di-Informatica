import java.util.Scanner;

public class App {

    public static String matrixToString(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            for (int i : row) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        return sb.replace(sb.length() - 2, sb.length(), "").toString();
    }

    public static int[] resize(int[] array) {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        int[] inputs = new int[10];
        int inputsCounter = 0;
        int totalSumToVerify = 0;
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            for (String string : line) {
                if (inputs.length <= inputsCounter) {
                    inputs = resize(inputs);
                }
                totalSumToVerify += inputsCounter + 1;
                inputs[inputsCounter++] = Integer.parseInt(string);
            }
        }
        scanner.close();
        double size = Math.sqrt(inputsCounter);
        if (size % 1 != 0) {
            throw new Exception("Invalid number of elements");
        }
        final int sumToVerify = (int) (totalSumToVerify / size);
        int[][] matrix = new int[(int) size][(int) size];
        int row = 0, column = 0;
        for (int i = 0; i < inputsCounter; i++) {
            matrix[row][column] = inputs[i];
            totalSumToVerify -= inputs[i];
            column++;
            if (column == size) {
                row++;
                if (row == size) {
                    break;
                }
                column = 0;
            }
        }
        if (totalSumToVerify != 0) {
            throw new Exception(String.format("Numbers are not range 1..%d", (int) Math.pow(size, 2)));
        }
        int diagonalSum1 = 0, diagonalSum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[matrix.length - i - 1][matrix.length - i - 1];
            int sum1 = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum1 += matrix[i][j];
                int sum2 = 0;
                for (int k = 0; k < matrix.length; k++) {
                    sum2 += matrix[k][j];
                }
                if (sum2 != sumToVerify) {
                    System.out.println("Matrix isn't a magic square");
                    return;
                }
            }
            if (sum1 != sumToVerify) {
                System.out.println("Matrix isn't a magic square");
                return;
            }
        }
        if (diagonalSum1 != sumToVerify || diagonalSum2 != sumToVerify) {
            System.out.println("Matrix isn't a magic square");
            return;
        }
        System.out.printf("\nThe matrix is a magic square: \n%s", matrixToString(matrix));
    }
}
