package inixindo.application;

import inixindo.static_key.App;
// import inixindo.static_key.Constant;
import static inixindo.static_key.Constant.*;
import inixindo.static_key.Country;
import util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // System.out.println(Constant.APPLICATION);
        System.out.println(APPLICATION);
        System.out.println(AUTHOR);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1, 2, 3, 4, 5));

        // cara pemanggilan inner class
        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName());

        System.out.println(App.PROCESSORS);
    }
}
