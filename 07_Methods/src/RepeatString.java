import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String toRepeat = scan.nextLine();

        int times = Integer.parseInt(scan.nextLine());

        String result = repeat(toRepeat, times);
        System.out.println(result);
    }

    private static String repeat(String toRepeat, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += toRepeat;

        }
        return result;

    }
}
