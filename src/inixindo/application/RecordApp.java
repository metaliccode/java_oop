package inixindo.application;

import inixindo.record_class.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("inixindo", "12345");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Ihsan"));
        System.out.println(new LoginRequest("ihsan", "12345"));
    }
}
