public class s3_27_variables {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("START: s3_27_variables");

        int age = 35;
        int favNum = 7;
        double favDecimal = 7.5;
        System.out.println("favNum: " +favNum);
        System.out.println("favDecimal " + favDecimal);

        System.out.println("END: s3_27_variables");

        //examples of primitive data types
        boolean isActive = true;
        System.out.println(isActive);
        double a = 6.7;
        double b = 2.1;
        System.out.println("a * b = " + (a * b));

        //non-primitive data types
        String userName = "admin";
        System.out.println("Your username is " + "\"" + userName + "\"; you are " + age + " years old.");
        System.out.println("The length of your username is: " + userName.length());

        long end = System.currentTimeMillis();

        /*
        Challenge: print out your first name and last name separately stored in two String vars.
        Then print out the number of characters in the full name.
         */
        String firstName = "First";
        String lastName = "Last";
        int fullNameLength = firstName.length() + lastName.length();
        System.out.println("The number of characters in your full name is: " + fullNameLength);

        System.out.println("Duration: " + (end-start) + " milliseconds.");
    }
}

/*
1. In Java, the type of a variable can't be changed as long as it's created
2. Although Java is object-oriented, not all variables/constants are objects. These data types are call primitive data types:
    Numbers:
        byte - 1 byte
        short - 2 bytes
        int - 4 bytes
        long - 8 bytes
    Float numbers:
        float - 4 bytes
        double - 8 bytes
    Characters:
        char - 2 bytes
    Boolean:
        boolean - 1 byte, true of false
 */