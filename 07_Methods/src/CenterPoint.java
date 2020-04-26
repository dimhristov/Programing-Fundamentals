import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());

        if(printClosestPoint(x1, y1, x2, y2) == 1){
            System.out.println(String.format("(%d, %d)",x1,y1));
        } else if ((printClosestPoint(x1, y1, x2, y2) == 2)) {
            System.out.println(String.format("(%d, %d)",x2,y2));
        } else if (printClosestPoint(x1, y1, x2, y2) == 1) {
            System.out.println(String.format("(%d, %d)", x1, y1));
        }

    }

    public static int printClosestPoint(int x1, int y1, int x2, int y2) {
        double diagonalFirst = (x1 * x1 + y1 * y1);
        diagonalFirst = Math.sqrt(diagonalFirst);

        double diagonalSecond = (x2 * x2 + y2 * y2);
        diagonalSecond = Math.sqrt(diagonalSecond);

        if (diagonalFirst < diagonalSecond){
            return 1;
        } else if(diagonalFirst>diagonalSecond){
            return 2;
        } else if (diagonalFirst == diagonalSecond){
            return 1;
        }
return 1;
    }
}
