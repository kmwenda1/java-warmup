import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("baraka");
        students.add("koome");
        students.add("darlene");
        students.add("mitchell");
        for (String student : students) {
            System.out.println(student);
        }
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("John", 20);
        scores.put("baraka", 21);
        scores.put("koome", 22);
        scores.put("darlene", 23);
        scores.put("mitchell", 24);
        for (String name : scores.keySet()) {
            System.out.println(name +" " +  "scored:" + " " + scores.get(name));
        }
        HashSet<String> uniqueStudents = new HashSet<>(students);
        uniqueStudents.add("blala");
        uniqueStudents.add("baraka");
        uniqueStudents.add("koome");
        uniqueStudents.add("gracie");
        System.out.println("uniqueStudents:" + uniqueStudents);

        System.out.println(scores);
        System.out.println(scores.get("John"));
        System.out.println(scores.containsKey("baraka"));
        System.out.println(students);
        System.out.println(students.get(2));
        System.out.println(students.size());


    }
}
