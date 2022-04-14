package inixindo.static_key;

public class App {

    public static final int PROCESSORS;
    static {
        System.out.println("App static block: Hitung Processor");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
