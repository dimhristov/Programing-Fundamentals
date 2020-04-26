import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int area = calculateArea(width,height);
        System.out.println(area);
    }

    private static int calculateArea(int width, int height) {
        return width * height;

    }
}
