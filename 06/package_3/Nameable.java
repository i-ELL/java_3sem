package package_3;

import java.util.Scanner;

public interface Nameable {
    String getName();

    class Planet implements package_3.Nameable{
        public String name;
        public Planet(String name){
            this.name = name;
        }
        @Override
        public String getName(){
            return this.name;
        }
    }
    class Animal implements package_3.Nameable{
        public String name;
        public Animal(String name){
            this.name = name;
        }
        @Override
        public String getName(){
            return this.name;
        }
    }
    class Main{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String name;
            name = in.nextLine();
            Planet pl = new Planet(name);
            name = in.nextLine();
            Animal an = new Animal(name);
            System.out.println("planet: " + pl.getName() + "\nanimal: " + an.getName() );
        }
    }
}
