import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        int numStudents;
        do {
            System.out.print("Enter the number of students (minimum 1): ");
            numStudents = scanner.nextInt();
        } while (numStudents < 1);

        System.out.println("Enter grades for " + numStudents + " students (0-100):");
        for (int i = 0; i < numStudents; i++) {
            int grade;
            do {
                System.out.print("Student " + (i + 1) + ": ");
                grade = scanner.nextInt();
            } while (grade < 0 || grade > 100);
            grades.add(grade);
        }

        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int grade : grades) {
            total += grade;
            highest = Math.max(highest, grade);
            lowest = Math.min(lowest, grade);
        }

        double average = (double) total / numStudents;

        System.out.println("\nResults:");
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}
