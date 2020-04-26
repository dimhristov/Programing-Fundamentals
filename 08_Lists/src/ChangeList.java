import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> myList = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!"end".equals(command)) {
            String[] deleteOrInsert = command.split("\\s+");
            if ("Delete".equals(deleteOrInsert[0])) {
                while (myList.contains(deleteOrInsert[1])) {
                    myList.remove(deleteOrInsert[1]);
                }


            } else if ("Insert".equals(deleteOrInsert[0])) {

                int index = Integer.parseInt(deleteOrInsert[2]);
                if (index <= myList.size()) {

                    myList.add(index, deleteOrInsert[1]);
                }


            }

            command = scan.nextLine();
        }
        for (String element : myList) {
            System.out.print(element + " ");

        }

    }
}
