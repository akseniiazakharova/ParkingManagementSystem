package parking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Garage parking = new Garage(3, 6);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Parking Management System ===");
        
        while (true) {
            System.out.println("\n1. Entry | 2. Search | 3. Exit | 4. Status | 0. Quit");
            System.out.print("Choose action: ");
            String action = scanner.nextLine();
            
            if (action.equals("0")) {
                break;
            }
            
            switch (action) {
                case "1":
                    System.out.println("Enter the license plate number to park:");
                    String plateIn = scanner.nextLine();
                    System.out.println(parking.parkVehicle(new Car(plateIn)));	
                    break;
                    
                case "2":
                    System.out.println("Enter the license plate number to search:");
                    String plateFind = scanner.nextLine();
                    System.out.println(parking.findVehicle(plateFind));
                    break;
                    
                case "3":
                    System.out.println("Enter the license plate number to exit:");
                    String plateOut = scanner.nextLine();
                    System.out.println(parking.leaveVehicle(plateOut));
                    break;
                    
                case "4":
                    System.out.println("Available free slots: " + parking.freeSlots());
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        
        System.out.println("System is closed. Goodbye!");
        scanner.close();
    }
}