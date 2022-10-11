package codewars._6kyu;

/**
 * Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants
 * a diamond string from James. Since James doesn't know how to make
 * this happen, he needs your help.
 *
 * Task
 * You need to return a string that looks like a diamond shape when printed on the
 * screen, using asterisk (*) characters. Trailing spaces should be removed, and
 * every line must be terminated with a newline character (\n).
 *
 * Return null/nil/None/... if the input is an even number or negative, as it
 * is not possible to print a diamond of even or negative size.
 *
 * Examples
 * A size 3 diamond:
 *
 *  *
 * ***
 *  *
 * ...which would appear as a string of " *\n***\n *\n"
 *
 * A size 5 diamond:
 *
 *   *
 *  ***
 * *****
 *  ***
 *   *
 * ...that is:
 *
 * "  *\n ***\n*****\n ***\n  *\n"*/

public class Diamond {
    public static String printDiamond(int n) {
        if(n % 2 == 0 || n < 1) return null;
        int mid = (n / 2) + 1;
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1 ; i <= n ; i+=2) {
            for(int k = 0 ; k < mid ; k++) if(k < mid - count)result.append(" ");
            for(int j = 0 ; j < i ; j++) if(j <= mid + count) result.append("*");
            count++;
            result.append("\n");
        }

        count = 1;
        for(int i = n-2 ; i > 0 ; i-=2) {
            result.append(" ".repeat(Math.max(0, count)));
            result.append("*".repeat(i));
            result.append("\n");
            count++;
        }

        return result.toString();
    }
}
