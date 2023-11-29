package serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
    String phoneNum;
    int indexNum;
    transient int recordNum;

    // Default constructor without parameters
    public Student() {
    }

    // Constructor to assign values to all attributes
    public Student(String name, String phoneNum, int indexNum, int recordNum) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.indexNum = indexNum;
        this.recordNum = recordNum;
    }
}
