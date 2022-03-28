import java.util.ArrayList;
import java.util.List;

public class s3_35_loops {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //while loops - to print out numbers from 1 to 10
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Current counter: " + counter);
            counter++; // equivalent to: counter = counter + 1;
        }

        /*
        Challenge: print even numbers from 1 to 10
         */
        counter = 1;
        while (counter <= 10) {
            if (counter % 2 == 0) {
                System.out.println("Current Counter (Even): " + counter);
            }
            counter++;
        }
        //alternative solution
        counter = 1;
        while (counter <=5) {
            System.out.println("Current Counter (Even): " + counter*2);
            counter++;
        }

        //for loops
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i * 2);
        }
        /*
        Challenge: print event numbers between 1 and 10 in descending order. i.e. 10, 8, 6, 4, 2
         */
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println("i: " + i);
            }
        }

        /*
        Challenge: print first 10 multiples of 3 twice with a for and while loop separately
         */
        System.out.println("Solution 1: while loop");
        int count_multiple_for = 1;
        while (count_multiple_for <= 10) {
            System.out.println(count_multiple_for * 3);
            count_multiple_for++;
        }
        System.out.println("Solution 2: for loop");
        for (int i = 0; i < 10; i++) { //shortcut: 10.fori
            System.out.println((i + 1) * 3); //i + 1 because the default index starts from 0
        }

        /*
        Challenge: print first 10 triangular numbers
        A triangular number or triangle number counts objects arranged in an equilateral triangle.
        i.e.
            1 - 1
            3 - 1+2
            6 - 1+2+3
            10 - 1+2+3+4
            ...
         */
        for (int i = 1; i < 11; i++) {
            int sum = 0;
            for (int j = 1; j < i+1; j++) {
                sum += j;
            }
            System.out.println(sum);
        }

        //looping through (iterate) items within an array
        String[] myNameList = {
                "Alice",
                "Bob",
                "Cris",
                "David",
                "Eva"
        };
        for (String name : myNameList
             ) {
            System.out.println("Hello, " + name + "!");
        }
        List<String> myFamNameList = new ArrayList<String>();
        myFamNameList.add("Alex");
        myFamNameList.add("Brown");
        myFamNameList.add("Chelsea");
        myFamNameList.add("Drew");
        for (String name: myFamNameList
             ) {
            System.out.println("Hey, " + name + "!");
        }


        long end = System.currentTimeMillis();
        System.out.println("Duration: " + (end - start) + " milliseconds.");
    }
}
