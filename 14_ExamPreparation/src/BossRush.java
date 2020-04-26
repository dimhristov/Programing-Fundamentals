import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "\\|(?<name>[A-Z]{4}[A-Z]*)\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                System.out.println(matcher.group("name") +", The " + matcher.group("title"));
                System.out.println(String.format(">> Strength: %d", matcher.group("name").length()));
                System.out.println(String.format(">> Armour: %d",matcher.group("title").length()));
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
