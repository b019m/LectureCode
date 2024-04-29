package lecturecode.week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // data- fields - instance variables
    // varaiables should be private
    String name;
    int code;
    private List<String> students;
    int maxStudents;

    ITECCourse(String courseName, int courseCode, int courseMaxStudents) { // constructor- public
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }
    void addStudents(String studentName ) {

        if(students.size() == maxStudents) {
            System.out.println("Course is full, can't add " + studentName);
        }
        students.add(studentName);
    }
     void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
    }

    int getNumberOfStudents() {
        return students.size();

    }

    void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un enrolled from" + name);
        } else {
            System.out.println(studentName +" was not found in " + name);
        }
    }
}
   /*
       constructors
       - use a constructor method when writing the same set-up for many objects of the same type
       - default constructor is always called when an object is created
       whether you wrote a constructor method or not
       Rules for Constructors
       - have same name as the class they construct objects for
       - they don't have  a return type
       - constructors job is to set up and initialize and object
       - optional to have a constructor

      */