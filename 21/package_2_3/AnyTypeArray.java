package package_2_3;
import java.util.Arrays;
public class AnyTypeArray <E> {
    private E [] arr;

    public E getArrIndex(int index){
        return  arr[index] ;
    }

    public void setArr( E [] arr){
        this.arr =  arr;
    }

    public int getLength(){
        return  arr.length ;
    }
    public void printFirstFive() {
        System.out.println("task 4: ");
        var list = Arrays.asList(arr);
        list.stream().limit(5).forEach(System.out::println);

    }

}