package package_4;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {0, 2, 4, 6};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println("MIN value: " + minMax.min());
        System.out.println("MAX value: " + minMax.max());

        System.out.println(Calculator.divide(100, 2));
        System.out.println(Calculator.multiply(4, 1.5));
        System.out.println(Calculator.subtraction(0, 8.6));
        System.out.println(Calculator.sum(2.07, 5));
    }
}
