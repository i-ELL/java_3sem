package package_6;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester6 {
    public static void main(String[] args) {
        String str = "root@localhost"; //myhost@@@com.ru,
        System.out.println(str);
        //String regex = "\"(\\\\w+)@(\\\\w+\\\\.)(\\\\w+)(\\\\.\\\\w+)*";
        String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        if (m.matches()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}