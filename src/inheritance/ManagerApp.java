package inheritance;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Ihsan");
        // manager.name = "Ihsan";
        manager.sayHello("Reka");

        // class VicePresident memiliki turunan fungsi dari Manager
        var vp = new VicePresident("Yudit");
        // vp.name = "Yudit";
        vp.sayHello("Reka");
    }
}
