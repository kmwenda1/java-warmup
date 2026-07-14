public class ElectricCar extends Car {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            System.out.println("invalid battery level. Please enter a value between 0 and 100.");
        } else {
            this.batteryLevel = batteryLevel;
        }
    }
}




