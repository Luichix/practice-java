package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
        *   Using an efficient method to solve this problem
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

    public static String getIntFromListNode(ListNode list){

        /*
        *   According to the structured exists into ListNode.
        *   1. We can use a recursive function to extract the value as a String
        *   2. Create the principal conditional of the function, in this case if next property not exist return val
        *   3. In case this exists, return recursive function.
        *   4. Concatenate the result value with the principal String
        *   5. Transform the String with the number value in Int
        *
        *  */

        if(list.next == null){
            return String.valueOf(list.val);
        } else {
            return getIntFromListNode(list.next).concat(String.valueOf(list.val)) ;
        }
    }

    public static ListNode createListNode (String number ){

        if(number.length() == 1){
            return new ListNode(Integer.parseInt(number));
        } else {
            return new ListNode(Integer.parseInt(number.substring(number.length()-1)), createListNode(number.substring(0, number.length() - 1)));
        }
    }

    public static String sumArray(String[] arr1, String[] arr2){
        /*
         *   Using a Brute Force Method:
         *   1. Know what is the size of two Arrays
         *   2. Revert values of arrays to help the sum with indexes values
         *   3. Sum the values and save into new array
         * */

        int len1 = arr1.length;
        int len2 = arr2.length;

        List<String> stringArr1 = Arrays.asList(arr1).reversed();
        List<String> stringArr2 = Arrays.asList(arr2).reversed();

        ArrayList<String> stringArr = new ArrayList<>();

        int max = Math.max(len1, len2);
        int min = Math.min(len1, len2);

        for (int i = 0; i < max; i++ ){
            int num1 = 0;
            int num2 = 0;


            if(i < min) {
                num1 = Integer.parseInt(stringArr1.get(i));
                num2 = Integer.parseInt(stringArr2.get(i));
            } else {
                if(len1 > len2){
                    num1 = Integer.parseInt(stringArr1.get(i));
                } else {
                    num2 = Integer.parseInt(stringArr2.get(i));
                }

            }

            int num = num1 + num2;
            stringArr.add(String.valueOf(num));
        }

        System.out.println("stringArr");
        System.out.println(stringArr);
        int sumRest = 0;

        for (int i = 0; i < stringArr.size();i++){
            int valueList = Integer.parseInt(stringArr.get(i));
            int sumValueList = sumRest + valueList;
            System.out.println("sumValueList");
            System.out.println(sumRest);
            String[] listNum = String.valueOf(sumValueList).split("");

            if(listNum.length > 1){
                if(i == stringArr.size()-1){
                    stringArr.set(i, listNum[0].concat(listNum[1]));

                } else {
                    sumRest = Integer.parseInt(listNum[0]);
                    stringArr.set(i, listNum[1]);

                }
            } else {
                sumRest=0;
                stringArr.set(i, String.valueOf(sumValueList));
            }
        }

        return String.join("", stringArr.reversed());
    }


    public void addTwoNumbers(ListNode list1, ListNode list2){
            /*
            *   Using a Brute Force Method:
            *   1. First we need extract numbers from the listNode
            *   2. We use a method to reorder the digits into numbers
            *   3. Sum both values
            *   4. Reorder as a Linked List the received value
            * */

        System.out.println("getFromListNode");

        String[] listNumber1 = getIntFromListNode(list1).split("");
        String[] listNumber2 = getIntFromListNode(list2).split("");

        System.out.println(Arrays.toString(listNumber1));
        System.out.println(Arrays.toString(listNumber2));

        String result1 = String.join("", listNumber1);
        String result2 = String.join("", listNumber2);

        String result = String.valueOf(Integer.parseInt(result1) + Integer.parseInt(result2));
        System.out.println(result);

        ListNode newList = createListNode(result);
        System.out.println(newList);


        String newArrayList = sumArray(listNumber1, listNumber2);
        System.out.println(newArrayList);
        ListNode newListArr = createListNode(newArrayList);
        System.out.println(newListArr);



    }


    public ListNode sumTwoNumbers2(ListNode l1, ListNode l2){
        // Create a placeholder ListNode
        ListNode dummyNode = new ListNode();
        ListNode resNode = dummyNode;

        int carry = 0, total = 0;

        while(l1 != null || l2 != null || carry >0){
            total = carry;

            if(l1.next != null){
                total += l1.val;
                l1 = l1.next;
            }

            if(l2.next != null){
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;

            dummyNode = new ListNode(num);
            dummyNode.next = new ListNode();
        }

        return resNode;

    }
}
