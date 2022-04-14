public class PersonApp {
    public static void main(String[] args) {
        // membuat object
        // var person1 = new Person();
        // Person person2 = new Person();
        // jika membuat suatu object harus sesuai dengan parameter
        var person1 = new Person("Budi", "Jl. Malioboro");

        // set nilai property
        // person1.name = "Ihsan";
        // person1.address = "Bandung";
        // person1.country = "Indonesia"; // tidak bisa diubah

        System.out.println("Nama: " + person1.name);
        System.out.println("Alamat: " + person1.address);
        System.out.println("Negara: " + person1.country);

        // memanggil method dari object
        person1.sayHello("Dine");

        // dengan object constructor overloading lebih flexibel
        Person person2 = new Person("Wahyu", "Bandung");
        Person person4 = new Person("Rizki");
        Person person5 = new Person();
        person4.sayHello("Ayas");
        person5.name = "Yudit";
        System.out.println("Nama: " + person5.name);

        Person person3;
        person3 = new Person("ihsan", "bandung");
        person3.sayHello("Reka");

    }
}
