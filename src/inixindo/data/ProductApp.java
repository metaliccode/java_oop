package inixindo.data;

public class ProductApp {
    public static void main(String[] args) {
        Product p = new Product("Macbook Pro", 10000);
        System.out.println(p.name);
        System.out.println(p.price);

        System.out.println(p);

        // cek menggunakan override equals
        Product p2 = new Product("Macbook Pro", 10000);
        System.out.println(p.equals(p2));
        System.out.println(p.hashCode() == p2.hashCode());
    }
}
