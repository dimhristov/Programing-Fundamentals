package VehicleCatalouge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Car> trucks = new ArrayList<>();



        while (!"End".equals(input[0])) {
            String typeOfVehicle = input[0];
            String modelOfVehicle = input[1];
            String colorOfVehicle = input[2];
            int horsepowerOfVehicle =Integer.parseInt(input[3]);
            Car car = new Car();
            if ("car".equals(typeOfVehicle)) {
                car = new Car("Car", modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
                cars.add(car);
            } else if ("truck".equals(typeOfVehicle)){
                car = new Car("Truck", modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
                cars.add(car);
            }

            input = scan.nextLine().split(" ");
        }
        String command = scan.nextLine();

        while(!"Close the Catalogue".equals(command)){
            for (Car car : cars){
                if (car.getModel().equals(command)) {
                    System.out.println(car);
                    break;
                }
            }

            command = scan.nextLine();
        }

        double carHP = printHorsePower(cars,"Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHP));
        double truckHP = printHorsePower(cars, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHP));

    }
    public static double printHorsePower(ArrayList<Car> cars,String type){
        double sum = 0.0;
        int counter = 0;
        for (Car car : cars) {
            if (car.getType().equals(type)){
                sum +=car.getHorsepower();
                counter++;
            }
        }
        if (counter ==0){
            return 0;
        }
        return sum/counter;

    }

}
