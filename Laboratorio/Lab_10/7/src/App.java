
public class App {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();
        stack.push("Ciao");
        stack.push("Bella");
        stack.push("Zio");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push("Come va?");
        System.out.println(stack);
    }
}