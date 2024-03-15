package algorithm;

import java.util.HashMap;

public class Algorithm {
    /**
     * Given an array of integers numbs and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Example 1:
     * Input: numbs = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because numbs[0] + numbs[1] == 9, we return [0, 1].
     * Example 2:
     * Input: numbs = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * Input: numbs = [3,3], target = 6
     * Output: [0,1]
     */
    public int[] twoSum (int[] numbers, int target){

        /*
        *   Using a brute force method to solve this problem
        *   1. Run through the list from the second element until the last element
        *   2. Review if the sum of the current element with the others element is equal to target value
        *   3. If the element is equal at target value, save both indexes into the list and return
        *   4. Is not equal at target, continue with the next loop
        *  */

        int[] sum = new int[2];

        System.out.println("Two Sum");
        for(int i = 1; i< numbers.length ;i++){
            for (int j = 0; j < numbers.length; j++){
                if(j != i){
                    if(target == numbers[i] + numbers[j]){
                        sum[0] = i;
                        sum[1] = j;
                        return sum;
                    }
                }

            }


        }

        return sum;

    }

    public int[] twoSum2 (int[] numbers, int target){
        /*
        *   Using a efficient method to solve this problem
        *   1. First review all the values of the list
        *   2. Think in we have 2 values the target value, and the index value.
        *   3. We calculate the value necessary to get a rest value. We need to rest the current value of the target value.
        *   4, With that result search into the indexes if exist the required value
        *   5. If no exists then review the nex value.
        *  */

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sum = new int[2];

        for (int i = 0; i < numbers.length; i++){
            int restValue = target - numbers[i];

            if (map.containsKey(restValue)){
                sum[0] = i;
                sum[1] = map.get(restValue);
                return sum;
            }else {
                map.put( numbers[i], i);
            }

        }


        return sum;
    }


    /*
    * You are given two non-empty linked lists representing two non-negative integers.
    * The digits are stored in reverse order, and each of their nodes contains a single digit.
    * Add the two numbers and return the sum as a linked list.
    * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    * Example 1:
    * Input: l1 = [2,4,3], l2 = [5,6,4]
    * Output: [7,0,8]
    * Explanation: 342 + 465 = 807.
    * Example 2:
    * Input: l1 = [0], l2 = [0]
    * Output: [0]
    * Example 3:
    * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    * Output: [8,9,9,9,0,0,0,1]
    *  */

    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         public ListNode(int val) { this.val = val; }
         public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void getIntFromListNode(ListNode list){
        ListNode testList = new ListNode(1);
        System.out.println(testList);
        System.out.println("getFromListNode");
        System.out.println(list);
    }



    public void addTwoNumbers(ListNode list1, ListNode list2){
            /*
            *   Using a Brute Force Method:
            *   1. First we need extract numbers from the listNode
            *   2. We use a method to reorder the digits into numbers
            *   3. Sum both values
            *   4. Reorder as a Linked List the received value
            * */

        getIntFromListNode(list1);
        getIntFromListNode(list2);

    }

}
