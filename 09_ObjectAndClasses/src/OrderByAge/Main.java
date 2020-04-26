package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "";
        String id = "";
        int age = 0;

        String[] input = scan.nextLine().split("\\s");
        ArrayList<Person> people = new ArrayList<>();
        while (!"End".equals(input[0])) {
            name = input[0];
            id = input[1];
            age = Integer.parseInt(input[2]);
            Person person = new Person(name, id, age);
            people.add(person);

            input = scan.nextLine().split("\\s");
        }

        people
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(p -> System.out.println(p.toString()));
    }
}
