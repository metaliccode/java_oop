package inixindo.record_class;

// constrcutor langsung di params
public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Membuat objek LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
