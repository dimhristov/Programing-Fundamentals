import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> train = readIntList(scan);
        int waggonCapacity = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    int currentWagon = train.get(i);
                    int totalCount = currentWagon + people;
                    if (totalCount <= waggonCapacity) {
                        train.set(i, totalCount);
                        break;
                    }

                }

            }

            input = scan.nextLine();
        }
        for (int element  : train) {
            System.out.print(element + " ");

        }

    }

    private static ArrayList<Integer> readIntList(Scanner scan) {
        String[] input = scan.nextLine().split("\\s+");
        ArrayList<Integer> outputList = new ArrayList<>();
        for (String element : input) {
            outputList.add(Integer.parseInt(element));
        }
        return outputList;
    }

}

