package package_7_8;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int n = in.nextInt();

        Printable[] array = new Printable[n];
        for (int i = 0; i < n; i++)
            if (i%2==0)
                array[i] = new Book("Book "+((int)(i/2) +1));
            else
                array[i] = new Magazine("Magazine " + ((int)(i/2)+1));

        for (int i = 0; i < n; i++)
            array[i].print();

        System.out.println("Book: ");
        Book.printBook(array);
        System.out.println("Magazine: ");
        Magazine.printMagazine(array);
    }
}

