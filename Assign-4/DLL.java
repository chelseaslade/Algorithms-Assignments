public class DLL {

    protected Node head;
    protected Node tail;

    public DLL(){
        head = null;
        tail = null;
    }

    public void addLast( String data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    public void insertAtBeginning(String data)
    {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void addAtPosition( String data, int position) {
        Node temp = new Node(data);
        if(position == 1){
            insertAtBeginning(data);
        }else{
            Node currentNode = head;
            int currentPosition = 1;

            while(currentNode != null && currentPosition < position){
                currentNode = currentNode.next;
                currentPosition++;
            }

            if(currentNode == null){
                addLast(data);
            }else {
                temp.next = currentNode;

                temp.prev = currentNode.prev;

                currentNode.prev.next = temp;

                currentNode.prev = temp;
            }
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node find(String data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        return tail;
    }
}