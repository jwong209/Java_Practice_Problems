package org.example;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
//        System.out.println("mapBully: " + mapBully(new HashMap<String, String>() {{
//            put("a", "candy");
//            put("b", "dirt");
//        }}));
//        System.out.println("mapBully: " + mapBully(new HashMap<String, String>() {{
//            put("a", "candy");
//        }}));
//
//        System.out.println("mapBully: " + mapBully(new HashMap<String, String>() {{
//            put("a", "candy");
//            put("b", "carrot");
//            put("c", "meh");
//        }}));

        System.out.println("mapShare: " + mapShare(new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }}));
        System.out.println("mapShare: " + mapShare(new HashMap<String, String>() {{
            put("b", "xyz");
            put("c", "ccc");
        }}));
        System.out.println("mapShare: " + mapShare(new HashMap<String, String>() {{
            put("a", "aaa");
            put("c", "meh");
            put("d", "hi");
        }}));

        System.out.println("mapAB: " + mapAB(new HashMap<String, String>(){{
            put("a", "Hi");
            put("b", "There");
        }}));
        System.out.println("mapAB: " + mapAB(new HashMap<String, String>(){{
            put("a", "Hi");
        }}));
        System.out.println("mapAB: " + mapAB(new HashMap<String, String>(){{
            put("b", "There");
        }}));

        System.out.println("topping1: ");

        System.out.println("topping2: ");

        System.out.println("topping3: ");

        System.out.println("mapAB2: ");

        System.out.println("mapAB3: ");

        System.out.println("mapAB4: ");
    }

    /* >>> mapBully <<<
        Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

        mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /* >>> mapShare <<<
        Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

        mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
        mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
        mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    /* >>> mapAB <<<
        Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".

        mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        mapAB({"a": "Hi"}) → {"a": "Hi"}
        mapAB({"b": "There"}) → {"b": "There"}
     */
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String abConcat = map.get("a") + map.get("b");
            map.put("ab", abConcat);
        }
        return map;
    }


    /* >>> topping1 <<<
        Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

        topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
        topping1({}) → {"bread": "butter"}
        topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */

    /* >>> topping2 <<<
        Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

        topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
        topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */

    /* >>> topping3 <<<
        Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".

        topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
        topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
        topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
     */

    /* >>> mapAB2 <<<
        Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

        mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
        mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
        mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

    /* >>> mapAB3 <<<
        Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

        mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
        mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
        mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
     */

    /* >>> mapAB4 <<<
        Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

        mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
        mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
        mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
     */

}
