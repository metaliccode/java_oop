package inixindo.application;

import inixindo.annotation.CreateUserRequest;
import inixindo.error.ValidationUtil;

public class ReflactionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setPassword("12345");
        request.setUsername("inixindo");

        ValidationUtil.validationReflaction(request);
    }
}
