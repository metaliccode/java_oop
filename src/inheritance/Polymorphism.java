package inheritance;

public class Polymorphism {
    public static void main(String[] args) {
        // polymorphism: perubahan bentuk dari satu bentuk ke bentuk yang lain
        Employee employee = new Employee("Ihsan");
        employee.sayHello("Reka");

        employee = new Manager("Ihsan Mh");
        employee.sayHello("Reka");

        employee = new VicePresident("Ihsan Miftahul");
        employee.sayHello("Reka");

        sayHello(new Employee("Ihsan"));
        sayHello(new Manager("Yudit"));
        sayHello(new VicePresident("Ayas"));
    }

    // dengan polymorphism kita bisa cukup mendeklarasikan class parentnya untuk
    // mengaksek seluruh method child
    // static void sayHello(Employee employee) {
    // employee.sayHello("Hallo, " + employee.name);
    // }

    // static void sayHello(Manager employee) {
    // employee.sayHello("Hallo, " + employee.name);
    // }

    // type check /cast instanceof
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hallo VP:  " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hallo Manager:  " + manager.name);
        } else {
            System.out.println("Hallo, " + employee.name);
        }
    }
}
