package array;

import java.lang.reflect.Array;

public class OneDimensionalArray {
    public static void main(String[] args) {
        // Number array
        // declaration and initialization separately
        int[] numbers1 = new int[5];
        for (int i =0; i<numbers1.length;i++) {
            numbers1[i] = i+1;
        }

        for(int number: numbers1) {
            System.out.println(number);
        }


        // delcaration and initialization in same line
        int[] numbers2 = {1,2,3,4,5,};
        for(int number: numbers2) {
            System.out.println(number);
        }

        // String
        String[] days = new String[7];
        days[0] = "sunday";
        days[1] = "monday";
        days[2] = "tuesday";
        days[3] = "wednesday";
        days[4] = "thursday";
        days[5] = "friday";
        days[6] = "saturday";
        System.out.println("--->" + days);
       for(String day: days){
           System.out.println(day);
       }

       // char array
        char[] chars = {'s', 'a', 'd', 'a', 'b'};
        for(char c: chars) {
            System.out.print(c);
        }

        // boolean array

        boolean[] booleans = new boolean[3];
        booleans[0] = true;
        booleans[1] = false;
        booleans[2] = true;
        for(boolean b: booleans){
            System.out.println(b);
        }
    }
}
