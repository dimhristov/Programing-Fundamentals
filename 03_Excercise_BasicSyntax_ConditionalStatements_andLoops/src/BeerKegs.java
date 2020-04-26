import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n  = Integer.parseInt(scan.nextLine());
        double bestKegVolume =  -1.0;
        String bestKegModel = " ";

        for (int i = 0; i < n ; i++) {
            String kegModel = scan.nextLine();
            double radius  = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume  = Math.PI * Math.pow(radius,2) * height;

            if(volume > bestKegVolume ) {
                bestKegVolume = volume;
                bestKegModel = kegModel;
            }
        }
        System.out.println(bestKegModel);
    }
}
