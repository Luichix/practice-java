import algorithm.Algorithm;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static  void main (String[] args){

        // Params
        int[] arrayInt = new int[5];

        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;

        Algorithm algorithm = new Algorithm();

        System.out.println(Arrays.toString(algorithm.twoSum(arrayInt, 4)));
        System.out.println(Arrays.toString(algorithm.twoSum2(arrayInt, 4)));


        Algorithm.ListNode list1 = new Algorithm.ListNode(8, new Algorithm.ListNode(3, new Algorithm.ListNode(2)) );
        Algorithm.ListNode list2 = new Algorithm.ListNode(9, new Algorithm.ListNode(2, new Algorithm.ListNode(1)) );
        algorithm.addTwoNumbers(list1, list2);





    }
}