import java.util.Scanner;

public class App {

    public static int countTiles(double totalWidth, double tileWidth) {
        int n = (int) (totalWidth / tileWidth);
        if (n % 2 == 0)
            return --n;
        return n;
    }

    public static double computeGap(double totalWidth, double tileWidth, int tilesNumber) {
        return (totalWidth - (tileWidth * tilesNumber)) / 2;
    }

    public static int countTilesV2(double totalWidth, double tileWidth) {
        int n = (int) (totalWidth / tileWidth);
        int d = n % 4;
        if (d != 1)
            return n - d + 1;
        else if (d == 0)
            return n - 3;
        return n;
    }

    public static double computeGapV2(double totalWidth, double tileWidth, int tilesNumber) {
        return (totalWidth - (tileWidth * tilesNumber)) / 2;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lunghezza muro > ");
        double totalWidth = scanner.nextDouble();
        System.out.print("Larghezza piastrella > ");
        double tileWidth = scanner.nextDouble();
        scanner.close();

        int tilesNumber = countTiles(totalWidth, tileWidth);
        System.out.println("Numero piastrelle: " + tilesNumber);
        System.out.println("Gap: " + computeGap(totalWidth, tileWidth, tilesNumber));

        tilesNumber = countTilesV2(totalWidth, tileWidth);
        System.out.println("Numero piastrelle: " + tilesNumber);
        System.out.println("Gap: " + computeGapV2(totalWidth, tileWidth, tilesNumber));

    }
}
