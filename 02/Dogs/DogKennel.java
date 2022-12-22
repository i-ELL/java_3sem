package Dogs;

import java.util.Scanner;

public class DogKennel {
    private int n;
    private Dog test[] = new Dog[n];
    public DogKennel(){}

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public Dog[] getTest() {
        return test;
    }

    public void setTest(Dog[] test) {
        this.test = test;
    }

    public Dog[] AddDog(int k) {
        Scanner m = new Scanner(System.in);
        String name;
        int age;

        Dog temp[] = new Dog[n+k];
        for(int i=0; i<n; i++){
        temp[i] = test[i];
        }
    //test = temp;
    for(int i = n; i<n+k; i++){
        System.out.print("enter the age and name of dog:  ");
        age = m.nextInt();
        m.nextLine();
        name = m.nextLine();

        temp[i] = new Dog(age, name);
    }
    test = temp;
    return test;
    }
    public void SetTest(int n){

    }

    public static void main(String[] args) {
        DogKennel a = new DogKennel();
        System.out.println("enter number of dogs:  ");
        int n;
        //Scanner s = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        n = m.nextInt();
        Dog test[] = new Dog[n];

        String name;
        int age;
        int k;
        for(int i=0; i<n; i++){
            System.out.print("enter the age and name of dog:  ");
            age = m.nextInt();
            m.nextLine();
            name = m.nextLine();

            test[i] = new Dog(age, name);
        }
        a.test = test;

        for(int i=0; i<n; i++){
            System.out.println(a.test[i].toString() + "; age in years: " + a.test[i].getAgeH());
        }

        System.out.print("enter the numbers of dogs to add:  ");
        k = m.nextInt();

        a.test = a.AddDog(k);

        for(int i=0; i<k; i++){
            System.out.println(a.test[i].toString() + "; age in years: " + a.test[i].getAgeH());
        }

        }
}
