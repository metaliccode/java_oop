package inixindo.final_class;

class SocialMedia {

}

class Twitter extends SocialMedia {

    final void login(String username, String password) {
        System.out.println("Login to Twitter with username: " + username + " and password: " + password);
    }

}

class FakeTwitter extends Twitter {

    // void login(String username, String password) {
    // System.out.println("Login to FakeTwitter with username: " + username + " and
    // password: " + password);
    // }

    // error karena sudah menggunakan final sehingga tidak bisa di override
}