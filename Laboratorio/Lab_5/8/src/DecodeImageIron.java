import java.io.IOException;
import java.awt.Color;

public class DecodeImageIron {
    public static void main(String args[]) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java DecodeImage inputFileName outputFileName");
            System.exit(0);
        }
        SimpleImage img = new SimpleImage(args[0]);
        for (int x = 0; x < img.width(); x++) {
            for (int y = 0; y < img.height(); y++) {
                img.set(x, y, new Color(img.get(x, y).getRed() * 10, 0, 0));
            }
        }
        img.save(args[1]);
    }
}