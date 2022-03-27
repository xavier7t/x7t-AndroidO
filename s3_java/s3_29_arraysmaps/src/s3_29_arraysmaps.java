import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class s3_29_arraysmaps {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //arrays - a series of items
        int[] primeNum = {
                2, 3, 5, 7, 11, 13, 17
        };
        System.out.println(primeNum); //[I@4617c264: the location of the object in the memory
        System.out.println(primeNum[2]); //the third element
        System.out.println(primeNum[0]); //the first element: the index of the first element of an array is 0
        System.out.println("The length of the array is: " + primeNum.length + ".");

        //List - from java.util
        List list = new ArrayList();
        System.out.println(list); //[], because it's empty.
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);//[2,3,5]
        System.out.println(list.get(0));//2, (first element)
        list.remove(2); //removes the element with index 2 (5)
        System.out.println(list); //[2,3]
        //System.out.println(list.get(2)); //IndexOutOfBoundsException

        /*
        Challenge:
            1. create a list of three countries;
            2. print it out in the console;
            3. remove one country and print out the list;
            4. add a new country as the first element and then print out the list.
         */
        List countryList = new ArrayList();
        countryList.add("USA");
        countryList.add("CAN");
        countryList.add("FRA"); //1
        System.out.println(countryList);//2
        countryList.remove(2);//3
        System.out.println(countryList);
        countryList.add(0,"IND");
        System.out.println(countryList.toString());//4


        //Maps (from java.util)
        Map map = new HashMap();
        map.put("Father","Rob");
        map.put("Mother","Jane");
        System.out.println(map); //{Mother=Jane, Father=Rob}
        System.out.println(map.get("Father")); //Rob
        map.remove("Mother");
        System.out.println(map);//{Father=Rob}

        long end = System.currentTimeMillis();
        System.out.println("Duration: " + (end - start) + " milliseconds.");
    }
}
