package inixindo.application;

import inixindo.data.Product;

public class Application {
    public static void main(String[] args) {
        Product p = new Product("Macbook Pro", 30_000_000);
        System.out.println(p.name);
        System.out.println(p.price);
    }
}
