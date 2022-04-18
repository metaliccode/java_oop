package inixindo.application;

public class StackTraceApp {
    public static void main(String[] args) {
        // try {
        // String[] names = {
        // "Ihsan", "Miftahul", "Huda"
        // };
        // System.out.println(names[100]);
        // } catch (Throwable e) {
        // StackTraceElement[] stackTraceElements = e.getStackTrace();

        // e.printStackTrace();
        // }

        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Ihsan", "Miftahul", "Huda"
            };
            System.out.println(names[100]);
        } catch (Throwable e) {
            throw new RuntimeException("Error", e);
        }
    }
}
