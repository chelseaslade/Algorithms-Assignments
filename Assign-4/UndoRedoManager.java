
/**
 * Implement an application that support undo/redo functionality. Use a linked list to maintain a sequence of states.\
 * Each state change is stored as a node in the list, allowing for easy navigation
 * 1<>2<>3<>4<>5
 */

public class UndoRedoManager {
    protected DLL history;
    protected Node currentNode;

    //Constructor
    public UndoRedoManager() {
        history = new DLL();
        currentNode = null;
    }

    //Methods
    public void addAction(String action){
        history.addLast(action);
        currentNode = history.getLast();
    }

    public String undo(){
        if(currentNode == null){
            System.out.println("No Node To Undo");
            throw  new RuntimeException("Cannot undo: No previous node.");
        }
        currentNode = currentNode.prev;
        return currentNode.data;
    }

    public String redo(){
        if(currentNode == null || currentNode.next==null){
            throw new RuntimeException("Cannot redo: No previous node.");
        }
        currentNode = currentNode.next;
        return currentNode.data;
    }

    public void displayHistory(){
        history.displayForward();
    }

    public void displayCurrentState() {
        if (currentNode != null) {
            System.out.println("Current action: " + currentNode.data);
        } else {
            System.out.println("No actions in history.");
        }
    }
}