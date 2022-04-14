package inixindo.application;

public class EqualsApp {
    public static void main(String[] args) {

        String a = "ihsan";
        a = a + " " + "miftahul";
        System.out.println(a);

        String b = "ihsan miftahul";
        System.out.println(b);

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = "ihsan miftahul";
        System.out.println(c == b);
        System.out.println(c.equals(b));
    }
}
