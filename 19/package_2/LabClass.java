package package_2;

import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByName(String name) throws EmptyStringException, StudentNotFoundException {
        if (name.equals("")) {
            throw new EmptyStringException("name cannot be an empty string");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("student with name  " + name + " is not found");
    }
}