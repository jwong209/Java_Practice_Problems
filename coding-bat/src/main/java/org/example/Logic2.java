package org.example;

public class Logic2 {
    public static void main(String[] args) {
//        System.out.println("makeBricks: " + makeBricks(3, 1, 8));
//        System.out.println("makeBricks: " + makeBricks(3, 1, 9));
//        System.out.println("makeBricks: " + makeBricks(3, 2, 10));

//        System.out.println("loneSum: " + loneSum(1, 2, 3));
//        System.out.println("loneSum: " + loneSum(3, 2, 3));
//        System.out.println("loneSum: " + loneSum(3, 3, 3));

        System.out.println("luckSum: ");

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

    /* >>> nnn <<<

     */

}
