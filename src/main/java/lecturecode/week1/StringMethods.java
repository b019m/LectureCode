package lecturecode.week1;

public class StringMethods {
    public static void main(String[] args) {

        String secretPassword = "Kittens";// declaring string variable, setting the secretPassword

        // finding the length of the password
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);

        // checking if the password is long enough for security
        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure, good choice");
        } else {
            System.out.println("Consider using a longer password");
        }
        // converting email to lowercase
        String email = "Balha.Mohamed@minneapolis.edu";
        email = email.toLowerCase();
        System.out.println(email);

        // converting class indentifier to uppercase
        String classIdentifier = "Itec 2545";

        // classIdentifier - classIdentifier.toUpperCase();
        String uppercaseIdentifier = classIdentifier.toUpperCase();



    }
}
