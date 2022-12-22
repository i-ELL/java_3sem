package package_4;


import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class BrackChecker {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\([^()]*\\)");
        Matcher m;
        // right (3*+*5)*–*9*×*4
        //not rigth ((3*+*5)*–*9*×*4
        var scanner = new Scanner(System.in);
        var s = scanner.nextLine();
        while ((m = p.matcher(s)).find())
            s = m.replaceAll("");
        System.out.println((s.contains("(") || s.contains(")") ? "not right" : "right"));
    }
}