public class Assign3 {
    public static void main(String[] args) {
        //Test traverse method
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertInLinkedList(1,0);
        sll.insertInLinkedList(2, 1);
        sll.insertInLinkedList(3, 3);
        sll.insertInLinkedList(4, 4);

        sll.traverseLinkedList();
        sll.searchNode(5);

        //Test delete method
        SingleLinkedList sll2 = new SingleLinkedList();
        sll2.createdLinkedList(10);
        sll2.insertInLinkedList(20, 1);
        sll2.insertInLinkedList(30, 2);
        sll2.insertInLinkedList(40, 3);
        sll2.traverseLinkedList(); // Output: 10 -> 20 -> 30 -> 40

        sll2.deleteNode(0);
        sll2.traverseLinkedList(); // Output: 20 -> 30 -> 40

        sll2.deleteNode(2);
        sll2.traverseLinkedList(); // Output: 20 -> 30
    }
}
