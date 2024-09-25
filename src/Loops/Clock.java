package Loops;

public class Clock {
    public static void printDayHours() {
        // Outer loop for the hours (0 to 23)
        for (int hour = 0; hour < 24; hour++) {
            // Inner loop for the minutes (0 to 59)
            for (int minute = 0; minute < 60; minute++) {
                // Print in the format '{hour}:{minutes}'
                System.out.println(hour + ":" + minute);
            }
        }
    }

    public static void main(String[] args) {
        // Call the function to print the hours of the day
        printDayHours();
    }
}

