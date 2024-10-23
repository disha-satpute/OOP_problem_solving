// Parent Class Person
class Person {
    protected String name;
    protected int age;
    protected final String id;
    private static int idCounter = 1;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = "ID" + idCounter++;
    }

    // Final method  (cannot be overridden)
    public final void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}

class Student extends Person {
    private String course;
    private int marks;

    public Student(String name, int age, String course, int marks) {
        super(name, age);
        this.course = course;
        this.marks = marks;
    }


    public void displayStudentInfo() {
        // Use super to call the parent class method
        super.displayBasicInfo();
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

class Professor extends Person {
    private String department;
    private double salary;

    public Professor(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    public void displayProfessorInfo() {
        super.displayBasicInfo();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class CollegeManagementSystem {
    public static final String COLLEGE_NAME = "MIT AOE";

    // Static method to display college name
    public static void displayCollegeName() {
        System.out.println("Welcome to " + COLLEGE_NAME);
    }

    public static void main(String[] args) {

        displayCollegeName();

        Student student1 = new Student("Disha", 20, "Computer Science", 85);
        Student student2 = new Student("Sakshi", 22, "Mechanical Engineering", 90);

        Professor professor1 = new Professor("Dr. Meenakshi", 45, "Physics", 75000);
        Professor professor2 = new Professor("Dr. Pushpmala", 50, "Computer Science", 85000);

        System.out.println("\nStudent Information:");
        student1.displayStudentInfo();
        System.out.println("------");
        student2.displayStudentInfo();

        System.out.println("\nProfessor Information:");
        professor1.displayProfessorInfo();
        System.out.println("------");
        professor2.displayProfessorInfo();
    }
}
