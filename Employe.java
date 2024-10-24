
class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: Rs. " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary); // Call to the superclass constructor
        this.specialization = specialization;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary); // Call to the superclass constructor
        this.department = department;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Employe {
    public static void main(String[] args) {

        Employee employee = new Employee("DISHA", 30, "1234567890", "Pune", 50000.00, "Software Developer");
        employee.displayEmployeeDetails();

        Manager manager = new Manager("SANIKA", 45, "9876543210", "Mumbai", 80000.00, "IT Department");
        manager.displayManagerDetails();
    }
}
