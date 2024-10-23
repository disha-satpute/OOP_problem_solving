
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public double calculateFuelEfficiency() {
        return 0;
    }

    public double calculateDistance(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    public double getMaxSpeed() {
        return 0;
    }


    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 10;
    }

    @Override
    public double getMaxSpeed() {
        return 80;
    }

    public void displayTruckDetails() {
        displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Max Speed: " + getMaxSpeed() + " mph");
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, String fuelType, int numDoors) {
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 25;
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }

    public void displayCarDetails() {
        displayDetails();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Max Speed: " + getMaxSpeed() + " mph");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 50;
    }

    @Override
    public double getMaxSpeed() {
        return 160;
    }

    public void displayMotorcycleDetails() {
        displayDetails();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Max Speed: " + getMaxSpeed() + " mph");
    }
}


public class Vehicle2 {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline", 2.5);
        truck.displayTruckDetails();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance traveled with 10 gallons: " + truck.calculateDistance(10) + " miles\n");

        Car car = new Car("Toyota", "Camry", 2021, "Hybrid", 4);
        car.displayCarDetails();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance traveled with 10 gallons: " + car.calculateDistance(10) + " miles\n");

        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020, "Gasoline", false);
        motorcycle.displayMotorcycleDetails();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance traveled with 10 gallons: " + motorcycle.calculateDistance(10) + " miles");
    }
}
