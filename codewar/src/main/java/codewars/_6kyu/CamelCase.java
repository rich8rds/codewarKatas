package codewars._6kyu;
/**
 * Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or
 * camelCase in Java) for strings. All words must have their first letter capitalized without spaces.
 * For instance:
 * camelCase("hello case"); // => "HelloCase"
 * camelCase("camel case word"); // => "CamelCaseWord"
 * */

public class CamelCase {
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();

        String[] strArr = str.split(" ");
        for(String s : strArr) {
            String[] strUpper = s.split("");
            strUpper[0] = strUpper[0].toUpperCase();
            sb.append(String.join("", strUpper));
        }
        return sb.toString();
    }
}
