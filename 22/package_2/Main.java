package package_2;

public class Main {
    public static void main(String[] args) {
        var calc = new CalcStack();
        System.out.println(calc.calculate("2 3 +"));
        System.out.println(calc.calculate("2 3 * 4 5 * +"));
        System.out.println(calc.calculate("2 3 4 5 6 * + - /"));

        var calcGUI = new CalculatorGUI();
    }

}
