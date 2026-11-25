// 1. Parent Class (Superclass)
class Vehicle {
    protected String brand = "Ford"; // Accessible by subclasses

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// 2. Child Class (Subclass) inheriting from Vehicle using 'extends'
class Car extends Vehicle {
    private String modelName = "Mustang"; // Specific to Car

    public void displayDetails() {
        // 'brand' is inherited directly from the Vehicle class
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
    }
}

// 3. Main Class (must match the file name: InheritanceDemo.java)
public class Inheritancedemo {
    public static void main(String[] args) {
        // Create an object of the child class
        Car myCar = new Car();

        // 1. Call the method inherited from the Vehicle parent class
        myCar.honk();

        // 2. Call the method from the Car child class
        myCar.displayDetails();
    }
}