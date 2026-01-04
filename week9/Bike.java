package week9;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


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
