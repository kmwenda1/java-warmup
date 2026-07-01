public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Hunting Day");
                break;
            case "Tuesday":
                System.out.println("Fishing Day");
                break;
            case "Wednesday":
                System.out.println("Hiking Day");
                break;
            case "Thursday":
                System.out.println("Swimming Day");
                break;
            case "Friday":
                System.out.println("Rest Day");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}


