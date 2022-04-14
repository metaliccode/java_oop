package inixindo.application;

import inixindo.abstrak.City;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);

    }
}
