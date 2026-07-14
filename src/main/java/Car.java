public class Car {

        private String brand;
        private String color;
        private int speed;

        public String getBrand() {
            return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;

        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            if (speed < 0) {
                System.out.println("Invalid speed. Please enter a positive value.");
            } else {

                this.speed = speed;
            }
        }


}
