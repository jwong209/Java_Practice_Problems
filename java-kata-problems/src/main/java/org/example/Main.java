package org.example;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//------------Practice problems------------
//        System.out.println("helloName: " + helloName(("Bob")));

//        System.out.println("has23: " + has23(new int[]{2, 5}));
//        System.out.println("has23: " + has23(new int[]{4, 3}));
//        System.out.println("has23: " + has23(new int[]{4, 5}));

//        System.out.println("no14: " + no14(new int[]{7, 2, 3}));
//        System.out.println("no14: " + no14(new int[]{1, 2, 3, 4}));
//        System.out.println("no14: " + no14(new int[]{2, 3, 4}));

//        System.out.println("no23: " + no23(new int[]{4, 5}));
//        System.out.println("no23: " + no23(new int[]{4, 2}));
//        System.out.println("no23: " + no23(new int[]{3, 5}));

//        System.out.println("only14: " + only14(new int[]{1, 4, 1, 4}));
//        System.out.println("only14: " + only14(new int[]{1, 4, 2, 4}));
//        System.out.println("only14: " + only14(new int[]{1, 1}));

//        System.out.println("greenTicket: " + greenTicket(1, 2, 3));
//        System.out.println("greenTicket: " + greenTicket(2, 2, 2));
//        System.out.println("greenTicket: " + greenTicket(1, 2, 1));

//        System.out.println("oddOnly: " + oddOnly(new int[]{112, 201, 774, 92, 9, 83, 41872}));
//        System.out.println("oddOnly: " + oddOnly(new int[]{1143, 555, 7, 1772, 9953, 643}));
//        System.out.println("oddOnly: " + oddOnly(new int[]{734, 233, 782, 811, 3, 9999}));

//        System.out.println("endsLy: " + endsLy("oddly"));
//        System.out.println("endsLy: " + endsLy("y"));
//        System.out.println("endsLy: " + endsLy("oddy"));

//        System.out.println("start1: " + start1(new int[]{1, 2, 3}, new int[]{1, 3}));
//        System.out.println("start1: " + start1(new int[]{7, 2, 3}, new int[]{1}));
//        System.out.println("start1: " + start1(new int[]{2, 1}, new int[]{}));

//        System.out.println("has12: " + has12(new int[]{1, 3, 2}));
//        System.out.println("has12: " + has12(new int[]{3, 2, 1}));
//        System.out.println("has12: " + has12(new int[]{3, 1, 4, 5, 2}));

//        System.out.println("doubleX: " + doubleX("axxbb"));
//        System.out.println("doubleX: " + doubleX("axaxax"));
//        System.out.println("doubleX: " + doubleX("xxxxx"));

        System.out.println("biggetTwo: " + Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println("biggetTwo: " + Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println("biggetTwo: " + Arrays.toString(biggerTwo(new int[]{3, 1}, new int[]{2, 2})));

//        System.out.println("lessBy10: " + lessBy10(1, 7, 11));
//        System.out.println("lessBy10: " + lessBy10(1, 7, 10));
//        System.out.println("lessBy10: " + lessBy10(11, 1, 7));

//        System.out.println("extraEnd: " + extraEnd("Hello"));
//        System.out.println("extraEnd: " + extraEnd("ab"));
//        System.out.println("extraEnd: " + extraEnd("Hi"));

//        System.out.println("firstHalf: " + firstHalf("WooHoo"));
//        System.out.println("firstHalf: " + firstHalf("HelloThere"));
//        System.out.println("firstHalf: " + firstHalf("abcdef"));

//        System.out.println("arrayCount9: " + arrayCount9(new int[]{1, 2, 9}));
//        System.out.println("arrayCount9: " + arrayCount9(new int[]{1, 9, 9}));
//        System.out.println("arrayCount9: " + arrayCount9(new int[]{1, 9, 9, 3, 9}));

//        System.out.println("firstTwo: " + firstTwo("Hello"));
//        System.out.println("firstTwo: " + firstTwo("abcdefg"));
//        System.out.println("firstTwo: " + firstTwo("ab"));

//        System.out.println("makeLast: " + Arrays.toString(makeLast(new int[]{4, 5, 6})));
//        System.out.println("makeLast: " + Arrays.toString(makeLast(new int[]{0, 0, 0, 2})));
//        System.out.println("makeLast: " + Arrays.toString(makeLast(new int[]{0, 3})));

//        System.out.println("makeEnds: " + Arrays.toString(makeEnds(new int[]{1, 2, 3})));
//        System.out.println("makeEnds: " + Arrays.toString(makeEnds(new int[]{1, 2, 3, 4})));
//        System.out.println("makeEnds: " + Arrays.toString(makeEnds(new int[]{7, 4, 6, 2})));

//        System.out.println("double23: " + double23(new int[]{2, 2}));
//        System.out.println("double23: " + double23(new int[]{3, 3}));
//        System.out.println("double23: " + double23(new int[]{2, 3}));

//        System.out.println("fix23: " + Arrays.toString(fix23(new int[]{1, 2, 0})));
//        System.out.println("fix23: " + Arrays.toString(fix23(new int[]{2, 0, 5})));
//        System.out.println("fix23: " + Arrays.toString(fix23(new int[]{1, 2, 1})));

//        System.out.println("fizzArray: " + Arrays.toString(fizzArray(4)));
//        System.out.println("fizzArray: " + Arrays.toString(fizzArray(1)));
//        System.out.println("fizzArray: " + Arrays.toString(fizzArray(0)));

//        System.out.println("noTriples: " + noTriples(new int[]{1, 1, 2, 2, 1}));
//        System.out.println("noTriples: " + noTriples(new int[]{1, 1, 2, 2, 2, 1}));
//        System.out.println("noTriples: " + noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));

//        System.out.println("swapEnds: " + Arrays.toString(swapEnds(new int[]{1, 2, 3, 4})));
//        System.out.println("swapEnds: " + Arrays.toString(swapEnds(new int[]{1, 2})));
//        System.out.println("swapEnds: " + Arrays.toString(swapEnds(new int[]{8})));

//        System.out.println("evenlySpace: " + evenlySpaced(2, 4, 6));
//        System.out.println("evenlySpace: " + evenlySpaced(4, 6, 2));
//        System.out.println("evenlySpace: " + evenlySpaced(4, 6, 3));

//        System.out.println("arrayFront9: " + arrayFront9(new int[]{1, 2, 9, 3, 4}));
//        System.out.println("arrayFront9: " + arrayFront9(new int[]{1, 2, 3, 4, 9}));
//        System.out.println("arrayFront9: " + arrayFront9(new int[]{9, 0}));

//        System.out.println("foundIntTwice: " + foundIntTwice(Arrays.asList(5, 7, 9, 5, 11), 5));
//        System.out.println("foundIntTwice: " + foundIntTwice(Arrays.asList(6, 8, 10, 11, 13), 8));
//        System.out.println("foundIntTwice: " + foundIntTwice(Arrays.asList(9, 23, 44, 2, 88, 44), 44));

//        System.out.println("comboString: " + comboString("Hello", "hi"));
//        System.out.println("comboString: " + comboString("hi", "Hello"));
//        System.out.println("comboString: " + comboString("aaa", "b"));

//        System.out.println("countXX: " + countXX("abcxx"));
//        System.out.println("countXX: " + countXX("xxx"));
//        System.out.println("countXX: " + countXX("xxxx"));

//        System.out.println("array123: " + array123(new int[]{1, 1, 2, 3, 1}));
//        System.out.println("array123: " + array123(new int[]{1, 1, 2, 4, 3}));
//        System.out.println("array123: " + array123(new int[]{1, 1, 2, 1, 2, 3}));

        System.out.println("more14: " + more14(new int[]{1, 4, 1}));
        System.out.println("more14: " + more14(new int[]{1, 4, 1, 4}));
        System.out.println("more14: " + more14(new int[]{1, 1}));

    }

    /* ---HELLO NAME---
    Create a method called helloName that takes in a string called name. Return a string containing a greeting of the form "Hello ____!" replacing the blank with name.

    For example:

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
     */
    public static String helloName(String name) {
        return "Hello" + name + "!";
    }

    /* ---Has 2 3---
    Create a method called has23 that takes in an integer array nums of length 2. Return true if it contains a 2 or a 3. Otherwise return false.

    For example:

    has23({2, 5}) → true
    has23({4, 3}) → true
    has23({4, 5}) → false
    */
    public static boolean has23(int[] nums) {
//        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
//            return true;
//        }

//        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;

//        for (int num : nums) {
//            if (num == 2 || num == 3) {
//                return true;
//            }
//        }
//        return false;

        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);

    }

    /* ---No 14---
    Create a method called no14 that takes in an integer array nums. Return true if nums contains no 1s and no 4s. Otherwise return false.

    For example:

    no14({7, 2, 3}) → true
    no14({1, 2, 3, 4}) → false
    no14({2, 3, 4}) → false
     */
    public static boolean no14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                return false;
            }
        }
        return true;
    }

    /* ---No 2 3---
    Create a method called no23 that takes in an array of 2 integers called nums. Return true if nums doesn't contain a 2 or 3. Otherwise return false.

    For example:

    no23({4, 5}) → true
    no23({4, 2}) → false
    no23({3, 5}) → false
     */
    public static boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return false;
        }
        return true;
    }

    /* ---Only 14---
    Create a method called only14 that takes in an integer array nums. Return true if every element of nums is a 1 or a 4. Otherwise return false.

    For example:

    only14({1, 4, 1, 4}) → true
    only14({1, 4, 2, 4}) → false
    only14({1, 1}) → true
     */
    public static boolean only14(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1 || nums[i] == 4) {
//                continue;
//            }
//            return false;
//        }
//        return true;

        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    /* ---Green Ticket---
    Create a method called greenTicket that takes in three integers, a, b, and c. You have a green lottery ticket, with a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

    For example:

    greenTicket(1, 2, 3) → 0
    greenTicket(2, 2, 2) → 20
    greenTicket(1, 2, 1) → 10
     */
    public static int greenTicket(int a, int b, int c) {
//        if (a != b && a != c && b != c) {
//            return 0;
//        } else if (a == b && b == c && c == a){
//            return 20;
//        } else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
//            return 10;
//        }
//        return 0;

//        if (a == b && b == c) {
//            return 20; // All are same
//        } else if (a == b || a == c || b == c) {
//            return 10; // 2 numbers are the same
//        } else {
//            return 0; // All different
//        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(a);
        uniqueNumbers.add(b);
        uniqueNumbers.add(c);

        if (uniqueNumbers.size() == 1) {
            return 20; // All numbers are the same
        } else if (uniqueNumbers.size() == 2) {
            return 10; // Two numbers are the same
        } else {
            return 0; // All numbers are different
        }

    }

    /* ---Odd Only---
    Create a method called oddOnly that takes in an integer array called nums. Return a List of integers containing just the odd values in nums.

    For example:

    oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) →  [201, 9, 83]
    oddOnly( {1143, 555, 7, 1772, 9953, 643} ) →  [1143, 555, 7, 9953, 643]
    oddOnly( {734, 233, 782, 811, 3, 9999} ) →  [233, 811, 3, 9999]
     */
    public static List<Integer> oddOnly(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                answer.add(num);
            }
        }
        return answer;
    }

    /* ---Ends Ly---
    Create a method called endsLy that takes in a string called str. Return true if str ends with "ly" -- otherwise return false.

    For example:

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
     */
    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    /* ---Start 1---
    Create a method called start1 that takes in two integer arrays a and b. Return how many of the arrays have 1 as their first element.

    For example:

    start1({1, 2, 3}, {1, 3}) → 2
    start1({7, 2, 3}, {1}) → 1
    start1({2, 1}, {}) → 0
     */
    public static int start1(int[] a, int[] b) {
//        int aCount = 0;
//        int bCount = 0;
//        //if a[] is empty
//        if (a.length == 0) {
//            if (b[0] == 1) {
//                return 1;
//            }
//        }
//        //if b[] is empty
//        if (b.length == 0) {
//            if (a[0] == 1) {
//                return 1;
//            }
//        }
//        if (a.length > 0 && b.length > 0) {
//            if (a[0] == 1) {
//                aCount++;
//            }
//            if (b[0] == 1) {
//                bCount++;
//            }
//        }
//        return aCount + bCount;

        int count = 0;
        // Check array a
        if (a != null && a.length > 0 && a[0] == 1) {
            count++;
        }
        // Check array b
        if (b != null && b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    /* ---Has 1 2---
    Create a method called has12 that takes in an integer array nums. Return true if there is a 1 in nums and a 2 somewhere later in nums. Otherwise return false.

    For example:

    has12({1, 3, 2}) → true
    has12({3, 2, 1}) → false
    has12({3, 1, 4, 5, 2}) → true
     */
    public static boolean has12(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] == 2) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;

        if (nums == null || nums.length == 0) {
            return false;
        }

        boolean seenOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                seenOne = true;
            } else if (seenOne && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    /* ---Double X---
    Create a method called doubleX that takes in a string called str. Return true if the first instance of "x" in str is immediately followed by another "x" -- otherwise return false.

    For example:

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    public static boolean doubleX(String str) {
//        int index = str.indexOf("x");
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i == index && str.charAt(i + 1) == 'x') {
//                return true;
//            }
//        }
//        return false;
        int indexFirstX = str.indexOf("x");
        return str.charAt(indexFirstX + 1) == 'x';
    }

    /* ---Bigger Two---
    Create a method called biggerTwo that takes in two integer arrays a and b, each of length 2. Return the array which has the largest sum. In the event of a tie, return a.

    For example:

    biggerTwo({1, 2}, {3, 4}) → {3, 4}
    biggerTwo({3, 4}, {1, 2}) → {3, 4}
    biggerTwo({3, 1}, {2, 2}) → {3, 1}
     */
    public static int[] biggerTwo(int[] a, int[] b) {
//        int sumOfA = a[0] + a[1];
//        int sumOfB = b[0] + b[1];
//
//        if (sumOfA > sumOfB) {
//            System.out.println(Arrays.toString(a));
//            return a;
//        } else if (sumOfA == sumOfB) {
//            System.out.println(Arrays.toString(a));
//            return a;
//        } else {
//            System.out.println(Arrays.toString(b));
//            return b;
//        }

        if ((a[0] + a[1]) > (b[0] + b[1])) {
            return a;
        } else if ((a[0] + a[1]) < (b[0] + b[1])) {
            return b;
        } else {
            return a;
        }
    }

    /* ---Less By 10---
    Create a method called lessBy10 that takes in three integers, a, b, and c. Return true if a, b, or c is 10 or more less than one of the other values.

    For example:

    lessBy10(1, 7, 11) → true
    lessBy10(1, 7, 10) → false
    lessBy10(11, 1, 7) → true
     */
    public static boolean lessBy10(int a, int b, int c) {
//        if (Math.abs(a-b) >= 10 || Math.abs(a-c) >= 10 || Math.abs(b-c) >= 10){
//            return true;
//        }
//        return false;

        return Math.abs(a - b) >= 10 ||
                Math.abs(a - c) >= 10 ||
                Math.abs(b - c) >= 10;
    }

    /* ---Extra End---
    Create a method called extraEnd that takes in a string called str. Return a new string made of 3 copies of the last 2 characters of str. You can assume the length of str is at least 2.

    For example:

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */
    public static String extraEnd(String str) {
//        if (str.length() == 2) {
//            return str + str + str;
//        }
//        String endSubstring = str.substring(str.length() - 2);
//        return endSubstring + endSubstring + endSubstring;

//        String lastTwo = str.substring(str.length() - 2);
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < 3; i++) {
//            result.append(lastTwo);
//        }
//        return result.toString();

        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    /* ---First Half---
    Create a method called firstHalf that takes in a string called str. Return the first half of str. You can assume str is of even length.

    For example:

    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc
     */
    public static String firstHalf(String str) {
        String firstHalfString = str.substring(0, (str.length() / 2));
        return firstHalfString;
    }

    /* ---Array Count 9---
    Create a method called arrayCount9 that takes in an integer array called nums. Return the number of 9s in nums.

    For example:

    arrayCount9({1, 2, 9}) → 1
    arrayCount9({1, 9, 9}) → 2
    arrayCount9({1, 9, 9, 3, 9}) → 3
     */
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        return count;
    }

    /* ---First Two---
    Create a method called firstTwo that takes in a string called str. Return a string made of the first two characters of str. If str is shorter than length 2, return whatever there is.

    For example:

    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
     */
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String firstTwoLetters = str.substring(0, 2);
        return firstTwoLetters;
    }

    /* ---Make Last---
    Create a method called makeLast that takes in an integer array nums. Return a new array with double the length of nums where its last element is the same as nums, and all the other elements are 0. You can assume nums is length 1 or more.

    For example:

    makeLast({4, 5, 6}) → {0, 0, 0, 0, 0, 6}
    makeLast({1, 2}) → {0, 0, 0, 2}
    makeLast({3}) → {0, 3}
     */
    public static int[] makeLast(int[] nums) {
//        int[] answer = new int[2 * nums.length];
//        for (int i = 0; i < answer.length - 1; i++) {
//            answer[i] = 0;
//        }
//        answer[answer.length - 1] = nums[nums.length - 1];
//        return answer;

        int[] answer = new int[2 * nums.length];
        answer[answer.length - 1] = nums[nums.length - 1];
        return answer;
    }

    /* ---Make Ends---
    Create a method called makeEnds that takes in an integer array nums. Return a new array length 2 containing the first and last elements from nums. You can assume nums is length 1 or more.

    For example:

    makeEnds({1, 2, 3}) → {1, 3}
    makeEnds({1, 2, 3, 4}) → {1, 4}
    makeEnds({7, 4, 6, 2}) → {7, 2}
     */
    public static int[] makeEnds(int[] nums) {
        int[] answer = new int[2];
        answer[0] = nums[0];
        answer[1] = nums[nums.length - 1];
        return answer;
    }

    /* ---Double 2 3---
    Create a method called double23 that takes in an integer array called nums. Return true if nums contains 2 twice or 3 twice. You can assume the length of nums is 0, 1, or 2.

    For example:

    double23({2, 2}) → true
    double23({3, 3}) → true
    double23({2, 3}) → false
     */
    public static boolean double23(int[] nums) {
//        if (nums.length == 0 || nums.length == 1) {
//            return false;
//        }
//        if (nums[0] == nums[1]) {
//            return true;
//        }
//        return false;

        if (nums.length < 2) {
            return false;
        }
        int first = nums[0];
        int second = nums[1];
        return ((first == 2 && second == 2) || (first == 3 && second == 3));
    }

    /* ---Fix 2 3---
    Create a method called fix23 that takes in an array called nums that contains 3 integers. If there is a 2 in the array immediately followed by a 3, change the 3 to 0. Return the changed array.

    For example:

    fix23({1, 2, 3}) → {1, 2, 0}
    fix23({2, 3, 5}) → {2, 0, 5}
    fix23({1, 2, 1}) → {1, 2, 1}
     */
    public static int[] fix23(int[] nums) {
//        int[] answer = new int[nums.length];
//        for (int i = 1; i < nums.length; i++) {
//            answer[0] = nums[0];
//            if (nums[i] == 3 && nums[i - 1] == 2) {
//                answer[i] = 0;
//            } else {
//                answer[i] = nums[i];
//            }
//        }
//        return answer;

        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    /* ---Fizz Array---
    Create a method called fizzArray that takes in an integer n. Return an array of length n, containing the integers 0, 1, 2, ... n-1. n may be 0, in which case return a length 0 array.

    For example:

    fizzArray(4) → {0, 1, 2, 3}
    fizzArray(1) → {0}
    fizzArray(0) → {}
     */
    public static int[] fizzArray(int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = i;
        }
        return answer;
    }

    /* ---No Triples---
    Create a method called noTriples that takes in an integer array nums. A triple is a value appearing 3 times in a row. Return true if there are no triples in nums. Otherwise return false.

    For example:

    noTriples({1, 1, 2, 2, 1}) → true
    noTriples({1, 1, 2, 2, 2, 1}) → false
    noTriples({1, 1, 1, 2, 2, 2, 1}) → false
     */
    public static boolean noTriples(int[] nums) {
//        for (int i = 0; i < nums.length -3; i++) {
//            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
//                return false;
//            }
//        }
//        return true;

        int length = nums.length;
        // Handle edge case: arrays with less than 3 elements
        if (length < 3) {
            return true;
        }
        for (int i = 0; i <= length - 3; i++) {
            // Check if current element and next two elements are the same
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                return false;
            }
        }
        return true;
    }

    /* ---Swap Ends---
    Create a method called swapEnds that takes in an integer array nums. Swap the first and last elements in nums. Return the modified array. You can assume the length of nums is at least 1.

    For example:

    swapEnds({1, 2, 3, 4}) → {4, 2, 3, 1}
    swapEnds({1, 2}) → {2, 1}
    swapEnds({8}) → {8}
     */
    public static int[] swapEnds(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = nums[nums.length - 1];
        answer[answer.length - 1] = nums[0];
        for (int i = 1; i < nums.length -1; i++) {
            answer[i] = nums[i];
        }
        return answer;
    }

    /* ---Evenly Space---
    Create a method called evenlySpaced that takes in three integers, a, b, and c. Return true if a, b, and c are evenly spaced, so the difference between the lowest value and the middle value is the same as the difference between the middle value and the highest value. Otherwise, return false.

    For example:

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
     */
    public static boolean evenlySpaced(int a, int b, int c) {
        int lowest = 1000;
        int middle = 0;
        int highest = -1000;

        //assigning for a
        if (a < b && a < c) {
            lowest = a;
        } else if (a > b && a > c) {
            highest = a;
        } else {
            middle = a;
        }

        //assigning for b
        if (b < a && b < c) {
            lowest = b;
        } else if (b > a && b > c) {
            highest = b;
        } else {
            middle = b;
        }

        //assigning for c
        if (c < a && c < b) {
            lowest = c;
        } else if (c > a && c > a) {
            highest = c;
        } else {
            middle = c;
        }

        return (lowest + 2 == middle) && (middle + 2 == highest);
    }

    /* ---Array Front 9---
    Create a method called arrayFront9 that takes in an integer array called nums. Return true if one of the first 4 elements in nums is a 9. The length of nums may be less than 4.

    For example:

    arrayFront9({1, 2, 9, 3, 4}) → true
    arrayFront9({1, 2, 3, 4, 9}) → false
    arrayFront9({9, 0}) → true
     */
    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /* ---Found Int Twice---
    Create a method called foundIntTwice that takes in a List of integers called nums and an integer value. Return true if value appears two or more times in nums. Otherwise return false.

    For example:

    foundIntTwice( [5, 7, 9, 5, 11], 5 ) → true
    foundIntTwice( [6, 8, 10, 11, 13], 8 ) → false
    foundIntTwice( [9, 23, 44, 2, 88, 44], 44 ) → true
     */
    public static boolean foundIntTwice(List<Integer> nums, int value) {
        int count = 0;
        for (Integer num : nums) {
            if (num == value) {
                count++;
            }
        }
        return count >= 2;
    }

    /* ---Combo String---
    Create a method called comboString that takes in two strings, a and b. Return a string of the form short+long+short, where short is the shorter of a and b and long is the longer of the two. You can assume the strings are different lengths, but they may be empty (length 0).

    For example:

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
     */
    public static String comboString(String a, String b) {
        String shorter = "";
        String longer = "";
        if (a.length() > b.length()) {
            shorter += b;
            longer += a;
        } else {
            shorter += a;
            longer += b;
        }
        return shorter + longer + shorter;
    }

    /* ---Count XX---
    Create a method called countXX that takes in a string called str. Return the number of "xx" in str. Instances of "xx" can overlap, so "xxx" contains "xx" twice.

    For example:

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
     */
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String currentSubstring = str.substring(i, i + 2);

            if (currentSubstring.equals("xx")) {
                count++;
            }
        }
        if (str.endsWith("xx")) {
            count++;
        }
        return count;
    }

    /* ---Array 1 2 3---
    Create a method called array123 that takes in an integer array called nums. Return true if 1, 2, 3 appears in order, somewhere in nums. Otherwise, return false.

    For example:

    array123({1, 1, 2, 3, 1}) → true
    array123({1, 1, 2, 4, 3}) → false
    array123({1, 1, 2, 1, 2, 3}) → true
     */
    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (nums[i + 1] == 2) {
                    if (nums[i + 2] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* ---More 1 4---
    Create a method called more14 that takes in an array of integers called nums. Return true if the number of 1s in nums is greater than the number of 4s in nums. Otherwise return false.

    For example:

    more14({1, 4, 1}) → true
    more14({1, 4, 1, 4}) → false
    more14({1, 1}) → true
     */
    public static boolean more14(int[] nums) {
        int count1s = 0;
        int count4s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1s++;
            } else {
                count4s++;
            }
        }

        return count1s > count4s;
    }

    /* ---No 4 Letter Words---
    Create a method called no4LetterWords that takes in an array of strings called strings. Return a List containing the elements of strings in the same order except for any that contain exactly 4 characters.

    For example:

    no4LetterWords( {"Train", "Boat", "Car"} ) →   ["Train", "Car"]
    no4LetterWords( {"Red", "White", "Blue"} ) →   ["Red", "White"]
     */

    /* ---Sum Odds---
    Create a method called sumOdds with no parameters. Return the sum of the odd integers between 1 and 100 inclusive.

    For example:

    sumOdds() → 2500
     */

    /* ---Sum Odds Between Values---
    Create a method called sumOddsBetweenValues that takes in two integers start and end. Return the sum of the odd integers between start and end inclusive. You can assume end isn't less than start (but they may be equal).

    For example:

    sumOddsBetweenValues(0, 5) → 9
    sumOddsBetweenValues(28,30) → 29
    sumOddsBetweenValues(18, 18) → 0
     */

    /* ---Fizz Array 3---
    Create a method called fizzArray3 that takes in two integers start and end. Return a new array containing the sequence of integers from start up to but not including end. You can assume end is greater than or equal to start.

    For example:

    fizzArray3(5, 10) → {5, 6, 7, 8, 9}
    fizzArray3(11, 12) → {11}
    fizzArray3(3, 3) → {}
     */

    /* ---Is Strictly Increasing---
    Create a method called isStrictlyIncreasing that takes in an integer array called nums. Return true if the values in the array are strictly increasing. Return false otherwise.

    For example:

    isStrictlyIncreasing({5,7,8,10}) → true
    isStrictlyIncreasing({5,7,7,10}) → false
    isStrictlyIncreasing({-5,-3,0,17}) → true
     */

    /* ---Factorial---
    Create a method called factorial that takes in an integer n and returns the factorial of the number. A factorial is the product of all positive integers less than or equal to n.

    For example:

    factorial(3) → 6 (since 1 * 2 * 3 = 6)
    factorial(4) → 24 (since 1 * 2 * 3 * 4 = 24)
    factorial(10) → 3628800
     */

    /* ---Has Bad---
    Create a method called hasBad that takes in a string called str. Return true if "bad" appears starting at index 0 or 1 in str -- otherwise return false. str may be any length, including 0.

    For example:

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
     */

    /* ---Front Times---
    Create a method called frontTimes that takes in a string str and an integer n. The front of str is the first 3 characters, or whatever is there if str is less than length 3. Return a string made up of n copies of the front.

    For example:

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Ab", 3) → "AbAbAb"
     */

    /* ---Reverse String---
    Create a method called reverseString that takes in a string called str. Return a string containing str in reverse order. str may be empty, but not null.

    For example:

    reverseString(“Hello!”) → “!olleH”
    reverseString(“Kata”) → “ataK”
    reverseString(“”) → “”
     */

    /* ---Reverse List---
    Create a method called reverseList that takes in a List of strings called strings. Return a new List in reverse order of the original.

    For example:
    reverseList( ["purple", "green", "blue", "yellow", "green" ])  →  ["green", "yellow", "blue", green", "purple" ]
    reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} ) →  ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
     */

    /* ---List To Array---
    Create a method called list2Array that takes in a List of strings called strings. Return an array containing the same strings in the same order. Avoid using a standard library method that does the conversion for you.

    For example:

    list2Array( ["aa", "ab", "ac"] ) →   {"aa", "ab", "ac"}
    list2Array( ["as", "df", "jk"] ) →   {"as", "df", "jk"}
    list2Array( ["aaa", "bbb", "ccc", "ddd"] ) →   {"aaa", "bbb", "ccc", "ddd"}
     */

    /* ---Find Largest---
    Create a method called findLargest that takes in a List of integers called nums. Return the largest value in nums.

    For example:

    findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) →  33333
    findLargest( [987, 1234, 9381, 731, 43718, 8932] ) →  43718
    findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) →  64362.
     */

    /* ---Distinct Values---
    Create a method called distinctValues that takes in a List of strings called strings. Return a List that contains the distinct values in strings.

    For example:

    distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) →  ["red", "yellow", "green", "blue", "purple"]
    distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) →  ["jingle", "bells", "all", "the", "way"]
     */

    /* ---Array To List---
    Create a method called array2List that takes in a string array called strings. Return a List containing the elements of strings in the same order. Avoid using a standard library method that does the conversion for you.

    For example:

    array2List( {"Apple", "Orange", "Banana"} ) →   ["Apple", "Orange", "Banana"]
    array2List( {"Red", "Orange", "Yellow"} ) →   ["Red", "Orange", "Yellow"]
    array2List( {"Left", "Right", "Forward", "Back"} ) →   ["Left", "Right", "Forward", "Back"]
     */

    /* ---Array Int To List Double---
    Create a method called arrayInt2ListDouble that takes in an integer array called ints. Divide each value in ints by 2, and return them in a List of Doubles.

    For example:

    arrayInt2ListDouble( {5, 8, 11, 200, 97} ) →  [2.5, 4.0, 5.5, 100, 48.5]
    arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) →  [372.5, 11.5, 22, 4508.5, 3]
    arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) →  [42, 49.5, 1642.5, 6.5, 438.5]
     */

    /* ---Make Out Word---
    Create a method called makeOutWord that takes in two strings, outword and word. Return a new string where the word is in the middle of the outword string. You can assume the length of outword is even.

    For example:

    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
     */

    /* ---Make Middle---
    Create a method called makeMiddle that takes in an integer array nums. Return a new array length 2 containing the middle two elements from nums. You can assume the length of nums is even and 2 or more.

    For example:

    makeMiddle({1, 2, 3, 4}) → {2, 3}
    makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
    makeMiddle({1, 2}) → {1, 2}
     */

    /* ---Blackjack---
    Create a method called blackjack that takes in two integers, a and b. Return whichever value is nearest to 21 without going over. Return 0 if they both go over.

    For example:

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
     */


    /* ---Fizz Buzz---
    Create a method called fizzBuzz with no parameters. Return an array of 100 strings representing the values 1-100. If the value is a multiple of both 3 and 5, put “FizzBuzz” in the array. If the value is a multiple of 3 (but not 5), put “Fizz” in the array. If the value is a multiple of 5 (but not 3), put “Buzz” in the array. For all other values, put a string containing the value in the array.

    For example:

    fizzBuzz() → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", ...}
     */


    /* ---Fibonacci---
    Create a method called fibonacci with no parameters. In a Fibonacci sequence, every number after the first two is the sum of the two preceding ones. Return an array of integers containing the Fibonacci sequence of 0, 1, 1, 2, 3, and so on for the values less than 2000.

    For example:

    fibonacci() → {1, 1, 2, 3, 5, 8, 13, ... 987, 1597}
     */


    /* ---Prime Factors---
    Create a method called primeFactors that takes in an integer n. Return an integer array of the [prime factors] of n(https://www.mathsisfun.com/definitions/prime-factor.html). Prime factors are the numbers you can multiply to get n that you can't break down into any smaller factors. You can assume the input is greater than 1.

    For example:

    primeFactors(6) → {2, 3}
    primeFactors(28) → {2, 2, 7}
    primeFactors(667) → {23, 29}
     */

}