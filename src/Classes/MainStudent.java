package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Четем информация за студенти, докато не получим командата "end"
        System.out.println("Въведете информация за студенти (име, фамилия, възраст, роден град). Напишете 'end' за край:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;  // Излизаме от цикъла, ако въведем 'end'
            }

            // Разделяме входния низ на части
            String[] parts = input.split(" ");
            if (parts.length < 4) {
                System.out.println("Моля, въведете валидна информация за студента.");
                continue;  // Продължаваме цикъла, ако входът не е валиден
            }

            // Създаваме студент с получената информация
            String firstName = parts[0];
            String lastName = parts[1];
            int age;
            try {
                age = Integer.parseInt(parts[2]);  // Опитваме да преобразуваме възрастта в число
            } catch (NumberFormatException e) {
                System.out.println("Моля, въведете валидна възраст.");
                continue;  // Пропускаме текущото итерация, ако възрастта не е валидна
            }
            String hometown = parts[3];

            students.add(new Student(firstName, lastName, age, hometown));  // Добавяме студента в списъка
        }

        // Четем името на града, за който ще филтрираме студентите
        System.out.println("Въведете името на града:");
        String city = scanner.nextLine();

        // Отпечатваме студентите, които са от зададения град
        System.out.println("Студенти от " + city + ":");
        for (Student student : students) {
            if (student.getHometown().equalsIgnoreCase(city)) {
                System.out.println(student.getInfo());  // Извеждаме информацията за студента
            }
        }
    }
}

