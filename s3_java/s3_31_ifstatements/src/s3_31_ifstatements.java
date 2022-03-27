public class s3_31_ifstatements {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //if statements
        if (2 < 1) {
            System.out.println("2 is greater than 1."); //won't be printed out because the condition is false
        }

        int age = 21;
        if (age > 18) {
            System.out.println("The user is over 18.");
        } else if (age == 18) {
            System.out.println("The user is 18.");
        } else {
            System.out.println("This user is under 18.");
        }

        /*
        Challenge:
        compare two integers and print out the result.
         */
        int a = 2;
        int b = 1;
        if (a > b) {
            System.out.println("a is greater than b.");
        } else if (a == b) {
            System.out.println("a equals b.");
        } else {
            System.out.println("b is greater than a.");
        }

        long end = System.currentTimeMillis();
        System.out.println("Duration: " + (end - start) + " milliseconds.");
    }
}
