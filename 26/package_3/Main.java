package package_3;

public class Main {
    public static void main(String[] args) {

        var hashtab = new hashTab();
        hashtab.add("A", "A");
        hashtab.add("B", "B");
        hashtab.add("C", "C");
        hashtab.add("D", "D");
        System.out.println(hashtab.find("A"));
        System.out.println(hashtab.find("B"));
        hashtab.delete("B");
        System.out.println(hashtab.find("B"));



        hashtab = new hashTab();
        hashtab.add("A", "A");
        hashtab.add("B", "B");
        hashtab.add("C", "C");
        hashtab.add("D", "D");
        hashtab.add("E", "E");
        hashtab.add("F", "F");
        hashtab.add("G", "G");
        hashtab.add("H", "H");
        hashtab.add("I", "I");
        hashtab.add("J", "J");

        for (int i = 0; i < 3; i++) {
            var min = hashtab.getMinimum();
            System.out.println(min);
            hashtab.delete(min);
        }
    }
}
