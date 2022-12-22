package package_12;

public class Test {
    public static void main(String... args)
    {
        StringBuilder2 str = new StringBuilder2("Hello");
        str.append("WWW");
        str.undo();
        System.out.println(str.toString());
    }
}

