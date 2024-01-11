package algorithm;

import java.util.ArrayList;

public class Algorithm {

    public static void main(String[] args){
        // Create an object ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // Add values into ArrayList arr
        arr.add(6);
        arr.add(8);
        arr.add(2);
        arr.add(4);
        arr.add(9);
        arr.add(5);
        arr.add(1);

        // Print in console before sort array
        System.out.println(arr);

        // Sort array with static method Insertion Sort
        insertionSort(arr);

        // Print in console after sort array
        System.out.println(arr);
    }

    public static void insertionSort (ArrayList<Integer> arr){
        /* Run through the object ArrayList arr
        * Define i as counter of element in arr.
        * Value i start with one.
        * Run of index 1 to last element in arr.
        * */
        for (int i = 1; i < arr.size(); i++  ){
            // Define j as a second counter of elements in arr with the same value of i.
            int j = i;

            // Do loop while counter j is not less than 0, and while...
            // ...the element in the current position is less than the before position.
            while((j > 0) && (arr.get(j) < arr.get(j - 1))){
                // Change the booth element positions.
                swap(arr, j);
                // Reduce the value of counter j for compare the all before values in the next while loops.
                j = j-1;
            }
        }
    }

    public static void swap(ArrayList<Integer> arr, int position){
        int value = arr.get(position - 1);
        arr.set(position - 1, arr.get(position));
        arr.set(position, value);
    }
}
