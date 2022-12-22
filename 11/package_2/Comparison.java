package package_2;


        import java.util.Calendar;
        import java.util.Date;
        import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input day, month, year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month - 1);
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);

        if (date.compareTo(now) == 0) {
            System.out.println("dates are equals");
        }
        else if (date.compareTo(now) < 0){
            System.out.println("date is less than current date");
        }
        else if (date.compareTo(now) > 0){
            System.out.println("date is more than current date");
        }
    }
}
