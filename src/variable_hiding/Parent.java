package variable_hiding;

class Parent {

    String name;

    void doIt() {
        System.out.println("do it in parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("do it in child");
        System.out.println("Parent name is " + super.name);
    }

}
