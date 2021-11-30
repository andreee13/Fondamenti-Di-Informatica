public class App {
    static int recursiveMcd(int n, int m) {
        if (m == 1) {
            return 1;
        } else if (m % n == 0) {
            return n;
        } else {
            return recursiveMcd(n, m % n);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new Exception("Invalid parameters length");
        }
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if (n < 0 || m < 0 || n > m) {
            throw new Exception("Invalid numbers");
        }
        System.out.println(recursiveMcd(n, m));
    }
}
