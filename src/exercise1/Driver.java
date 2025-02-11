package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();
        studs.add(new Student("Smith", 34));
        studs.add(new Student("Johnson", 21));
        studs.add(new Student("Williams", 67));
        studs.add(new Student("Brown", 53));
        studs.add(new Student("Jones", 48));
        studs.add(new Student("Miller", 36));
        studs.add(new Student("Davis", 44));
        studs.add(new Student("Wilson", 52));
        studs.add(new Student("Anderson", 34));
        studs.add(new Student("Moore", 33));

        // Display original list
        System.out.println("Original list:");
        for (Student s : studs) {
            System.out.println(s);
        }

        // Sort by name (natural order using Comparable)
        Collections.sort(studs);
        System.out.println("\nSorted by name:");
        for (Student s : studs) {
            System.out.println(s);
        }

        // Sort by age using StudentAgeComparator
        Collections.sort(studs, new StudentAgeCompare());
        System.out.println("\nSorted by age:");
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
