import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        do {
            System.out.println(game);
            final char player = game.getCount() % 2 == 0 ? 'X' : 'O';
            System.out.printf("Player %c insert coordinate: ", player);
            while(true) {
                try {
                    String[] s = scanner.nextLine().split(" ");
                    if (game.setCharInPosition(Integer.parseInt(s[0]),Integer.parseInt( s[1]), player))  {
                       break;
                    }
                } catch (Exception e) {
                    //ignore: empty catch block
                }
            }
        } while (!game.isWinning('O') && !game.isWinning('X'));
        scanner.close();
        if (game.isWinning('O')) {
            System.out.println("PLAYER O WON");
        } else if (game.isWinning('X')) {
            System.out.println("PLAYER X WON");
        } else {
            System.out.println("TIE");
        }
        //System.out.printf("\nPLAYER %c WON", game.isWinning('O') ? 'O' : 'X');
    }
}
