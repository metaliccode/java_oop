package inixindo.interface_inheritance;

public interface Car extends HasBrand, isMaintenance {

    // public abstract void drive();
    void drive();

    int getTier();

    // di java versi 8 -> jika menambahkan mathode baru
    // boolean isBig();
    default boolean isBig() {
        return false;
    }

}
