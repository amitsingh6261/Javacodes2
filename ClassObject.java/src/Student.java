class Student {
    String collegeName;
    String studentName;
    String course;

    // Initializer Block
    {
        collegeName = "ABC College";
        System.out.println("Admission Process Started");
    }

    // Default Constructor
    Student() {
        this("Unknown");
    }

    // Constructor with student name
    Student(String studentName) {
        this(studentName, "Not Assigned");
    }

    // Constructor with student name and course
    Student(String studentName, String course) {
        this.studentName = studentName;
        this.course = course;

        System.out.println("College: " + collegeName);
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + course);
    }
}

public class Student{
    public static void main(String[] args) {
        Student s1 = new Student("Amit", "MCA");
    }
}