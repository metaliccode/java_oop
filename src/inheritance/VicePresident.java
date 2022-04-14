package inheritance;

class VicePresident extends Manager {

    // jika menggunakan super hrs dideklarasi super cntrucnya disini juga
    VicePresident(String name) {
        super(name);
    }

    // methode overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", I'm VP " + this.name);
    }
}
