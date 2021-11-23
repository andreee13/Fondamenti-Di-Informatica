import java.io.IOException;
import java.awt.Color;

public class DecodeImageWest {
   public static void main(String args[]) throws IOException {
      if (args.length != 2) {
         System.out.println("Usage: java DecodeImage inputFileName outputFileName");
         System.exit(0);
      }
      SimpleImage img = new SimpleImage(args[0]);
      for (int x = 0; x < img.width(); x++) {
         for (int y = 0; y < img.height(); y++) {
            Color c = img.get(x, y);
            int blue = c.getBlue();
            if (blue < 16) {
               blue *= 16;
            } else {
               blue = 0;
            }
            img.set(x, y, new Color(0, 0, blue));
         }
      }
      img.save(args[1]);
   }
}