package inixindo.application;

import inixindo.enum_class.Customer;
import inixindo.enum_class.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Ihsan");
        customer.setLevel(Level.VIP);
        System.out.println("Nama: " + customer.getName());
        System.out.println("Level: " + customer.getLevel().getDescription());

        // konversi enum ke string
        String levelName = Level.VIP.name();
        System.out.println("Level name: " + levelName);

        Level level = Level.valueOf("PREMIUM");
        // Level level = Level.valueOf("SALAH");
        System.out.println(level);

        System.out.println("Print Level:");
        for (Level l : Level.values()) {
            System.out.println(l);
        }
    }
}
