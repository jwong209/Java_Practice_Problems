package org.example;

public class String2 {
    public static void main(String[] args) {
        String2 string2 = new String2();

//        System.out.println("doubleChar: " + doubleChar("The"));
//        System.out.println("doubleChar: " + doubleChar("AAbb"));
//        System.out.println("doubleChar: " + doubleChar("Hi-There"));

//        System.out.println("countHi: " + countHi("abc hi ho"));
//        System.out.println("countHi: " + countHi("ABChi hi"));
//        System.out.println("countHi: " + countHi("hihi"));

//        System.out.println("catDog: " + catDog("catdog"));
//        System.out.println("catDog: " + catDog("catcat"));
//        System.out.println("catDog: " + catDog("1cat1cadodog"));

//        System.out.println("countCode: " + countCode("aaacodebbb"));
//        System.out.println("countCode: " + countCode("codexxcode"));
//        System.out.println("countCode: " + countCode("cozexxcope"));

//        System.out.println("endOther: " + endOther("Hiabc", "abc"));
//        System.out.println("endOther: " + endOther("AbC", "HiaBc"));
//        System.out.println("endOther: " + endOther("abc", "abXabc"));

        System.out.println("xyzThere: ");

//        System.out.println("bobThere: " + bobThere("abcbob"));
//        System.out.println("bobThere: " + bobThere("b9b"));
//        System.out.println("bobThere: " + bobThere("bac"));

        System.out.println("xyBalance: ");

//        System.out.println("mixString: " + mixString("abc", "xyz"));
//        System.out.println("mixString: " + mixString("Hi", "There"));
//        System.out.println("mixString: " + mixString("xxxx", "There"));

//        System.out.println("repeatEnd: " + repeatEnd("Hello", 3));
//        System.out.println("repeatEnd: " + repeatEnd("Hello", 2));
//        System.out.println("repeatEnd: " + repeatEnd("Hello", 1));

//        System.out.println("repeatFront: " + repeatFront("Chocolate", 4));
//        System.out.println("repeatFront: " + repeatFront("Chocolate", 3));
//        System.out.println("repeatFront: " + repeatFront("Ice Cream", 2));

//        System.out.println("repeatSeparator: " + repeatSeparator("Word", "X", 3));
//        System.out.println("repeatSeparator: " + repeatSeparator("This", "And", 2));
//        System.out.println("repeatSeparator: " + repeatSeparator("This", "And", 1));

//        System.out.println("prefixAgain: " + prefixAgain("abXYabc", 1));
//        System.out.println("prefixAgain: " + prefixAgain("abXYabc", 2));
//        System.out.println("prefixAgain: " + prefixAgain("abXYabc", 3));

        System.out.println("xyzMiddle: ");

//        System.out.println("getSandwich: " + getSandwich("breadjambread"));
//        System.out.println("getSandwich: " + getSandwich("xxbreadjambreadyy"));
//        System.out.println("getSandwich: " + getSandwich("xxbreadyy"));

//        System.out.println("sameStarChar: " + sameStarChar("xy*yzz"));
//        System.out.println("sameStarChar: " + sameStarChar("xy*zzz"));
//        System.out.println("sameStarChar: " + sameStarChar("*xa*az"));

//        System.out.println("oneTwo: " + oneTwo("abc"));
//        System.out.println("oneTwo: " + oneTwo("tca"));
//        System.out.println("oneTwo: " + oneTwo("tcagdo"));

        System.out.println("zipZap: ");

        System.out.println("starOut: " + starOut("ab*cd"));
        System.out.println("starOut: " + starOut("ab**cd"));
        System.out.println("starOut: " + starOut("sm*eilly"));

        System.out.println("plusOut: ");

        System.out.println("wordEnds: ");

    }

    /* >>> doubleChar <<<
        Given a string, return a string where for every char in the original, there are two chars.

        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public static String doubleChar(String str) {
//        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            answer += str.charAt(i);
//            answer += str.charAt(i);
//        }
//        return answer;

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
            // Alternately:
            // result = result + str.substring(i, i+1) + str.substring(i, i+1);
        }
        return result;
    }

    /* >>> countHi <<<
        Return the number of times that the string "hi" appears anywhere in the given string.

        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
     */
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() -1; i++) {
            String substring = str.substring(i, i + 2);

            if (substring.equals("hi")) {
                count++;
            }
        }
        return count;
    }

    /* >>> catDog <<<
        Return true if the string "cat" and "dog" appear the same number of times in the given string.

        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true
     */
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String substring = str.substring(i, i + 3);

            if (substring.equals("cat")) {
                catCount++;
            }
            if (substring.equals("dog")) {
                dogCount++;
            }
        }
        if (catCount == dogCount) {
            return true;
        }
        return false;
    }

    /* >>> countCode <<<
        Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

        countCode("aaacodebbb") → 1
        countCode("codexxcode") → 2
        countCode("cozexxcope") → 2
     */
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            String firstHalf = str.substring(i, i + 2);
            String lastHalf = str.substring(i + 3, i + 4);
            String substring = str.substring(i, i + 4);

            if (firstHalf.equals("co") && lastHalf.equals("e")) {
                count++;
            }
        }
        return count;
    }

    /* >>> endOther <<<
        Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

        endOther("Hiabc", "abc") → true
        endOther("AbC", "HiaBc") → true
        endOther("abc", "abXabc") → true
     */
    public static boolean endOther(String a, String b) {
        if (a.toLowerCase().endsWith(b.toLowerCase())) {
            return true;
        }
        if (b.toLowerCase().endsWith(a.toLowerCase())) {
            return true;
        }
        return false;

//        return a.toLowerCase().endsWith(b.toLowerCase()) ||  b.toLowerCase().endsWith(a.toLowerCase());
    }

    /* >>> xyzThere <<<
        Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true
     */

    /* >>> bobThere <<<
        Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

        bobThere("abcbob") → true
        bobThere("b9b") → true
        bobThere("bac") → false
     */
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2)== 'b') {
                return true;
            }
        }
        return false;
    }

    /* >>> xyBalance <<<
        We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false
     */

    /* >>> mixString <<<
        Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"
     */
    public static String mixString(String a, String b) {
        String answer = "";
        if (b.length() > a.length()) {
            for (int i = 0; i < a.length(); i++) {
                answer += a.charAt(i);
                answer += b.charAt(i);
            }
            answer += b.substring(b.length() - (b.length() - a.length()));
        }
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                answer += a.charAt(i);
                answer += b.charAt(i);
            }
            answer += a.substring(a.length() - (a.length() - b.length()));
        }
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                answer += a.charAt(i);
                answer += b.charAt(i);
            }
        }
        return answer;
    }

    /* >>> repeatEnd <<<
        Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

        repeatEnd("Hello", 3) → "llollollo"
        repeatEnd("Hello", 2) → "lolo"
        repeatEnd("Hello", 1) → "o"
     */
    public static String repeatEnd(String str, int n) {
        String substring = str.substring(str.length() - n);
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += substring;
        }
        return answer;

  /*
  String substring = str.substring(str.length() - n);
  return substring.repeat(n);
  */

    }

    /* >>> repeatFront <<<
        Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

        repeatFront("Chocolate", 4) → "ChocChoChC"
        repeatFront("Chocolate", 3) → "ChoChC"
        repeatFront("Ice Cream", 2) → "IcI"
     */
    public static String repeatFront(String str, int n) {
        int count = n;
        String answer = "";
        String substring = str.substring(0, count);
        while (count > 0) {
            answer += substring;
            count--;
            substring = str.substring(0, count);
        }
        return answer;
    }

    /* >>> repeatSeparator <<<
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"
     */
    public static String repeatSeparator(String word, String sep, int count) {
        String answer = "";
        if (count == 0) {
            return sep;
        }
        if (count == 1) {
            return word;
        }
        answer += word;
        for (int i = 1; i < count; i++) {
            answer += sep + word;
        }
        return answer;
    }

    /* >>> prefixAgain <<<
        Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

        prefixAgain("abXYabc", 1) → true
        prefixAgain("abXYabc", 2) → true
        prefixAgain("abXYabc", 3) → false
     */
    public static boolean prefixAgain(String str, int n) {
        String sub = str.substring(0, n);
        String newString = str.substring(n);
        if (newString.contains(sub)) {
            return true;
        }
        return false;
    }

    /* >>> xyzMiddle <<<
        Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false
     */

    /* >>> getSandwich <<<
        A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""
     */
    public static String getSandwich(String str) {
        int firstIndex = str.indexOf("bread");
        if (firstIndex == -1) {
            return "";
        }
        int lastIndex = str.lastIndexOf("bread");
        if (lastIndex == firstIndex) {
            return "";
        }
        return str.substring(firstIndex + 5, lastIndex);
    }

    /* >>> sameStarChar <<<
        Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true
     */
    public static boolean sameStarChar(String str) {
        if (str.length() == 0) {
            return true;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            String current = Character.toString(str.charAt(i));
            String before = Character.toString(str.charAt(i - 1));
            String after = Character.toString(str.charAt(i + 1));
            if (current.equals("*") && !before.equals(after)) {
                return false;
            }
        }
        return true;
    }

    /* >>> oneTwo <<<
        Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

        oneTwo("abc") → "bca"
        oneTwo("tca") → "cat"
        oneTwo("tcagdo") → "catdog"
     */
    public static String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }
        String answer = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            String front = str.substring(i, i+1);
            String back = str.substring(i+1, i+3);
            answer += back;
            answer += front;
        }
        return answer;
    }

    /* >>> zipZap <<<
        Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

        zipZap("zipXzap") → "zpXzp"
        zipZap("zopzop") → "zpzp"
        zipZap("zzzopzop") → "zzzpzp"
     */

    /* >>> starOut <<<
        Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

        starOut("ab*cd") → "ad"
        starOut("ab**cd") → "ad"
        starOut("sm*eilly") → "silly"
     */
    public static String starOut(String str) {
        String answer = "";
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            if (str.equals("*")) {
                return "";
            } else {
                return str;
            }
        }
        if (str.charAt(0) != '*' && str.charAt(1) != '*') {
            answer += Character.toString(str.charAt(0));
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if ((str.charAt(i) != '*' && str.charAt(i+1) == '*') || (str.charAt(i) != '*' && str.charAt(i-1) == '*') || str.charAt(i) == '*') {
                continue;
            }
            answer += Character.toString(str.charAt(i));
        }
        if (str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 2) != '*') {
            answer += Character.toString(str.charAt(str.length() - 1));
        }
        return answer;
    }

    /* >>> plusOut <<<
        Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */

    /* >>> wordEnds <<<
        Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

        wordEnds("abcXY123XYijk", "XY") → "c13i"
        wordEnds("XY123XY", "XY") → "13"
        wordEnds("XY1XY", "XY") → "11"
     */

}
