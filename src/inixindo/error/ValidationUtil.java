package inixindo.error;

import java.lang.reflect.Field;

import inixindo.annotation.NotBlank;
import inixindo.record_class.LoginRequest;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null || loginRequest.username().isEmpty() || loginRequest.username().isBlank()) {
            throw new NullPointerException("Username is required");
        } else if (loginRequest.password() == null || loginRequest.password().isEmpty()
                || loginRequest.password().isBlank()) {
            throw new NullPointerException("password is required");
        }

        // if (loginRequest.username() == null || loginRequest.username().isEmpty() ||
        // loginRequest.username().isBlank()) {
        // throw new ValidationException("Username is required");
        // } else if (loginRequest.password() == null ||
        // loginRequest.password().isEmpty()
        // || loginRequest.password().isBlank()) {
        // throw new ValidationException("password is required");
        // }

    }

    // runtime exception boleh di throw atau tidak
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null || loginRequest.username().isEmpty() || loginRequest.username().isBlank()) {
            throw new NullPointerException("Username is required");
        } else if (loginRequest.password() == null || loginRequest.password().isEmpty()
                || loginRequest.password().isBlank()) {
            throw new NullPointerException("password is required");
        }
    }

    // Reflaction dengan Annotations notBlank
    public static void validationReflaction(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isEmpty() || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field : " + field.getName());
                }
            }
        }
    }

}
