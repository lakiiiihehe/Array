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

