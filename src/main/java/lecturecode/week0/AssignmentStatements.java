package lecturecode.week0;


import static lecturecode.week0.Input.InputUtils.intInput;
import static lecturecode.week0.Input.InputUtils.stringInput;

public class AssignmentStatements {
    public static void main(String[] args) {

        // Look at the syntax for the lines
        // statement is usually a line of code

        // Basic statement - instructs you to do something
        System.out.println("Hello world!");

        // these are variable declaration where the variable is created and assigned
        String programmingLanguage = "Java";
        int classCode = 2545; // assign value to classCode


        // Basic Statement
        System.out.println(programmingLanguage);

        // These variables already exist, so the type (e.g String, int) is not included
        programmingLanguage = "C#";
        classCode = 2505; // classCode reassigned

        // We've also seen "control statements" like if-else and loops
        // these are for deciding which line of code you need to execute
        if (classCode >= 2000) { // if control system
            System.out.println("This is a second year class");
        }

        for (int x = 0; x < 10; x++) { // loop control statement
            System.out.println(x); // basic statement
        }

        String school = "MCTC";
        String department = stringInput("Enter the department:  ");
        int englishClassCode = 1100;
        int credits = intInput("Enter the number of credits:  ");
        school = "Minneapolis College";
        System.out.println("School = " + school + ", Department =" + department);
    }

    public static void sayHi() {
        System.out.println("HI !!!!");
    }


    }


