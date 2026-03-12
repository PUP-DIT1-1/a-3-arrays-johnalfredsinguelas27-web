import java.util.*;

public class StudentRecord{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        double[] grades = new double[10];
        double sum = 0;

        System.out.println("Enter 10 Student Names and Grades:");

        for (int a = 0; a < 10; a++) {
            System.out.print("Student Name: ");
            names[a] = sc.nextLine();

            System.out.print("Grade: ");
            grades[a] = sc.nextDouble();
            sc.nextLine();

            sum += grades[a];
        }

        double average = sum / 10;

        
        for (int a = 0; a < grades.length - 1; a++) {
            for (int b = 0; b < grades.length - a - 1; b++) {

                if (grades[b] > grades[b + 1]) {

                    double tempGrade = grades[b];
                    grades[b] = grades[b + 1];
                    grades[b + 1] = tempGrade;

                    String tempName = names[b];
                    names[b] = names[b + 1];
                    names[b + 1] = tempName;
                }
            }
        }

        System.out.println("Students Sorted by Grades:");
        for (int a = 0; a < 10; a++) {
            System.out.println(names[a] + " - " + grades[a]);
        }

        System.out.println("Average Grade: " + average);

        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int a = 0; a < names.length; a++) {
            if (names[a].equalsIgnoreCase(searchName)) {
                System.out.println("Student Found: " + names[a] + " - Grade: " + grades[a]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
