package lecturecode.week7;

import org.w3c.dom.ls.LSOutput;

public class ITECCourseManager {
    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        // add some students
        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Bill");
        maintenanceCourse.addStudents("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communication", 1425, 30);

        // add some students
        datacomCourse.addStudents("Dave");
        datacomCourse.addStudents("Ed");
        datacomCourse.addStudents("Flora");

        datacomCourse.writeCourseInfo();


        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
        softwareDevelopmentProjects.addStudents("Gus");
        softwareDevelopmentProjects.addStudents("Harry");
        softwareDevelopmentProjects.addStudents("Izzy");
        softwareDevelopmentProjects.addStudents("Jake");

        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The " + softwareDevelopmentProjects.name + "class has" + totalEnrolled + " students");
        System.out.println("ITEC" + softwareDevelopmentProjects.code+ " " + softwareDevelopmentProjects.name);

        softwareDevelopmentProjects.maxStudents = 30;
        softwareDevelopmentProjects.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course ", 1234,3);
        smallCourse.addStudents("Kirby");
        smallCourse.addStudents("Liam");
        smallCourse.addStudents("Miriam");
        smallCourse.addStudents("Nita");

        smallCourse.writeCourseInfo();

    }
}
