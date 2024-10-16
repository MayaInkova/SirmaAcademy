package StackAndQueue;

import java.util.*;

class Robot {
     String name;
     int processTime;
     int availableAt; // времето, когато роботът ще бъде свободен (в секунди)

     public Robot(String name, int processTime) {
         this.name = name;
         this.processTime = processTime;
         this.availableAt = 0; // В началото всички роботи са свободни
     }
 }

 class AssemblyLine {

    // Метод за конвертиране на време във формат "hh:mm:ss" към секунди
    public static int convertTimeToSeconds(String time) {
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Метод за конвертиране на секунди обратно в "hh:mm:ss" формат
    public static String convertSecondsToTime(int seconds) {
        int hours = (seconds / 3600) % 24;
        int minutes = (seconds / 60) % 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Парсване на входа за роботите
        String[] robotsInput = sc.nextLine().split("\\|");
        List<Robot> robots = new ArrayList<>();

        for (String robotData : robotsInput) {
            String[] robotInfo = robotData.split("-");
            String name = robotInfo[0];
            int processTime = Integer.parseInt(robotInfo[1]);
            robots.add(new Robot(name, processTime));
        }

        // Четене на началното време
        String startTime = sc.nextLine();
        int currentTime = convertTimeToSeconds(startTime);

        // Четене на продуктите до командата "End"
        Queue<String> products = new ArrayDeque<>();
        String input;

        while (!(input = sc.nextLine()).equals("End")) {
            products.offer(input); // Добавяме продукта в опашката
        }

        // Започваме обработката на продуктите
        while (!products.isEmpty()) {
            currentTime++; // Нов продукт излиза всяка секунда

            String currentProduct = products.poll(); // Вземаме продукта от началото на опашката
            boolean productAssigned = false;

            // Проверяваме дали има свободен робот
            for (Robot robot : robots) {
                if (robot.availableAt <= currentTime) { // Ако роботът е свободен
                    robot.availableAt = currentTime + robot.processTime; // Задаваме кога ще е свободен отново
                    System.out.println(robot.name + " - " + currentProduct + " [" + convertSecondsToTime(currentTime) + "]");
                    productAssigned = true;
                    break;
                }
            }

            // Ако няма свободен робот, връщаме продукта в края на опашката
            if (!productAssigned) {
                products.offer(currentProduct);
            }
        }

    }
}

