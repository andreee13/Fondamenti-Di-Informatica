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
        if (matrix[row][column] == 0) {
            matrix[row][column] = Character.toUpperCase(c);
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
        for (int i = 0; i < matrix.length; i++) {
            int verifyCounter1 = 0, verifyCounter2 = 0, verifyCounter3 = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    verifyCounter3++;
                }
                if (matrix[i][j] == c) {
                    verifyCounter1++;
                }
                if (matrix[j][i] == c) {
                    verifyCounter2++;
                }
            }
            if (verifyCounter1 == 3 || verifyCounter2 == 3 || verifyCounter3 == 3) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
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
