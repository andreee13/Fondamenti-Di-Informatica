import java.util.Scanner;

public class App {

    private static int parseAmount(String[] array) {
        try {
            return Integer.parseInt(array[1]);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        String[] input;
        while (true) {
            System.out.print("Insert command (Q, B, D, W, A): ");
            input = scanner.nextLine().split(" ");
            switch (input[0]) {
                case "B":
                    System.out.printf("%f$\n", bankAccount.getBalance());
                    break;
                case "D":
                    if (bankAccount.deposit(parseAmount(input))) {
                        System.out.printf("Deposit success: +%s$\n", input[1]);
                    } else {
                        System.out.println("Deposit failed: invalid amount");
                    }
                    break;
                case "W":
                    if (bankAccount.withdraw(parseAmount(input))) {
                        System.out.printf("Withdraw success: -%s$\n", input[1]);
                    } else {
                        System.out.println("Withdraw failed: invalid amount");
                    }
                    break;
                case "A":
                    float balance = bankAccount.getBalance();
                    if (bankAccount.addInterest(parseAmount(input))) {
                        System.out.printf("Add interest success: +%f$\n", bankAccount.getBalance() - balance);
                    } else {
                        System.out.println("Add interest failed: invalid percentage");
                    }
                    break;
                case "Q":
                    scanner.close();
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.err.println("Invalid command");
            }
        }
    }
}
