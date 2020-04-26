import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double V = Double.parseDouble(scanner.nextLine());

        double sum =0;

        sum = (length*width* V) / 3;
        System.out.printf("Pyramid Volume: %.2f", sum);

    }
}
