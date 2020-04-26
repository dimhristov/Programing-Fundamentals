import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String values = scan.nextLine();
        List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            nums.add(Integer.parseInt(items.get(i)));
        }
        List<Integer> resultList = new ArrayList<>();

        int iterationCount = nums.size() / 2;

        for (int i = 0; i < iterationCount; i++) {
            resultList.add(nums.get(i) + nums.get(nums.size() - 1));
            nums.remove(nums.size()-1);


        }
        if (nums.size() % 2 != 0){
            resultList.add(nums.get(nums.size()-1));
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");

        }

    }
}
