package inixindo.application;

import inixindo.error.ValidationException;
import inixindo.error.ValidationUtil;
import inixindo.record_class.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        // ValidationUtil.validate(loginRequest); //error

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException e) {
            System.out.println("Data tidak Valid: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Data null: " + e.getMessage());
        }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak Valid: " + e.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        // coba runtime exception
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);

    }
}
