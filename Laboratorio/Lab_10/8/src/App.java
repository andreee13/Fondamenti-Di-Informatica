public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("come");
        linkedList.addLast("Ciao");
        linkedList.addLast("va?");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
