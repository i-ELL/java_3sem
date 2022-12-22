package Dogs;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name){
        setName(name);
        setAge(age);
    }
    public int getAgeH(){
        return age*7;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Dog{" +
                "name=" + name + ", age=" + age + '}';
    }
}
