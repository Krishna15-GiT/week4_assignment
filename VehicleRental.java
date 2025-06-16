// VehicleRental.java (Ques 6)

// Base class of vehicle
class Vehicle {
    public String plateNumber;
    public double baseRate;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}

// Subclass for Car
class Car extends Vehicle {
    public Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return baseRate * days;
    }
}

// Subclass for Truck
class Truck extends Vehicle {
    public double loadFee;

    public Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRental(int days) {
        return baseRate * days + loadFee;
    }
}

// Subclass for Bike
class Bike extends Vehicle {
    public double fixedRate;

    public Bike(String plateNumber, double baseRate, double fixedRate) {
        super(plateNumber, baseRate);
        this.fixedRate = fixedRate;
    }

    @Override
    public double calculateRental(int days) {
        return fixedRate;
    }
}

// Main class
public class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", 50);
        Vehicle truck = new Truck("TRK456", 80, 200);
        Vehicle bike = new Bike("BIK789", 30, 100);

        int days = 3;

        System.out.println("Car Plate: " + car.plateNumber);
        System.out.println("Car cost for " + days + " days: " + car.calculateRental(days));

        System.out.println("Truck Plate: " + truck.plateNumber);
        System.out.println("Truck cost for " + days + " days: " + truck.calculateRental(days));

        System.out.println("Bike Plate: " + bike.plateNumber);
        System.out.println("Bike cost for " + days + " days: " + bike.calculateRental(days));
    }
}