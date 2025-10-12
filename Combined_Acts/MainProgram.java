import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Run Alarm Clock");
            System.out.println("2. Run Animal Sound");
            System.out.println("3. Run Shape Choose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = menuScanner.nextInt();
            menuScanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\n--- Running Monday Program ---");
                    monday.main(new String[]{});
                    break;

                case 2:
                    System.out.println("\n--- Running RunAnimal Program ---");
                    RunAnimal.main(new String[]{});
                    break;

                case 3:
                    System.out.println("\n--- Running RunQuad Program ---");
                    RunQuad.main(new String[]{});
                    break;

                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        menuScanner.close();
    }
}
