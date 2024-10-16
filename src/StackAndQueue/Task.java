package StackAndQueue;

public class Task implements Comparable<Task> {
    private String name;   // Име на задачата
    private int priority;  // Приоритет на задачата

    // Конструктор за инициализиране на задачата с име и приоритет
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Getter метод за името на задачата
    public String getName() {
        return name;
    }

    // Getter метод за приоритета на задачата
    public int getPriority() {
        return priority;
    }

    // Метод compareTo за сортиране по приоритет (по низходящ ред - най-висок приоритет първо)
    @Override
    public int compareTo(Task other) {
        // Сравняваме приоритетите, за да можем да сортираме по обратен ред (най-висок приоритет на първо място)
        return Integer.compare(other.priority, this.priority);
    }

    // Метод toString за извеждане на детайлите на задачата като текст
    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}
