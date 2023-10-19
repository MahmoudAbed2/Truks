import java.util.Scanner;

class UnloadingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        double weight;

        do {
            System.out.println("Welcome to the unloading system!");
            System.out.println("Please choose a type of truck:");
            System.out.println("A: Van");
            System.out.println("B: Small Truck");
            System.out.println("C: Heavy Truck");
            System.out.println("X: Exit the program");

            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.println("Enter the weight of the van (in tons): ");
                    weight = scanner.nextDouble();
                    if (weight < 5) {
                        System.out.println("The van (weight: " + weight + " tons) is unloaded at Dock A.");
                    } else {
                        System.out.println("Invalid weight for Dock A. Vans must weigh less than 5 tons.");
                    }
                    break;

                case 'B':
                    System.out.println("Enter the weight of the small truck (in tons): ");
                    weight = scanner.nextDouble();
                    if (weight < 5) {
                        System.out.println("The small truck (weight: " + weight + " tons) is unloaded at Dock B.");
                    } else {
                        System.out.println("Invalid weight for Dock B. Small trucks must weigh less than 5 tons.");
                    }
                    break;

                case 'C':
                    System.out.println("Enter the weight of the heavy truck (in tons): ");
                    weight = scanner.nextDouble();
                    if (weight >= 5 && weight <= 9) {
                        System.out.println("The heavy truck (weight: " + weight + " tons) is unloaded at Dock C.");
                    } else {
                        System.out.println("Invalid weight for Dock C. Heavy trucks must weigh between 5 and 9 tons.");
                    }
                    break;

                case 'D':
                    System.out.println("Enter the weight of the heavy truck (in tons): ");
                    weight = scanner.nextDouble();
                    if (weight >= 5 && weight <= 9) {
                        System.out.println("The heavy truck (weight: " + weight + " tons) is unloaded at Dock D.");
                    } else {
                        System.out.println("Invalid weight for Dock D. Heavy trucks must weigh between 5 and 9 tons.");
                    }
                    break;

                case 'E':
                    System.out.println("Enter the weight of the heavy truck (in tons): ");
                    weight = scanner.nextDouble();
                    if (weight >= 9) {
                        System.out.println("The heavy truck (weight: " + weight + " tons) is unloaded at Dock E.");
                    } else {
                        System.out.println("Invalid weight for Dock E. Heavy trucks must weigh at least 9 tons.");
                    }
                    break;

                case 'X':
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'X');

        scanner.close();
    }
}