public class TicTacToe {
    private int counter;
    private char[][] matrix = new char[3][3];

    public TicTacToe() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '•';
            }
        }
    }

    public boolean setCharInPosition(int row, int column, char c) {
        if (matrix[--row][--column] == '•') {
            matrix[row][column] = c;
            counter++;
            return true;
        } else {
            return false;
        }
    }

    public char getCharInPosition(int row, int column) {
        return matrix[row][column];
    }

    public int getCount() {
        return counter;
    }

    public boolean isWinning(char c) {
        int diagonalVerifier1 = 0, diagonalVerifier2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowVerifier = 0, columnVerifier = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == c) {
                    rowVerifier++;
                }
                if (matrix[j][i] == c) {
                    columnVerifier++;
                }
                if (i == j && matrix[i][j] == c) {
                    diagonalVerifier1++;
                }
                if (i + j == 2 && matrix[i][j] == c) {
                    diagonalVerifier2++;
                }
            }
            if (rowVerifier == 3 || columnVerifier == 3 || diagonalVerifier1 == 3 || diagonalVerifier2 == 3) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (char[] cs : matrix) {
            stringBuilder.append("| ");
            for (char c : cs) {
                stringBuilder.append(c).append(" ");
            }
            stringBuilder.append("|\n");
        }
        return stringBuilder.toString();
    }

}
