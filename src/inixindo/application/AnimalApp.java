package inixindo.application;

import inixindo.abstrakmethod.Animal;
import inixindo.abstrakmethod.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        // abstract digunakan jika ingin semua turunannya menggunakan method tersebut

        Animal animal = new Cat();
        animal.name = "Oyen";
        animal.run();
    }
}
