import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Student {
    private String fullName;
    private String yearOfStudy;
    private int id;

    public Student() {
       
    }

    public Student(String fullName, String yearOfStudy, int id) {
        this.fullName = fullName;
        this.yearOfStudy = yearOfStudy;
        this.id = id;
    }

    
}

public class Student {
 public static void main(String[] args) {
     List<String> studentNames = List.of("John Doe", "Jane Smith", "Bob Johnson", "Alice Brown", "Charlie Davis");

     List<Student> students = studentNames.stream()
             .map(name -> createStudent(name))
             .toList();

     
     students.forEach(student -> print(student));

     List<Student> secondYearStudents = students.stream()
             .filter(student -> student.getYearOfStudy().equals("2"))
             .toList();

     
     secondYearStudents.forEach(student -> print(student));
 }

 public static Student createStudent(String fullName) {
     String[] nameParts = fullName.split(" ");
     Random random = new Random();
     int yearOfStudy = random.nextInt(3) + 1; 
     int id = random.nextInt(9000) + 1000; 

     return new Student(fullName, String.valueOf(yearOfStudy), id);
 }

 public static void print(Student student) {
     System.out.println("Student Attributes:");
     System.out.println("Full Name: " + student.getFullName());
     System.out.println("Year of Study: " + student.getYearOfStudy());
     System.out.println("ID: " + student.getId());
     System.out.println("----------------------------");
 }
}
