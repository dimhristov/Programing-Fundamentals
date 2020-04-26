import java.util.Scanner;

public class After30minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int sumTime = hour * 60 + minutes +30;
        hour = sumTime / 60;
        minutes = sumTime % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d",hour, minutes);
    }
}
