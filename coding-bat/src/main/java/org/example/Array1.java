package org.example;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        Array1 array1 = new Array1();

//        System.out.println("firstLast6: " + array1.firstLast6(new int[]{1, 2, 6}));
//        System.out.println("firstLast6: " + array1.firstLast6(new int[]{6, 1, 2, 3}));
//        System.out.println("firstLast6: " + array1.firstLast6(new int[]{13, 6, 1, 2, 3}));

//        System.out.println("sameFirstLast: " + array1.sameFirstLast(new int[]{1, 2, 3}));
//        System.out.println("sameFirstLast: " + array1.sameFirstLast(new int[]{1, 2, 3, 1}));
//        System.out.println("sameFirstLast: " + array1.sameFirstLast(new int[]{1, 2, 1}));

//        System.out.println("makePi: " + Arrays.toString(array1.makePi()));

//        System.out.println("commonEnd: " + array1.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
//        System.out.println("commonEnd: " + array1.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
//        System.out.println("commonEnd: " + array1.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));

//        System.out.println("sum3: " + array1.sum3(new int[]{1, 2, 3}));
//        System.out.println("sum3: " + array1.sum3(new int[]{5, 11, 2}));
//        System.out.println("sum3: " + array1.sum3(new int[]{7, 0, 0}));

//        System.out.println("rotateLeft3: " + Arrays.toString(array1.rotateLeft3(new int[]{1, 2, 3})));
//        System.out.println("rotateLeft3: " + Arrays.toString(array1.rotateLeft3(new int[]{5, 11, 9})));
//        System.out.println("rotateLeft3: " + Arrays.toString(array1.rotateLeft3(new int[]{7, 0, 0})));

//        System.out.println("reverse3: " + Arrays.toString(array1.reverse3(new int[]{1, 2, 3})));
//        System.out.println("reverse3: " + Arrays.toString(array1.reverse3(new int[]{5, 11, 9})));
//        System.out.println("reverse3: " + Arrays.toString(array1.reverse3(new int[]{7, 0, 0})));

//        System.out.println("maxEnd3: " + Arrays.toString(array1.maxEnd3(new int[]{1, 2, 3})));
//        System.out.println("maxEnd3: " + Arrays.toString(array1.maxEnd3(new int[]{11, 5, 9})));
//        System.out.println("maxEnd3: " + Arrays.toString(array1.maxEnd3(new int[]{2, 11, 3})));

//        System.out.println("sum2: " + array1.sum2(new int[]{1, 2, 3}));
//        System.out.println("sum2: " + array1.sum2(new int[]{1, 1}));
//        System.out.println("sum2: " + array1.sum2(new int[]{1, 1, 1, 1}));

//        System.out.println("middleWay: " + Arrays.toString(array1.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
//        System.out.println("middleWay: " + Arrays.toString(array1.middleWay(new int[]{7, 7, 7}, new int[]{3, 8,0})));
//        System.out.println("middleWay: " + Arrays.toString(array1.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5})));

//        System.out.println("makeEnds: " + Arrays.toString(array1.makeEnds(new int[]{1, 2, 3})));
//        System.out.println("makeEnds: " + Arrays.toString(array1.makeEnds(new int[]{1, 2, 3, 4})));
//        System.out.println("makeEnds: " + Arrays.toString(array1.makeEnds(new int[]{7, 4, 6, 2})));

        System.out.println("");

        System.out.println("");

        System.out.println("");

        System.out.println("");

        System.out.println("");
        
        System.out.println("");

    }

    /* >>> firstLast6 <<<
        Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
    */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

     /* >>> sameFirstLast <<<
        Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true
    */
     public boolean sameFirstLast(int[] nums) {
         if (nums.length < 1) {
             return false;
         }
         if (nums[0] == (nums[nums.length - 1])) {
             return true;
         }
         return false;
     }

     /* >>> makePi <<<
        Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

        makePi() → [3, 1, 4]
    */
     public int[] makePi() {
         int[] answer = new int[] {3, 1, 4};
         return answer;
     }

     /* >>> commonEnd <<<
        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
    */
     public boolean commonEnd(int[] a, int[] b) {
         if (a[a.length - 1] == b[b.length - 1]) {
             return true;
         } else if (a[0] == b[0]) {
             return true;
         }
         return false;
     }

     /* >>> sum3 <<<
        Given an array of ints length 3, return the sum of all the elements.

        sum3([1, 2, 3]) → 6
        sum3([5, 11, 2]) → 18
        sum3([7, 0, 0]) → 7
    */
     public int sum3(int[] nums) {
         int sum = 0;
         for (int i = 0; i < nums.length; i++) {
             sum += nums[i];
         }
         return sum;
     }


     /* >>> rotateLeft3 <<<
        Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]
    */
     public int[] rotateLeft3(int[] nums) {
         int[] newArray = new int[nums.length];
         for (int i = 1; i < nums.length; i++) {
             newArray[i - 1] = nums[i];
         }
         newArray[newArray.length - 1] = nums[0];
         return newArray;
     }

     /* >>> reverse3 <<<
        Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]
    */
     public int[] reverse3(int[] nums) {
         int[] answer = new int[nums.length];
         for (int i = nums.length - 1; i >= 0; i--) {
             answer[(nums.length - 1) - i] = nums[i];
         }
         return answer;
     }

     /* >>> maxEnd3 <<<
        Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]
    */
     public int[] maxEnd3(int[] nums) {
         int[] answer = new int[nums.length];
         int largest = -1000;

         if (nums[0] >= nums[nums.length -1]) {
             largest = nums[0];
         } else if (nums[0] <= nums[nums.length -1]) {
             largest = nums[nums.length -1];
         }
         for (int i = 0; i < nums.length; i++) {
             answer[i] = largest;
         }

         return answer;
     }


     /* >>> sum2 <<<
        Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

        sum2([1, 2, 3]) → 3
        sum2([1, 1]) → 2
        sum2([1, 1, 1, 1]) → 2
    */
     public int sum2(int[] nums) {
         int sum = 0;
         if (nums.length == 0) {
             return 0;
         }
         if (nums.length == 1) {
             return nums[0];
         }
         for (int i = 0; i < 2; i++) {
             sum += nums[i];
         }
         return sum;
     }

     /* >>> middleWay <<<
        Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

        middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    */
     public int[] middleWay(int[] a, int[] b) {
         int[] answer = new int[2];
         answer[0] = a[a.length / 2];
         answer[1] = b[b.length / 2];
         return answer;
     }

     /* >>> makeEnds <<<
        Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

        makeEnds([1, 2, 3]) → [1, 3]
        makeEnds([1, 2, 3, 4]) → [1, 4]
        makeEnds([7, 4, 6, 2]) → [7, 2]
    */
     public int[] makeEnds(int[] nums) {
         int[] answer = new int[2];
         answer[0]= nums[0];
         answer[1] = nums[nums.length -1];
         return answer;
     }

     /* >>> has23 <<<
        Given an int array length 2, return true if it contains a 2 or a 3.

        has23([2, 5]) → true
        has23([4, 3]) → true
        has23([4, 5]) → false
    */

     /* >>> no23 <<<
        Given an int array length 2, return true if it does not contain a 2 or 3.

        no23([4, 5]) → true
        no23([4, 2]) → false
        no23([3, 5]) → false
    */

     /* >>> makeLast <<<
        Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLast([1, 2]) → [0, 0, 0, 2]
        makeLast([3]) → [0, 3]
    */

     /* >>> double23 <<<
        Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

        double23([2, 2]) → true
        double23([3, 3]) → true
        double23([2, 3]) → false
    */

     /* >>> fix23 <<<
        Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

        fix23([1, 2, 3]) → [1, 2, 0]
        fix23([2, 3, 5]) → [2, 0, 5]
        fix23([1, 2, 1]) → [1, 2, 1]
    */

     /* >>> start1 <<<
        Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

        start1([1, 2, 3], [1, 3]) → 2
        start1([7, 2, 3], [1]) → 1
        start1([1, 2], []) → 1
    */

     /* >>> biggerTwo <<<
        Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

        biggerTwo([1, 2], [3, 4]) → [3, 4]
        biggerTwo([3, 4], [1, 2]) → [3, 4]
        biggerTwo([1, 1], [1, 2]) → [1, 2]
    */

     /* >>> makeMiddle <<<
        Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

        makeMiddle([1, 2, 3, 4]) → [2, 3]
        makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
        makeMiddle([1, 2]) → [1, 2]
    */

     /* >>> plusTwo <<<
        Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

        plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
        plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
        plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
    */

     /* >>> swapEnds <<<
        Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

        swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        swapEnds([1, 2, 3]) → [3, 2, 1]
        swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    */

     /* >>> midThree <<<
        Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        midThree([1, 2, 3]) → [1, 2, 3]
    */

     /* >>> maxTriple <<<
        Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

        maxTriple([1, 2, 3]) → 3
        maxTriple([1, 5, 3]) → 5
        maxTriple([5, 2, 3]) → 5
    */

     /* >>> frontPiece <<<
        Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

        frontPiece([1, 2, 3]) → [1, 2]
        frontPiece([1, 2]) → [1, 2]
        frontPiece([1]) → [1]
    */

     /* >>> unlucky1 <<<
        We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

        unlucky1([1, 3, 4, 5]) → true
        unlucky1([2, 1, 3, 4, 5]) → true
        unlucky1([1, 1, 1]) → false
    */

     /* >>> make2 <<<
        Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

        make2([4, 5], [1, 2, 3]) → [4, 5]
        make2([4], [1, 2, 3]) → [4, 1]
        make2([], [1, 2]) → [1, 2]
    */

     /* >>> front11 <<<
        Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

        front11([1, 2, 3], [7, 9, 8]) → [1, 7]
        front11([1], [2]) → [1, 2]
        front11([1, 7], []) → [1]
    */

}
