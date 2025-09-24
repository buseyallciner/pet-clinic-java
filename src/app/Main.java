package app;

import app.service.ClinicService;
import app.model.Pet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClinicService clinicService = new ClinicService();

        while (true) {
            System.out.println("\n=== PetClinic ===");
            System.out.println("1) Add Dog");
            System.out.println("2) Add Cat");
            System.out.println("3) List Pets");
            System.out.println("4) Total Daily Cost");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine().trim());

            if (choice == 1) {
                System.out.print("Dog name: ");
                String name = sc.nextLine();
                System.out.print("Weight (kg): ");
                double weight = Double.parseDouble(sc.nextLine().trim().replace(",", "."));
                Pet d = clinicService.addDog(name, weight);
                System.out.println("Added: " + d + " sound=" + d.speak());
            } else if (choice == 2) {
                System.out.print("Cat name: ");
                String name = sc.nextLine();
                System.out.print("Weight (kg): ");
                double weight = Double.parseDouble(sc.nextLine().trim().replace(",", "."));
                Pet c = clinicService.addCat(name, weight);
                System.out.println("Added: " + c + " sound=" + c.speak());
            } else if (choice == 3) {
                List<Pet> list = clinicService.getPets();
                if (list.isEmpty()) {
                    System.out.println("(empty)");
                } else {
                    for (Pet p : list) {
                        System.out.println(p + " | speak=" + p.speak());
                    }
                }
            } else if (choice == 4) {
                double total = clinicService.totalDailyCost();
                System.out.printf("Total: %.2f$%n", total);
            } else if (choice == 0) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}


