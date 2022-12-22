package Books;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book(){}

    public Book(String author, String name, int year){
        setAuthor(author);
        setYear(year);
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
}

