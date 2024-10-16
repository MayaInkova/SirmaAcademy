package StackAndQueue;

import java.util.PriorityQueue;

// Класът TaskManager управлява задачите чрез PriorityQueue
public class TaskManager {
    private PriorityQueue<Task> taskQueue;

    // Конструктор, който инициализира опашката с приоритети
    public TaskManager() {
        // PriorityQueue сортира задачите по приоритет (по-високият приоритет идва първи)
        taskQueue = new PriorityQueue<>();
    }

    // Метод за добавяне на нова задача в опашката
    public void addTask(String name, int priority) {
        Task task = new Task(name, priority);
        taskQueue.offer(task);  // Добавяме задачата в опашката
    }

    // Метод за взимане и премахване на следващата задача с най-висок приоритет
    public Task getNextTask() {
        return taskQueue.poll();  // Премахва и връща задачата с най-висок приоритет
    }

    // Метод за проверка дали опашката със задачи е празна
    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }

    public static void main(String[] args) {
        // Пример за използване на TaskManager и PriorityQueue
        TaskManager manager = new TaskManager();

        // Добавяме задачи с различен приоритет
        manager.addTask("Task1", 5);
        manager.addTask("Task2", 10);
        manager.addTask("Task3", 3);
        manager.addTask("Task4", 8);

        // Извеждаме задачите по ред на приоритета (най-високият приоритет първо)
        while (!manager.isEmpty()) {
            Task nextTask = manager.getNextTask();
            System.out.println("Next Task: " + nextTask);
        }
    }
}
