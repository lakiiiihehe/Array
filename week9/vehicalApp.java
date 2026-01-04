package week9;

public class vehicalApp
{
    public static void main(String[] args) {
        Car car = new Car(1, "toyota", 50000, 4, "dis");
        car.displayVehicleInfo();
        System.out.println("Tax: " + car.calculateTax());
        System.out.println("Final Price: " + car.calculateFinalPrice());
        System.out.println();

        Bike bike = new Bike(2, "BMW", 3200000, 150);
        bike.displayVehicleInfo();
        System.out.println("Tax: " + bike.calculateTax());
        System.out.println("Final Price: " + bike.calculateFinalPrice());
    }
}
