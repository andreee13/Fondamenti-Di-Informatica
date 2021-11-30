public class App {

    static boolean checkPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return checkPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(checkPalindrome("omordotuanuoraoarounautodromo"));
    }
}
