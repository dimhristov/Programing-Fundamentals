import java.util.Scanner;

public class PrintingTriangles {

    public static void printRow(int rowCount) {
        for (int i = 1; i <= rowCount; i++) {
            System.out.print((i + " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxRowCount = Integer.parseInt(scan.nextLine());

        printTriangle(maxRowCount);
    }

    private static void printTriangle(int maxRowCount) {
        for (int i = 1; i <= maxRowCount; i++) {
            printRow(i);
        }
        for (int i = maxRowCount - 1; i > 0; i--) {
            printRow(i);
        }
    }
}
