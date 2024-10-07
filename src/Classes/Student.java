package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    // Конструктор на класа Student
    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    // Метод за получаване на родния град
    public String getHometown() {
        return hometown;
    }

    // Метод за форматирано извеждане на информацията за студента
    public String getInfo() {
        return firstName + " " + lastName + " is " + age + " years old";
    }
}




