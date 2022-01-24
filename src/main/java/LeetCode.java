import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;


public class LeetCode {

    static int[] intArray = new int[]{3, 2, 3};

    public static void main(String[] args) {
        System.out.println(new LeetCode().minimumMoves("xxx"));
    }

    public int minimumMoves(String s) {
        if (!s.contains("x")) {
            return 0;
        }
        String s1 = s.replace("xox", "xxx");
        String[] s1s = s1.split("o");
        int sum = 0;
        for (String s2 : s1s) {
            if (s2 != null) {
                sum = sum + (s2.length() + 1) / 3;
            }
        }
        return sum;
    }


}
