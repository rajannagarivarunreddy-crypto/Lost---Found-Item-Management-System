import java.util.*;

public class LostAndFound {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- LOST AND FOUND SYSTEM ---");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View Items");
            System.out.println("4. Search Item");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addItem("Lost");
                    break;

                case 2:
                    addItem("Found");
                    break;

                case 3:
                    viewItems();
                    break;

                case 4:
                    searchItem();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void addItem(String status) {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        items.add(name + " - " + location + " - " + status);
        System.out.println("Item added successfully!");
    }

    static void viewItems() {
        System.out.println("\nItems:");
        for (String item : items)
            System.out.println(item);
    }

    static void searchItem() {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        for (String item : items) {
            if (item.toLowerCase().contains(name.toLowerCase()))
                System.out.println(item);
        }
    }
}