

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setColor("Blue");
        car1.setSpeed(120);

        Car car2 = new Car();
        car2.setBrand("Tesla");
        car2.setColor("Red");
        car2.setSpeed(150);

        ElectricCar ec = new ElectricCar();
        ec.setBatteryLevel(80);
        ec.setBrand("Rivian");
        ec.setSpeed(200);
        System.out.println(ec.getBrand() + " battery: " + ec.getBatteryLevel());


        System.out.println(car1.getBrand() + " and  " +  car2.getBrand());
        System.out.println(car2.getSpeed());
    }

}


