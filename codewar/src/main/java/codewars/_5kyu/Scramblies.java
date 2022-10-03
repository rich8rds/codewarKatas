package codewars._5kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * SCRAMBLIES
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters
 * can be rearranged to match str2, otherwise returns false.

 * Notes:
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered.
 * Examples
 * scramble('rkqodlw', 'world') ==> True
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 * */

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if(str1.equals(str2)) return true;
        List<String> list = new ArrayList<>(List.of(str1.split("")));
        String[] str2Arr = str2.split("");

        for(String str : str2Arr) {
            if(!list.contains(str)) return false;
            list.remove(str);
        }
        return true;
    }
}

