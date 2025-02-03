public class Node {
    // These are the fields for each node, each node can have a string, a previous and next node value. Notice the types!
    String data;
    Node next;
    Node prev;
    int value;

    Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node() {
        this.data = null;
        this.prev = null;
        this.next = null;
    }
}