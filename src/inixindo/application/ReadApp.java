package inixindo.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        // BufferedReader reader = null;

        // try {
        // reader = new BufferedReader(new FileReader("README.md"));

        // while (true) {
        // String line = reader.readLine();
        // if (line == null) {
        // break;
        // }
        // System.out.println(line);
        // }
        // } catch (Throwable e) {
        // System.out.println("Error membaca file : " + e.getMessage());
        // } finally {
        // if (reader != null) {
        // try {
        // reader.close();
        // System.out.println("Sukses menutup");
        // } catch (IOException e) {
        // System.out.println("Error menutup resource " + e.getMessage());
        // }
        // }
        // }

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println("Error membaca file : " + e.getMessage());
        }
    }
}
