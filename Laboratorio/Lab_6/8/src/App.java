import java.util.Scanner;

public class App {

    private static String getTotalScore(Player player1, Player player2) {
        return String.format("Total score:\n\t- %s: %d\n\t- %s: %d", player1.getName(), player1.getScore(),
                player2.getName(), player2.getScore());
    }

    public static String getWinner(Player player1, Player player2) {
        int score1 = 0, score2 = 0;
        for (int i = 0; i < player1.getDice().length; i++) {
            if (player1.getDice()[i] > player2.getDice()[i]) {
                score1++;
                player1.addPoint();
            } else if (player1.getDice()[i] < player2.getDice()[i]) {
                score2++;
                player2.addPoint();
            }
        }
        if (score1 != score2) {
            return String.format("%s WIN %d-%d\n%s", (score1 > score2 ? player1 : player2).getName().toUpperCase(),
                    score1 > score2 ? score1 : score2, score1 < score2 ? score1 : score2,
                    getTotalScore(player1, player2));
        } else {
            return String.format("TIE %d-%d\n%s", score1, score2, getTotalScore(player1, player2));
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 name: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Player 2 name: ");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("\nGame started!\n");
        while (true) {
            System.out.println("Launching dice...");
            player1.turno();
            player2.turno();
            player1.sortDice();
            player2.sortDice();
            System.out.printf("Result:\n\t- %s\n\t- %s\n%s\n", player1, player2, getWinner(player1, player2));
            System.out.println("\n===== Press enter to launch again =====\n");
            if (scanner.nextLine() != "") {
                break;
            }
        }
        scanner.close();
    }
}
