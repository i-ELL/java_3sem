package package_3;


import java.util.Calendar;
import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input name and date of birth of student (day month year)");
        String name = sc.next();
        Calendar date = Calendar.getInstance();
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month - 1);
        date.set(Calendar.DAY_OF_MONTH, day);

        Student student = new Student(name, date);

        boolean StopFlag = false;
        while (!StopFlag) {
            System.out.println("input format of data\n 1 - short\n 2 - middle\n 3 - full\n 4 - exit");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> System.out.println(student.toString(1));
                case 2 -> System.out.println(student.toString(2));
                case 3 -> System.out.println(student.toString(3));
                case 4 -> StopFlag = true;
            }
        }
    }
}

