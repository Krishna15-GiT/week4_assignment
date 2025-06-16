// SmartDevice.java (Ques 1)

class SmartDevice {
    String model;
    String brand;

    public SmartDevice(String model, String brand) {
        this.brand = brand;
        this.model = model;
    }

    void turnOn() {
        System.out.println("Device is on");
    }

    void turnOff() {
        System.out.println("Device is off");
    }
}

class SmartPhone extends SmartDevice {
    public SmartPhone(String model, String brand) {
        super(model, brand); // calls parent constructor
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " phone " + model + " is on");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " phone " + model + " is off");
    }
}

// subclass for ythe  smart phone 
class SmartWatch extends SmartDevice {
    public SmartWatch(String model, String brand) {
        super(model, brand); // calls parent constructor
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " watch " + model + " is on");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " watch " + model + " is off");
    }
}

public class SmartDevice {
    public static void main(String[] args) {
        SmartDevice phone = new SmartPhone("A78", "Nokia");
        SmartDevice watch = new SmartWatch("Fit8", "Samsung");

        phone.turnOn();
        phone.turnOff();
        watch.turnOn();
        watch.turnOff();
    }
}