import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        do {
            System.out.println(game);
            final char player = game.getCount() % 2 == 0 ? 'X' : 'O';
            while (true) {
                System.out.printf("Player %c insert coordinate: ", player);
                try {
                    String[] s = scanner.nextLine().split(" ");
                    if (game.setCharInPosition(Integer.parseInt(s[0]), Integer.parseInt(s[1]), player)) {
                        break;
                    } else {
                        throw new Exception("Invalid coordinates");
                    }
                } catch (Exception e) {
                    System.err.println("Invalid coordinates, please retry");
                    System.out.println(game);
                }
            }
        } while (!game.isWinning('O') && !game.isWinning('X') && game.getCount() != 9);
        scanner.close();
        System.out.println("\n============= Game finished =============\n ");
        if (game.isWinning('O')) {
            System.out.println("PLAYER O WON");
        } else if (game.isWinning('X')) {
            System.out.println("PLAYER X WON");
        } else {
            System.out.println("TIE");
        }
        System.out.println(game);
    }
}
