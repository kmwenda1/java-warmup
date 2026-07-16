public class Truck extends Car {
    private int payloadCapacity;

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        if (payloadCapacity < 0 ) {
            System.out.println("Invalid payload capacity. Please enter a positive value.");
        } else {
            this.payloadCapacity = payloadCapacity;
        }
    }

    @Override
    public void describe() {
        System.out.println("Brand: " + getBrand() + ", Color: " + getColor() + ", Speed: " + getSpeed() + ", Payload Capacity: " + getPayloadCapacity());
    }
}