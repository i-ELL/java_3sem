package package_2;

import java.util.Arrays;

public class LabClassDriver {
    public static void main(String[] args) {
        var labClass = new LabClass(Arrays.asList(
                new Student("staruhina", 3),
                new Student("ivanov", 4),
                new Student("petrov", 5),
                new Student("denisov", 2),
                new Student("sidorova", 1)
        ));
        var labClassUI = new LabClassUI(labClass);
        labClassUI.findStudent("denisov");
        labClassUI.findStudent("");
        labClassUI.findStudent("islambekov");
        labClassUI.printStudents();
        labClassUI.sortStudents();
        labClassUI.printStudents();
    }
}