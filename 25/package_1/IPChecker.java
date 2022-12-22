package package_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPChecker {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // right: 127.0.0.1, 255.255.255.0
        // not right: 1300.6.7.8, abc.def.gha.bcd.
        var ip = scanner.nextLine();
        var regex = "^(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])))$";
        System.out.println((Pattern.matches(regex, ip)) ? "IP is right" : "IP is not right");
    }
}