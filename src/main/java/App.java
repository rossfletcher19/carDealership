import Models.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your maximum budget for a vehicle?");


        try {

            String stringUserMaxBudget = bufferedReader.readLine();

            Vehicle hatchback = new Vehicle();
            hatchback.year = 2001;
            hatchback.brand = "Subaru";
            hatchback.model = "Forester";
            hatchback.miles = 176000;
            hatchback.price = 3400;

            Vehicle suv = new Vehicle();
            suv.year = 2002;
            suv.brand = "Ford";
            suv.model = "Explorer";
            suv.miles = 100000;
            suv.price = 7000;

            Vehicle sedan = new Vehicle();
            sedan.year = 2015;
            sedan.brand = "Toyota";
            sedan.model = "Camry";
            sedan.miles = 50000;
            sedan.price = 3000;

            Vehicle truck = new Vehicle();
            truck.year = 1999;
            truck.brand = "Ford";
            truck.model = "Ranger";
            truck.miles = 100000;
            truck.price = 4000;

            Vehicle crossover = new Vehicle();
            crossover.year = 1998;
            crossover.brand = "Toyota";
            crossover.model = "Rav-4";
            crossover.miles = 200000;
            crossover.price = 3500;

            Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};

            int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

            System.out.println("Alright. here's what we have in your price range: ");

            for (Vehicle individualVehicle : allVehicles) {
                if (individualVehicle.worthBuying(userMaxBudget)) {
                    System.out.println("----------------------");
                    System.out.println(individualVehicle.year);
                    System.out.println(individualVehicle.brand);
                    System.out.println(individualVehicle.model);
                    System.out.println(individualVehicle.miles);
                    System.out.println(individualVehicle.price);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
