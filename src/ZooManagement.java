import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ZooManagement zoo = new ZooManagement();

        do {
            System.out.print("Enter the zoo name: ");
            zoo.zooName = scanner.nextLine();

            if (zoo.zooName.trim().isEmpty()) {
                System.out.println("Error: zoo name cannot be empty.");
            }

        } while (zoo.zooName.trim().isEmpty());

        do {
            System.out.print("Enter the number of cages: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: please enter an integer.");
                scanner.next();
                System.out.print("Enter the number of cages: ");
            }

            zoo.nbrCages = scanner.nextInt();

            if (zoo.nbrCages <= 0) {
                System.out.println("Error: number of cages must be positive.");
            }

        } while (zoo.nbrCages <= 0);

        System.out.println("Zoo name: " + zoo.zooName);
        System.out.println("Number of cages: " + zoo.nbrCages);

        scanner.close();
    }
}