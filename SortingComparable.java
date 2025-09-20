import java.util.*;


//ek interface hai jo object ki natural ordering define karta hai.
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Natural order: by roll number
    @Override
    public int compareTo(Student other) {  //method decide karta hai ki current object dusre object se bada hai, chhota hai ya equal hai.
        
        return this.rollNo - other.rollNo; // ascending order
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class SortingComparable{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Ravi"));
        students.add(new Student(1, "Aman"));
        students.add(new Student(2, "Neha"));

        Collections.sort(students); // uses compareTo
        System.out.println(students);
    }
}
