package Books;

public class BookShelf extends Book{
    private int n;
    private Book[] shelf;

    public BookShelf(int n){
        this.n = n;
        this.shelf = new Book[n];
    }

    public int getN() {
        return n;
    }

    public Book[] getShelf() {
        return shelf;
    }

    public Book minOfshelf(){
        Book min = this.shelf[0];
        int minInt = this.shelf[0].getYear();
        for(int i =1; i<this.n; i++){
            if (shelf[i].getYear() < minInt) {
                minInt = shelf[i].getYear();
                min = shelf[i];
            }
        }
        return min;
    }

    public Book maxOfshelf(){
        Book  max = this.shelf[0];
        int maxInt = this.shelf[0].getYear();
        for(int i =1; i<this.n; i++){
            if (shelf[i].getYear() > maxInt) {
                maxInt = shelf[i].getYear();
                max = shelf[i];
            }
        }
        return max;
    }

    public void inup(){
        Book temp;
        for(int i =0; i<this.n; i++){
            for(int j=i+1; j<this.n; j++){
                if (this.shelf[i].getYear() > this.shelf[j].getYear()) {
                    temp = this.shelf[i];
                    this.shelf[i] = this.shelf[j];
                    this.shelf[j] = temp;
                }
            }
        }
        //return shelf;
    }
}
