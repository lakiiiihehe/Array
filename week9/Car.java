package week9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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