public class s3_37_classesobjects {
    /*
    Classes are like a template or blueprint
    with which we can generate objects with common features
     */
    public static void main(String[] args) {

        class User { //names of classes conventionally start with a capital letter unlike variables
            int score; //fields - defining the features of all User objects

            /*also, we can create methods within a class
            for instance, for all instances of User class, when the score reaches 100, the user wins the game
             */
            public boolean hasWon() {
                if (score >= 100) {
                    System.out.println("Congrats, you won!" + " Your score is: " + score +".");
                    return true;
                } else {
                    return false;
                }
            }
        }
        //to access the fields outside off the class definitions
        //we need to create a particular User object (aka an instance of the User class)
        User user_1 = new User();
        //to set a value for a field of an instance
        user_1.score = 10;
        System.out.println("Your score is now: " + user_1.score);
        System.out.println(user_1.hasWon()); //false will be printed out because the boolean value is returned when the method is called
        user_1.score = 101;
        user_1.hasWon();


        /*
        Challenge:
        Create a class of number with an integer value associated
        which could either be positive or negative or 0
        and this class should include an isPositive method
        to return true if the number is positive and false if it’s not
         */
        class Number {
            int number;
            public boolean isPositive() {
                if (number > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        Number myNum = new Number();
        myNum.number = 7;
        if (myNum.isPositive()) {
            System.out.println(myNum.number + " is positive.");
        } else {
            System.out.println(myNum.number + " is not positive");
        }
    }
}
