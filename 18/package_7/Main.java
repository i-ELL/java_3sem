package package_7;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.getKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}