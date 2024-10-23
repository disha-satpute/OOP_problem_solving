import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String name;
    String address;
    String telephone;
    String mobile;
    String headOfFamily;
    String uniqueID;

    public Person(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + telephone);
        System.out.println("Mobile: " + mobile);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
}

public class Directory {
    static ArrayList<Person> directory = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void createEntry() {
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        System.out.println("Enter Telephone (with STD code, if available):");
        String telephone = scanner.nextLine();
        System.out.println("Enter Mobile (if available):");
        String mobile = scanner.nextLine();
        System.out.println("Enter Head of Family:");
        String headOfFamily = scanner.nextLine();
        System.out.println("Enter Unique ID No. (must be unique):");
        String uniqueID = scanner.nextLine();

        for (Person person : directory) {
            if (person.uniqueID.equals(uniqueID)) {
                System.out.println("Error: Unique ID already exists. Entry not added.");
                return;
            }
        }

        directory.add(new Person(name, address, telephone, mobile, headOfFamily, uniqueID));
        System.out.println("Entry added successfully!");
    }

    public static void editEntry() {
        System.out.println("Enter the Unique ID of the entry you want to edit:");
        String uniqueID = scanner.nextLine();

        for (Person person : directory) {
            if (person.uniqueID.equals(uniqueID)) {
                System.out.println("Editing entry for Unique ID: " + uniqueID);
                System.out.println("Enter new Name (leave blank to keep current):");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    person.name = newName;
                }

                System.out.println("Enter new Address (leave blank to keep current):");
                String newAddress = scanner.nextLine();
                if (!newAddress.isEmpty()) {
                    person.address = newAddress;
                }

                System.out.println("Enter new Telephone (leave blank to keep current):");
                String newTelephone = scanner.nextLine();
                if (!newTelephone.isEmpty()) {
                    person.telephone = newTelephone;
                }

                System.out.println("Enter new Mobile (leave blank to keep current):");
                String newMobile = scanner.nextLine();
                if (!newMobile.isEmpty()) {
                    person.mobile = newMobile;
                }

                System.out.println("Enter new Head of Family (leave blank to keep current):");
                String newHeadOfFamily = scanner.nextLine();
                if (!newHeadOfFamily.isEmpty()) {
                    person.headOfFamily = newHeadOfFamily;
                }

                System.out.println("Entry updated successfully!");
                return;
            }
        }
        System.out.println("Error: Unique ID not found.");
    }

    public static void searchByKeyword() {
        System.out.println("Enter keyword to search:");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Person person : directory) {

            String combinedInfo = (person.name + person.address + person.telephone + person.mobile + 
                                   person.headOfFamily + person.uniqueID).toLowerCase();

      if (combinedInfo.contains(keyword)) {
                person.displayInfo();
                System.out.println("------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching entries found.");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nDirectory Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createEntry();
                    break;
                case 2:
                    editEntry();
                    break;
                case 3:
                    searchByKeyword();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
