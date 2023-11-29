mport java.io.*;

public class StudentFileStream {
    public void printData(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Phone Number: " + student.phoneNum);
        System.out.println("Index Number: " + student.indexNum);
        System.out.println("Record Number: " + student.recordNum);
    }
    public void writeToFile(Student student, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Student object serialized and written to file: " + filename);
            printData(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student readFromFile(String filename) {
        Student student = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            student = (Student) ois.readObject();
            System.out.println("Student object deserialized from file: " + filename);
            printData(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }
}

public class Demo {
    public static void main(String[] args) {
       
        Student student = new Student("John Doe", "123-456-7890", 12345, 789);

        StudentFileStream studentFileStream = new StudentFileStream();

        studentFileStream.writeToFile(student, "student_data.ser");

        Student readStudent = studentFileStream.readFromFile("student_data.ser");
    }
}
