package pack_1;
import java.util.Scanner;


public class TesterA {
    public static void main(String[] args) {
        String name;
        String email;
        char gender;
        Author A1 = new Author("Akunin", "Akunin@gmail.com", 'm');
        System.out.println(A1.toString());
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of author: ");
        name = s.nextLine();
        A1.setName(name);
        System.out.print("Enter the email of author: ");
        email = s.nextLine();
        A1.setEmail(email);
        System.out.print("Enter the gender of author: ");
        gender = s.next().charAt(0);
        A1.setGender(gender);
        System.out.println( "name = " + A1.getName() + '\n' +  "email = " +  A1.getEmail() + '\n' + "gender =  " +   A1.getGender());

    }
}
