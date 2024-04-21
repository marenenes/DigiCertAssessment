package utility;
import java.util.ArrayList;
public class Helpers {

    public static boolean IsAscendingAlphabeticalOrder(ArrayList<String> column)
    {
        for (String s : column) {
            boolean isTrue = s.compareTo(s + 1) <= 0;
            if (!isTrue) {
                return false;
            }
        }
        return  true;
    }

}
