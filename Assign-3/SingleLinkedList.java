
public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //create a linked list
    public Node createdLinkedList (int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert int linked list
    //0. if the link doesn't
    //1. inserting at the begining
    //2. inserting at the ending
    //3. inserting anywhere

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createdLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node temNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temNode.value);
                if (i != size -1 ){
                    System.out.print(" -> ");
                }
                temNode = temNode.next;
            }
            System.out.print("\n");
        }
    }

    // search for a Node
    public boolean searchNode (int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //Assignment 3:
    //Deleting a Node from the linked list
    //0. if the link doesn't exist
    //1. delete at the beginning
    //2. delete at the ending
    //3. delete anywhere

    public void deleteNode(int nodeLocation) {
        // If the linked list does not exist
        if (head == null) {
            System.out.println("Node does not exist. Cannot delete.");
            return;
        }

        // Delete at the beginning
        if (nodeLocation == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            System.out.println("Node at position " + nodeLocation + " has been deleted.");
            return;
        }

        // Delete at the end
        else if (nodeLocation >= size - 1) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = null;
                tail = null;
                size--;
                System.out.println("Node at position " + nodeLocation + " has been deleted.");
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
            System.out.println("Node at position " + nodeLocation + " has been deleted.");
            return;
        }

        // Delete anywhere (middle nodes)
        else {
            Node tempNode = head;
            for (int i = 0; i < nodeLocation - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
            System.out.println("Node at position " + nodeLocation + " has been deleted.");
        }
    }
}
