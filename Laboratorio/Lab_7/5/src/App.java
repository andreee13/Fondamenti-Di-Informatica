public class App {

    static int recursiveSum(int number) {
        if (number == 0) {
            return number;
        }
        return number + recursiveSum(--number);
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0 || args.length > 1) {
            throw new Exception("Invalid parameters length");
        }
        int a = Integer.parseInt(args[0]);
        if (a < 0) {
            throw new Exception("Invalid number");
        }
        System.out.println(recursiveSum(a));
    }
}
