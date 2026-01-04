package week9;

public class Vehicle
{
    int vehicleID;
    String brand;
    double BasePrice;
    
     Vehicle(int vehicleId, String brand, double basePrice) 
    {
        this.vehicleID = vehicleId;
        this.brand = brand;
        this.BasePrice = basePrice;
    }

    void displayVehicleInfo() 
    {
        System.out.println("VehicleID: " + vehicleID);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: " + BasePrice);
    }

    double calculateTax() 
    {
        return BasePrice * 0.10;
    }
}

class Car extends Vehicle 
{
    int numberOfDoors;
    String fuelType;

    Car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType)
    {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    double calculateFinalPrice()
    {
        double tax = super.calculateTax();
        double luxuryCharge = BasePrice * 0.05;
        return BasePrice + tax + luxuryCharge;
    }
}

class Bike extends Vehicle {
    int engineCapacity;

    Bike(int vehicleId, String brand, double basePrice, int engineCapacity) 
    {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }
    double calculateFinalPrice() {
        double tax = super.calculateTax();
        return BasePrice + tax;
    }
}
