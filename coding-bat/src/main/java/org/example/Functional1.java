package org.example;

public class Functional1 {
    public static void main(String[] args) {
        Functional1 functional1 = new Functional1();

        System.out.println();
    }

    /* >>> doubling <<<
        Given a list of integers, return a list where each integer is multiplied by 2.

        doubling([1, 2, 3]) → [2, 4, 6]
        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
        doubling([]) → []
     */

    /* >>> square <<<
        Given a list of integers, return a list where each integer is multiplied with itself.

        square([1, 2, 3]) → [1, 4, 9]
        square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
        square([]) → []
     */

    /* >>> addStar <<<
        Given a list of strings, return a list where each string has "*" added at its end.

        addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
        addStar(["hello", "there"]) → ["hello*", "there*"]
        addStar(["*"]) → ["**"]
     */

    /* >>> copies3 <<<
        Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

        copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
        copies3(["24", "a", ""]) → ["242424", "aaa", ""]
        copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
     */

    /* >>> moreY <<<
        Given a list of strings, return a list where each string has "y" added at its start and end.

        moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
        moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
        moreY(["yay"]) → ["yyayy"]
     */

    /* >>> math1 <<<
        Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

        math1([1, 2, 3]) → [20, 30, 40]
        math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
        math1([10]) → [110]
     */

    /* >>> rightDigit <<<
        Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

        rightDigit([1, 22, 93]) → [1, 2, 3]
        rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
        rightDigit([10, 0]) → [0, 0]
     */

    /* >>> lower <<<
        Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

        lower(["Hello", "Hi"]) → ["hello", "hi"]
        lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
        lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
     */

    /* >>> noX <<<
        Given a list of strings, return a list where each string has all its "x" removed.

        noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
        noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
        noX(["x"]) → [""]
     */

}
