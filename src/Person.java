class Person {
    // field / properties/ atribut
    String name;
    String address;
    final String country = "Indonesia";

    // constructor / konstruktor method yang akan dieksekusi pertama kali/ hrs sama
    // dengan nama class
    Person(String name, String address) {
        // keyword this mengatasi variable shadowing
        this.name = name;
        this.address = address;
    }

    // constructor overloading
    Person(String paramName) {
        // jika ingin memanggil constructor lain, maka harus menggunakan this
        // name = paramName;
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    // void sayHello(String paramName) {
    // parameter shadowing
    void sayHello(String name) {
        // System.out.println("Hello, " + paramName + " my name is " + name);
        System.out.println("Hello, " + name + " my name is " + this.name);
    }
}
