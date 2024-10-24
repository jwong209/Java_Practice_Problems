package org.example;

public class Warmup1 {
    public static void main(String[] args) {
        Warmup1 warmup1 = new Warmup1();

//        System.out.println("sleepIn: "+ warmup1.sleepIn(false,false));
//        System.out.println("sleepIn: "+ warmup1.sleepIn(true,false));
//        System.out.println("sleepIn: "+ warmup1.sleepIn(false,true));

//        System.out.println("monkeyTrouble: " + warmup1.monkeyTrouble(true, true));
//        System.out.println("monkeyTrouble: " + warmup1.monkeyTrouble(false, false));
//        System.out.println("monkeyTrouble: " + warmup1.monkeyTrouble(true, false));

//        System.out.println("sumDouble: " + warmup1.sumDouble(1,2));
//        System.out.println("sumDouble: " + warmup1.sumDouble(3,2));
//        System.out.println("sumDouble: " + warmup1.sumDouble(2,2));

//        System.out.println("diff21: " + diff21(19));
//        System.out.println("diff21: " + diff21(10));
//        System.out.println("diff21: " + diff21(21));

//        System.out.println("parrotTrouble: " + parrotTrouble(true, 6));
//        System.out.println("parrotTrouble: " + parrotTrouble(true, 7));
//        System.out.println("parrotTrouble: " + parrotTrouble(false, 6));

//        System.out.println("makes10: " + makes10(9, 10));
//        System.out.println("makes10: " + makes10(9, 9));
//        System.out.println("makes10: " + makes10(1, 9));

//        System.out.println("nearHundred: " + nearHundred(93));
//        System.out.println("nearHundred: " + nearHundred(90));
//        System.out.println("nearHundred: " + nearHundred(89));

//        System.out.println("posNeg: " + posNeg(1, -1, false));
//        System.out.println("posNeg: " + posNeg(-1, 1, false));
//        System.out.println("posNeg: " + posNeg(-4, -5, true));

//        System.out.println("notString: " + notString("candy"));
//        System.out.println("notString: " + notString("x"));
//        System.out.println("notString: " + notString("not bad"));

//        System.out.println("missingChar: " + missingChar("kitten", 1));
//        System.out.println("missingChar: " + missingChar("kitten", 0));
//        System.out.println("missingChar: " + missingChar("kitten", 4));

//        System.out.println("frontBack: " + frontBack("code"));
//        System.out.println("frontBack: " + frontBack("a"));
//        System.out.println("frontBack: " + frontBack("ab"));

//        System.out.println("front3: " + front3("Java"));
//        System.out.println("front3: " + front3("Chocolate"));
//        System.out.println("front3: " + front3("abc"));

//        System.out.println("backAround: " + backAround("cat"));
//        System.out.println("backAround: " + backAround("Hello"));
//        System.out.println("backAround: " + backAround("a"));

//        System.out.println("or35: " + or35(3));
//        System.out.println("or35: " + or35(10));
//        System.out.println("or35: " + or35(8));

//        System.out.println("front22: " + front22("kitten"));
//        System.out.println("front22: " + front22("Ha"));
//        System.out.println("front22: " + front22("abc"));

//        System.out.println("startHi: " + startHi("hi there"));
//        System.out.println("startHi: " + startHi("hi"));
//        System.out.println("startHi: " + startHi("hello hi"));

//        System.out.println("icyHot: " + icyHot(120, -1));
//        System.out.println("icyHot: " + icyHot(-1, 120));
//        System.out.println("icyHot: " + icyHot(2, 120));

        System.out.println("");
        
        System.out.println("");

    }

    /* >>> sleepIn <<<
       The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

       sleepIn(false, false) → true
       sleepIn(true, false) → false
       sleepIn(false, true) → true
    */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        //Solution 1
//        if (vacation) {
//            return true;
//        }
//        if (!vacation && !weekday) return true;
//        return false;

        //Solution 2
        return !weekday || vacation;
    }

    /* >>> monkeyTrouble <<<
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && !bSmile) || (bSmile && !aSmile)) return false;
        return true;

        /*
         if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
         */
    }

    /* >>> sumDouble <<<
        Given two int values, return their sum. Unless the two values are the same, then return double their sum.

        sumDouble(1, 2) → 3
        sumDouble(3, 2) → 5
        sumDouble(2, 2) → 8
    */
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }

   /* >>> diff21 <<<
        Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

        diff21(19) → 2
        diff21(10) → 11
        diff21(21) → 0
    */
   public static int diff21(int n) {
       if (n > 21) {
           return 2 * Math.abs(n - 21);
       }
       return Math.abs(n - 21);
   }

   /* >>> parrotTrouble <<<
        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

        parrotTrouble(true, 6) → true
        parrotTrouble(true, 7) → false
        parrotTrouble(false, 6) → false
    */
   public static boolean parrotTrouble(boolean talking, int hour) {
       return (talking && (hour < 7 || hour > 20));
   }

   /* >>> makes10 <<<
        Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

        makes10(9, 10) → true
        makes10(9, 9) → false
        makes10(1, 9) → true
    */
   public static boolean makes10(int a, int b) {
       if (a + b == 10) {
           return true;
       } else if (a == 10 || b == 10) {
           return true;
       }
       return false;
   }

   /* >>> nearHundred <<<
        Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

        nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false
    */
   public static boolean nearHundred(int n) {
       if (Math.abs(200 - n) <= 10 || Math.abs(100 - n) <= 10) return true;
       return false;
   }

   /* >>> posNeg <<<
        Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

        posNeg(1, -1, false) → true
        posNeg(-1, 1, false) → true
        posNeg(-4, -5, true) → true
    */
   public static boolean posNeg(int a, int b, boolean negative) {
       if (negative) {
           if (a < 0 && b < 0) {
               return true;
           }
           return false;
       }
       if (a < 0 && b > 0) {
           return true;
       } else if (a > 0 && b < 0) {
           return true;
       }
       return false;
   }

   /* >>> notString <<<
        Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

        notString("candy") → "not candy"
        notString("x") → "not x"
        notString("not bad") → "not bad"
    */
   public static String notString(String str) {
       if (str.startsWith("not")) {
           return str;
       }
       String answer = "not " + str;
       return answer;
   }

   /* >>> missingChar <<<
        Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

        missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"
    */
   public static String missingChar(String str, int n) {
       return str.replace(Character.toString(str.charAt(n)), "");
   }

   /* >>> frontBack <<<
        Given a string, return a new string where the first and last chars have been exchanged.

        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"
    */
   public static String frontBack(String str) {
       String answer = "";
       if (str.length() < 2) {
           return str;
       }

       String first = Character.toString(str.charAt(0));
       String last = Character.toString(str.charAt(str.length() - 1));
       String minusEnds = str.substring(1, str.length() - 1);

       return last + minusEnds + first;
   }

   /* >>> front3 <<<
        Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

        front3("Java") → "JavJavJav"
        front3("Chocolate") → "ChoChoCho"
        front3("abc") → "abcabcabc"
    */
   public static String front3(String str) {
       String answer = "";
       if (str.length() < 3) {
           for (int i = 0; i < 3; i++) {
               answer += str;
           }
           return answer;
       }

       String front = str.substring(0, 3);
       for (int i = 0; i < 3; i++) {
           answer += front;
       }
       return answer;
   }

   /* >>> backAround <<<
        Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"
    */
   public static String backAround(String str) {
       String last = Character.toString(str.charAt(str.length() - 1));
       return last + str + last;
   }

   /* >>> or35 <<<
        Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

        or35(3) → true
        or35(10) → true
        or35(8) → false
    */
   public static boolean or35(int n) {
       return n % 5 == 0 || n % 3 == 0;
   }

   /* >>> front22 <<<
        Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"
    */
   public static String front22(String str) {
       if (str.length() < 2) {
           return str + str + str;
       }
       String front = str.substring(0, 2);
       return front + str + front;
   }

   /* >>> startHi <<<
       Given a string, return true if the string starts with "hi" and false otherwise.

        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false
    */
   public static boolean startHi(String str) {
       if (str.startsWith("hi")) {
           return true;
       }
       return false;
   }

   /* >>> icyHot <<<
        Given two temperatures, return true if one is less than 0 and the other is greater than 100.

        icyHot(120, -1) → true
        icyHot(-1, 120) → true
        icyHot(2, 120) → false
    */
   public static boolean icyHot(int temp1, int temp2) {
       if (temp1 < 0 && temp2 > 100) {
           return true;
       } else if (temp1 > 100 && temp2 < 0) {
           return true;
       }
       return false;
   }

   /* >>> in1020 <<<
        Given 2 int values, return true if either of them is in the range 10..20 inclusive.

        in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false
    */


   /* >>> hasTeen <<<
        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true
    */

   /* >>> loneTeen <<<
        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false
    */

   /* >>> delDel <<<
        Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
    */

   /* >>> mixStart <<<
        Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false
    */

   /* >>> startOz <<<
        Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"
    */

   /* >>> intMax <<<
        Given three int values, a b c, return the largest.

        intMax(1, 2, 3) → 3
        intMax(1, 3, 2) → 3
        intMax(3, 2, 1) → 3
    */

   /* >>> close10 <<<
        Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0
    */

   /* >>> in3050 <<<
        Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true
    */

   /* >>> max1020 <<<
        Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11
    */

   /* >>> stringE <<<
        Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
    */

   /* >>> lastDigit <<<
        Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true
    */

   /* >>> endUp <<<
        Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"
    */

   /* >>> everyNth <<<
        Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg"
    */


}
