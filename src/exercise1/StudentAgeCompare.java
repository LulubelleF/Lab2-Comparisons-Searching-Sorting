package exercise1;

import java.util.Comparator;

public class StudentAgeCompare implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int ageComparison = Integer.compare(s1.getAge(), s2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        return s1.getName().compareTo(s2.getName()); 
    }
}
