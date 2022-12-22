package package_2;

public interface ComparableStudent extends Comparable<Student> {
    String getName();
    void setName(String name) throws EmptyStringException;

    int getAverage();
    void setAverage(int average);

    @Override
    int compareTo(Student o);
}