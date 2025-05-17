package Practice_Problem_05;

class Car {
    private String owner;
    private String brand;
    private String serialNumber;
    private boolean isRunning;
    private double fuelLevel;


    public Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.isRunning = false;
        this.fuelLevel = fuelLevel;
    }

    public void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car is running");
        } else {
            System.out.println("fuel is empty!");
        }
    }

    public void stopCar() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    public void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters");
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Car refueled with " + amount + " liters.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("John Doe", "Toyota", "123ABC", 10.5);

        myCar.checkFuel();
        myCar.startCar();
        myCar.stopCar();
        myCar.refuel(5.0);
        myCar.checkFuel();
    }
}
