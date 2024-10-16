package StackAndQueue;

import java.util.Stack;

public class DocumentEditor {
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    // Конструктор за инициализиране на стековете
    public DocumentEditor() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Метод за добавяне на ново действие
    public void addAction(String action) {
        undoStack.push(action);  // Добавяме действието в Undo стека
        redoStack.clear();  // Изчистваме Redo стека, защото има ново действие
        System.out.println("Added action: " + action);
    }

    // Метод за извършване на Undo (отмяна на последното действие)
    public void undo() {
        if (!undoStack.isEmpty()) {
            String action = undoStack.pop();  // Премахваме действието от Undo стека
            redoStack.push(action);  // Добавяме го в Redo стека
            System.out.println("Undo action: " + action);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    // Метод за извършване на Redo (възстановяване на последно отмененото действие)
    public void redo() {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();  // Премахваме действието от Redo стека
            undoStack.push(action);  // Възстановяваме го в Undo стека
            System.out.println("Redo action: " + action);
        } else {
            System.out.println("No actions to redo.");
        }
    }

    // Метод за отпечатване на текущото състояние на Undo и Redo стековете
    public void printStacks() {
        System.out.println("Undo stack: " + undoStack);
        System.out.println("Redo stack: " + redoStack);
    }

    public static void main(String[] args) {

       DocumentEditor manager = new DocumentEditor();

        // Добавяме действия
        manager.addAction("Action1");
        manager.addAction("Action2");
        manager.addAction("Action3");

        manager.printStacks();

        // Извършваме Undo
        manager.undo();
        manager.printStacks();

        // Извършваме още едно Undo
        manager.undo();
        manager.printStacks();

        // Възстановяваме последно отмененото действие (Redo)
        manager.redo();
        manager.printStacks();

        // Добавяме ново действие и изчистваме Redo стека
        manager.addAction("Action4");
        manager.printStacks();
    }
}

