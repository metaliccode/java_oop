// class parent 
package inheritance;

class Manager extends Employee {
    // String name;
    String company;

    // implementasi method super constructor
    Manager(String name) {
        // this.name = name;
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi, " + name + " i'm Manager " + this.name);
    }
}
