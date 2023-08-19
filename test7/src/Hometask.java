public class Hometask {
}

abstract class Car {
    String licensePlate;
    String brand;

    abstract double getPrice();

    void getInfo() {
        System.out.println("This is a Car.");
    }
}

interface PickUpSpeed {
    int MAX_SPEED = 250;

    double speedUp(double speed);

    static int getMaxSpeed() {
        System.out.print("Максимальная скорость равна: ");
        return MAX_SPEED;
    }
}

interface OpenDoors {
    void openAllDoors();

    default void openFrontDoors() {
        System.out.println("Only front doors are opened.");
    }
}

class LargeCar extends Car {
    double getPrice() {
        return 100;
    }

    void getInfo() {
        System.out.println("This is a Large Car.");
    }

    double carWeighs() {
        return 5000;
    }

    double carWeighs(double weight) {
        return 5000 + weight;
    }

    int carWeighs(int weight) {
        return 5000 + weight;
    }
}

class Bus extends LargeCar implements OpenDoors {
    int years;

    Bus() {
        licensePlate = "no license";
        brand = "no name";
        years = 0;
    }

    Bus(String licensePlate, String brand, int years) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.years = years;
    }

    void getInfo() {
        System.out.println("This is a Bus.");
    }

    public void openAllDoors() {
        System.out.println("The Bus is opened all the doors.");
    }

    public void openFrontDoors() {
        System.out.println("The front doors in Bus are opened.");
    }

}

class MiniCar extends Car implements PickUpSpeed, OpenDoors {
    double getPrice() {
        return 200;
    }

    void getInfo() {
        System.out.println("This is a Mini Car.");
    }

    public double speedUp(double speed) {
        System.out.print("Машина набрала скорость: ");
        return speed;
    }

    public void openAllDoors() {
        System.out.println("All doors are opened.");
    }
}

class SportCar extends MiniCar {
    boolean hasRoof;

    SportCar() {
        hasRoof = false;
        licensePlate = "no";
        brand = "no";
    }

    SportCar(boolean hasRoof, String licensePlate, String brand) {
        this.hasRoof = hasRoof;
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    void getInfo() {
        System.out.println("This is a SportCar.");
    }

    int countPass() {
        return 0;
    }

    String countPass(String pass) {
        return "Count of passagers " + pass;
    }
}

class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("AA 2107 AA", "Man", 10);
        MiniCar miniCar = new MiniCar();
        //bus.openAllDoors();
        //bus.openFrontDoors();

        System.out.println(miniCar.speedUp(170));
        int maxSpeed = PickUpSpeed.getMaxSpeed();
        System.out.println(maxSpeed);
        miniCar.openFrontDoors();
        miniCar.openAllDoors();
    }
}