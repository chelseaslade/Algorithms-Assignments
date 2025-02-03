public class Assign4 {
    public static void main(String[] args) {
        UndoRedoManager undoRedo = new UndoRedoManager();

        undoRedo.addAction("Action 1");
        undoRedo.addAction("Action 2");
        undoRedo.addAction("Action 3");
        undoRedo.addAction("Action 4");

        undoRedo.undo();
        undoRedo.undo();
        undoRedo.undo();
        undoRedo.redo();
    }}