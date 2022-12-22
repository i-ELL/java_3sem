public class Student {
    private String name;
    private String surname;
    private String cpecial;
    private int kurs;
    private String group;

    private int gpa;
    public Student(String name, String surname, String cpecial, int kurs,String group, int gpa){
        setName(name);
        setSurname(surname);
        setCpecial(cpecial);
        setKurs(kurs);
        setGroup(group);
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpecial() {
        return cpecial;
    }

    public void setCpecial(String cpecial) {
        this.cpecial = cpecial;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  " Student: " + getName() + " " + getSurname() + " Group = " + getGroup() +"Seciality = "+getCpecial() + " Course = " +getKurs() +" Average = " +getGpa();
    }
}
