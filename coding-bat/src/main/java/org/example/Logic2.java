package org.example;

public class Logic2 {
    public static void main(String[] args) {
//        System.out.println("makeBricks: " + makeBricks(3, 1, 8));
//        System.out.println("makeBricks: " + makeBricks(3, 1, 9));
//        System.out.println("makeBricks: " + makeBricks(3, 2, 10));

//        System.out.println("loneSum: " + loneSum(1, 2, 3));
//        System.out.println("loneSum: " + loneSum(3, 2, 3));
//        System.out.println("loneSum: " + loneSum(3, 3, 3));

        System.out.println("luckySum: " + luckySum(1, 2, 3));
        System.out.println("luckySum: " + luckySum(1, 2, 13));
        System.out.println("luckySum: " + luckySum(1, 13, 3));

        System.out.println("noTeenSum: ");

        System.out.println("roundSum: ");

        System.out.println("closeFar: ");

        System.out.println("blackjack: ");

        System.out.println("evenlySpaced: ");

        System.out.println("makeChocolate: ");
    }

    /* >>> makeBricks <<<
    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
     */
    public static boolean makeBricks(int small, int big, int goal) {
        if (goal <= small + (big * 5)) {
            if ((goal % 5) <= small) {
                return true;
            }
        }
        return false;
    }

    /* >>> loneSum <<<
    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.


    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0
     */
    public static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == c && a == b) {
            return 0;
        }
        if (a == c) {
            return b;
        }
        if (b == a) {
            return c;
        }
        if (b == c) {
            return a;
        }
        return sum;
    }

    /* >>>  luckySum <<<
    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1
     */
    public static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return sum;
    }

    /* >>> nnn <<<

     */

    /* >>> nnn <<<

     */

    /* >>> nnn <<<

     */

    /* >>> nnn <<<

     */

    /* >>> nnn <<<

     */

    /* >>> nnn <<<

     */

}
