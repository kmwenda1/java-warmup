public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        String s1 = "hello";
        String s2 = s1;
        String s3 = "hello";
        String s4 = new String("hello");

        System.out.println(a);
        System.out.println(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}


