

public class Main {
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        car1.setBrand("Toyota");
        car1.setColor("Blue");
        car1.setSpeed(120);

        ElectricCar car2 = new ElectricCar();
        car2.setBrand("Tesla");
        car2.setColor("Red");
        car2.setSpeed(150);

        Truck truck1 = new Truck();
        truck1.setBrand("Volvo");
        truck1.setColor("Black");
        truck1.setSpeed(80);
        truck1.setPayloadCapacity(2000);

        ElectricCar ec = new ElectricCar();
        ec.setBatteryLevel(80);
        ec.setBrand("Rivian");
        ec.setSpeed(200);
        ec.describe();
        car1.describe();
        car2.describe();
        truck1.describe();
        ec.setColor("green");
        System.out.println(ec.getBrand() + " battery: " + ec.getBatteryLevel());


        System.out.println(car1.getBrand() + " and  " +  car2.getBrand());
        System.out.println(car2.getSpeed());
    }

}


