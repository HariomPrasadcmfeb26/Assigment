package Question_2;

class Vehicle {
    String brand;
    int speed;

    // Static block → runs once when class loads
    static {
        System.out.println("Fleet Management System Initialized");
    }

    // Non-static block → runs every time object is created
    {
        System.out.println("Vehicle object is being created...");
    }

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Update speed
    void updateSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    // Display details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

// Derived class: Car
class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    double mileage;

    Bike(String brand, int speed, double mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

// Main class
public class FleetSystem {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 120, "Petrol");
        Bike b1 = new Bike("Yamaha", 80, 45);

        System.out.println("\n--- Car Details ---");
        c1.display();

        System.out.println("\n--- Bike Details ---");
        b1.display();

        // Update speed
        c1.updateSpeed(140);
        System.out.println("\nUpdated Car Speed:");
        c1.display();
    }
}