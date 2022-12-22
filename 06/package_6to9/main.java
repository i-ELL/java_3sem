package package_6to9;

import java.util.Scanner;

class Main {
    //задания с 6 по 9

    public static void main(String[] args) {
        Book new_book = new Book("S. Lem", "Solaris", 1960);
        //Scanner in = new Scanner(System.in);
        new_book.print();

        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of computer  ");
        int n = in.nextInt();
        in.nextLine();
        String name;
        for(int i = 0; i < n; i++) {
            System.out.println("enter computer  ");

            name = in.nextLine();
            shop.addComputer(new Computer(name));
        }
        shop.deleteComputer("hp");
        shop.findComputer("acer");
        shop.print();

        String  author;
        int year;
        Printable arr[] = new Printable[n];
        for(int i=0; i<n; i++){
            System.out.println("enter book: name of author, name of book, year");
            author = in.nextLine();
            name = in.nextLine();
            year = in.nextInt();
            in.nextLine();

            arr[i] = new Book(author, name, year);
        }
        for(int i=0; i<n; i++) {
        arr[i].print();
        }


    }
}
