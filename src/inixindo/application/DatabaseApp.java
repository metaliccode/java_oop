package inixindo.application;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("ihsan", null);
        System.out.println("Connected Successfully");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new NullPointerException("Tidak bisa koneksi ke database");
        }
    }

}
