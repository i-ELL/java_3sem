package package_2;

public class Main {
    public static void main(String[] args) {
        GeneralizedClass<Integer, Double, String> genericClass = new GeneralizedClass<>(1, 1.0, "10");
        System.out.println("Value T: " + genericClass.getT());
        System.out.println("value V: " + genericClass.getV());
        System.out.println("Value K: " + genericClass.getK());
        genericClass.printClasses();
    }
}
