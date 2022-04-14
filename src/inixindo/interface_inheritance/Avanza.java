package inixindo.interface_inheritance;

public class Avanza implements Car {
    // public class Avanza implements Car, isMaintenance {

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Avanza is driving");
    }

    @Override
    public int getTier() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        // TODO Auto-generated method stub
        return false;
    }
}
