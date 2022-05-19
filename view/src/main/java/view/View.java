package view;

import controller.TravelController;

import java.util.Scanner;

public class View {

    public void View() {

        TravelController travelController = new TravelController();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to our tour agency");
            System.out.println("|--------------------------------------|");
            System.out.println("|1. Show all tours                     |");
            System.out.println("|                                      |");
            System.out.println("|2. Choose tour By tour type           |");
            System.out.println("|                                      |");
            System.out.println("|3. Choose tour by nutrition type      |");
            System.out.println("|                                      |");
            System.out.println("|4. Choose tour by transportation type |");
            System.out.println("|                                      |");
            System.out.println("|5. Choose tour by tour duration       |");
            System.out.println("|                                      |");
            System.out.println("|6. Choose tour by price               |");
            System.out.println("|                                      |");
            System.out.println("Enter number of your answer");

            int ans = scanner.nextInt();

            if (ans == 1) {
                travelController.getAllTours();
            } else if (ans == 2) {
                System.out.println("Enter tour type: relax, excursion, shopping, healing");
                String tourType = scanner.next();
                travelController.getTourByTourType(tourType);
            } else if (ans == 3) {
                System.out.println("Enter nutrition type: all inclusive, 1, 2, 3");
                String nutritionType = scanner.next();
                travelController.getTourByNutritionType(nutritionType);
            } else if (ans == 4) {
                System.out.println("Enter transporting type: train, bus, flight");
                String transportingType = scanner.next();
                travelController.getTourByTransportingType(transportingType);
            } else if (ans == 5) {
                System.out.println("Enter duration in days");
                int tourDuration = scanner.nextInt();
                travelController.getTourByTourDuration(tourDuration);
            } else if (ans == 6) {
                System.out.println("Enter tour maximum price");
                int tourMaxCost = scanner.nextInt();
                travelController.getTourByCost(tourMaxCost);
            } else {
                System.out.println("incorrect number");
            }

        }
    }
}
