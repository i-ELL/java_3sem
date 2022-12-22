package Books;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, author;
        int year;
        System.out.println("enter author, name and year of publication ");
        author = in.nextLine();
        name = in.nextLine();
        year = in.nextInt();
        Book BookOne = new Book(author, name, year);

        System.out.println("Book: author: " + author + ", name: " + name + ", year: " + year);

        System.out.println("enter numbers of books ");
        int n;
        n = in.nextInt();
        in.nextLine();
        BookShelf bsone = new BookShelf(n);
        for(int i=0; i<n; i++){
            System.out.println("enter author, name and year of publication ");
            author = in.nextLine();
            name = in.nextLine();
            year = in.nextInt();
            in.nextLine();

            bsone.getShelf()[i]= new Book(author, name, year);
        }

        for(int i=0; i<n; i++){
            System.out.println(i+": "+ bsone.getShelf()[i].getAuthor() + ", " +  bsone.getShelf()[i].getName() + ", " +  bsone.getShelf()[i].getYear() );
        }

        System.out.println("min year: " + bsone.minOfshelf().getYear() +", " + bsone.minOfshelf().getName() +", " + bsone.minOfshelf().getAuthor());
        System.out.println("max year: " + bsone.maxOfshelf().getYear() +", " + bsone.maxOfshelf().getName() +", " + bsone.maxOfshelf().getAuthor());

        bsone.inup();
        for(int i=0; i<n; i++){
            System.out.println(bsone.getShelf()[i].getAuthor() + ", " +  bsone.getShelf()[i].getName() + ", " +  bsone.getShelf()[i].getYear() );
        }

    }
}
