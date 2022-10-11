package codewars._6kyu;

/**
 * Build Tower
 * Build a pyramid-shaped tower, as an array/list of strings,
 * given a positive integer number of floors. A tower block is
 * represented with "*" character.
 *
 * For example, a tower with 3 floors looks like this:
 *
 * [
 *   "  *  ",
 *   " *** ",
 *   "*****"
 * ]
 * And a tower with 6 floors looks like this:
 *
 * [
 *   "     *     ",
 *   "    ***    ",
 *   "   *****   ",
 *   "  *******  ",
 *   " ********* ",
 *   "***********"
 * ]
 * */
public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        int height = nFloors * 2 - 1;
        String[] strArr = new String[nFloors];
        int index = 0;

        for(int i = 1 ; i <= height ; i+=2) {
            String result = "";
            for(int k = 0 ; k < nFloors-1 ; k++) if(k < nFloors - 1 - index)result += " ";
            for(int j = 0 ; j < i  ; j++) result += "*";
            for(int z = i ; z < height ; z+=2) result += " ";
            strArr[index] = result;
            index++;
        }
        return strArr;
    }
}
