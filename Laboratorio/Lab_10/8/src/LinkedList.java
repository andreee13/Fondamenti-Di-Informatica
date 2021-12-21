public class LinkedList<T> implements LinkedListInterface<T> {

    private Node head, tail;

    @Override
    public void addFirst(T value) {
        if (isEmpty()) {
            Node node = new Node(value);
            head = node;
            tail = head;
        } else {
            head = new Node(value, null, head);
            head.next.prev = head;
        }
    }

    @Override
    public void addLast(T value) {
        if (isEmpty()) {
            Node node = new Node(value);
            head = node;
            tail = head;
        } else {
            tail = new Node(value, tail, null);
            tail.prev.next = tail;
        }
    }

    @Override
    public T removeFirst() {
        T value = head.value;
        head = head.next;
        head.prev = null;
        return value;
    }

    @Override
    public T removeLast() {
        T value = tail.value;
        tail = tail.prev;
        tail.next = null;
        return value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Node iterator = head;
        while (iterator.next != null) {
            stringBuilder.append(iterator.value).append(", ");
            iterator = iterator.next;
        }
        return stringBuilder.append(tail.value).append("]").toString();
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    private class Node {

        private T value;
        private Node next, prev;

        private Node(T value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        private Node(T value) {
            this(value, null, null);
        }
    }

}
