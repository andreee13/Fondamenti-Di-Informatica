import java.util.Random;

public class Player {

    private String name;
    private int score = 0;
    private int[] dice = new int[3];

    private static Random random = new Random();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getDice() {
        return dice;
    }

    public int getScore() {
        return score;
    }

    public void turno() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = random.nextInt(6) + 1;
        }
    }

    public void sortDice() {
        for (int i = 0; i < dice.length; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i] > dice[j]) {
                    int temp = dice[i];
                    dice[i] = dice[j];
                    dice[j] = temp;
                }
            }
        }
    }

    public void addPoint() {
        score++;
    }

    public void resetScore() {
        score = 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : dice) {
            stringBuilder.append(i).append(" ");
        }
        return String.format("%s: %s", name, stringBuilder.toString());
    }
}