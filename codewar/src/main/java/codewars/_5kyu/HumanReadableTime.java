package codewars._5kyu;

/** HUMAN READABLE TIME
 * Write a function, which takes a non-negative integer (seconds) as input and
 * returns the time in a human-readable format (HH:MM:SS)

 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)

 * You can find some examples in the test fixtures.
 * */


public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(0)); //            assertEquals("makeReadable(0)", "00:00:00",
        System.out.println(makeReadable(5)); //            assertEquals("makeReadable(5)", "00:00:05",
        System.out.println(makeReadable(60)); //            assertEquals("makeReadable(60)", "00:01:00",
        System.out.println(makeReadable(86399));//            assertEquals("makeReadable(86399)", "23:59:59",
        System.out.println(makeReadable(359999));//            assertEquals("makeReadable(359999)", "99:59:59",
    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;
        String hourStr = hours > 9 ? ""+hours : "0"+hours;
        String minStr = minutes > 9 ? ""+minutes : "0"+minutes;
        String secStr = second > 9 ? ""+second : "0"+second;
        return hourStr+":"+minStr+":"+secStr;
    }
}
