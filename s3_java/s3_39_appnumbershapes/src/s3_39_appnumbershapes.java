public class s3_39_appnumbershapes {
    public static void main(String[] args) {
        /*
        with the concept of OOP, create a small program to tell
        if a number is:
            -a triangular number, 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4) ...
            -a square number, 1, 4, 9, 25 ...
            -neither, or
            -both
         */
        class Number {
            int number;

            public boolean isTriangular() {
                /*
                generate ascending triangular numbers until the generated one is higher or equals the value of the number field
                 */
                int counter = 1;
                int triangular = 1;
                while (triangular < number) {
                    counter++;
                    triangular = triangular + counter; // 1+2, 3+3, 6+4, 10+5...
                }
                if (triangular == number) {
                    return true;
                } else {
                    return  false;
                }
            }

            public boolean isSquare() {
                /*
                generate ascending square numbers until the generated one is higher or equals the value of the number field
                 */
                int counter = 1;
                int square = 1;
                while (square < number) {
                    counter++;
                    square = counter * counter;
                }
                if (square == number) {
                    return true;
                } else {
                    return false;
                }
            }
        }
//        Number myNum = new Number();
//        myNum.number = 1;
//        System.out.println(myNum.isSquare());
    }
}
