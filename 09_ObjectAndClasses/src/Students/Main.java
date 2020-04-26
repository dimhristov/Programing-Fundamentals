package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        double grade =0.0;

        ArrayList<Student> allStudents = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            firstName =  input[0];
            lastName = input[1];
            grade = Double.parseDouble(input[2]);
            Student student = new Student(firstName,lastName,grade);
            allStudents.add(student);
        }

        allStudents
                .stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .forEach(s -> System.out.println(s.toString()));

//        allStudents.sort(Comparator.comparingDouble(Student::getGrade).reversed());
//        for (Student student : allStudents) {
//            System.out.println(student.toString());
//        }
    }
}
