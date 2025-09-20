

//bhi ek interface hai, lekin alag object ke liye custom sorting logic define karta hai.
//Isko tab use karte ho jab tumhe multiple sorting criteria chahiye (for example: student ko marks ke hisaab se sort karo ya name ke hisaab se).

import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {// constructor
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() { // to string() override → jab Student object print hota hai to ye human readable format me show ho.
        return rollNo + " - " + name + " (" + marks + ")";
    }
}

public class SortingComparator{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Ravi", 85));
        students.add(new Student(1, "Aman", 92));
        students.add(new Student(2, "Neha", 78));

        // Custom sort by marks (descending)
        Comparator<Student> byMarks = (s1, s2) -> s2.marks - s1.marks;

        // Custom sort by name (alphabetical)
        Comparator<Student> byName = (s1, s2) -> s1.name.compareTo(s2.name);

        // Sort by marks
        Collections.sort(students, byMarks);
        System.out.println("Sorted by Marks: " + students);

        // Sort by name
        Collections.sort(students, byName);
        System.out.println("Sorted by Name: " + students);
    }
}
