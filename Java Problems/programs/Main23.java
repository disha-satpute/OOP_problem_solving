// Class to represent an Employee
class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayInfo() {
        System.out.printf("%-15s %-20d %-25s%n", name, yearOfJoining, address);
    }
}

public class Main23 {
    public static void main(String[] args) {
        // Creating three Employee objects
        Employee emp1 = new Employee("Robert", 1994, 50000, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, 60000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, 55000, "26B- WallsStreat");

        // Printing the header
        System.out.printf("%-15s %-20s %-25s%n", "Name", "Year of Joining", "Address");
        System.out.println("------------------------------------------------------------");

        // Displaying employee details
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
