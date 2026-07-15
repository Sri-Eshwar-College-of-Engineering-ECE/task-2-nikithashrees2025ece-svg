
abstract class Vehicle {
    String vehicleNo;
    String model;
    int rate, days;

    Vehicle(String vehicleNo, String model, int rate, int days) {
        this.vehicleNo = vehicleNo;
        this.model = model;
        this.rate = rate;
        this.days = days;
    }

    abstract int calculateRentalCost();
}

class Car extends Vehicle {
    Car(String vehicleNo, String model, int rate, int days) {
        super(vehicleNo, model, rate, days);
    }

    int calculateRentalCost() {
        return (rate * days) + 500;
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNo, String model, int rate, int days) {
        super(vehicleNo, model, rate, days);
    }

    int calculateRentalCost() {
        return (rate * days) + 100;
    }
}

class Bus extends Vehicle {
    Bus(String vehicleNo, String model, int rate, int days) {
        super(vehicleNo, model, rate, days);
    }

    int calculateRentalCost() {
        return (rate * days) + (800 * days);
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        // Separate object creation
        Car c = new Car("C101", "Swift", 2000, 2);
        Bike b = new Bike("B101", "R15", 700, 2);
        Bus bs = new Bus("BS101", "Volvo", 5000, 2);

        // Store objects in parent class array
        Vehicle[] vehicle = {c, b, bs};

        // Display rental cost
        for (Vehicle v : vehicle) {
            System.out.println("Vehicle No : " + v.vehicleNo);
            System.out.println("Model : " + v.model);
            System.out.println("Rental Cost : ₹" + v.calculateRentalCost());
            System.out.println();
        }
    }
}