import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        Switch switch1 = new Switch(), switch2 = new Switch();
        System.out.printf("#1 %s\n#2 %s\n", switch1, switch2);
        while ((n = scanner.nextInt()) != 0) {
            if (n == 1) {
                switch1.changeStatus();
            } else if (n == 2) {
                switch2.changeStatus();
            } else {
                System.err.printf("Switch %d doesn't exist\n", n);
            }
            System.out.printf("#1 %s\n#2 %s\nBulb:%s\n", switch1, switch2, Switch.bulbStatus ? "on" : "off");
        }
        scanner.close();
    }
}
