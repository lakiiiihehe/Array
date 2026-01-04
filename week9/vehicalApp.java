package week9;

public class vehicalApp
{
    public static void main(String[] args) {
        Car c = new Car(1, "toyo", 50000, 4, "yuy");
        c.displayVehicleInfo();
        System.out.println("Tax: " + c.calculateTax());
        System.out.println("Final Price: " + c.calculateFinalPrice());
        System.out.println();

        Bike b = new Bike(2, "BMVVVVVVV", 32000, 150);
        b.displayVehicleInfo();
        System.out.println("Tax: " + b.calculateTax());
        System.out.println("Final Price: " + b.calculateFinalPrice());
    }
}
