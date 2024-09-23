package ConditionalStatements;

import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: student score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Input: number of extracurricular activities
        System.out.print("Enter the number of extracurricular activities: ");
        int extracurriculars = scanner.nextInt();

        // Determine admission status
        if (score >= 90) {
            System.out.println("Admitted.");
        } else if (score >= 80 && extracurriculars >= 2) {
            System.out.println("Admitted.");
        } else {
            System.out.println("Not admitted.");
        }
    }
}
