package inixindo.application;

import inixindo.enkapsulasi.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        // category.id = null; -> jika public bisa dimanipulasi
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
