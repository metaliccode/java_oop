package inixindo.interface_inheritance;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus is driving");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }

}
