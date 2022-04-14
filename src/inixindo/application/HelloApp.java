package inixindo.application;

import inixindo.anonymous_class.Hello;

public class HelloApp {
    public static void main(String[] args) {

        // cara pemanggilan anonymous class
        Hello english = new Hello() {
            public void sayHello() {
                System.out.println("Hello World!");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Ihsan");
    }
}
