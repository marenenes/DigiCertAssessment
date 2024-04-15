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

    public static boolean IsDescendingAlphabeticalOrder(ArrayList<String> column)
    {
        for (String s : column) {
            boolean isTrue = s.compareTo(s + 1) >= 0;
            if (!isTrue) {
                return false;
            }
        }
        return  true;
    }

    public static boolean SpecieFound(ArrayList<String> column, String searchFor)
    {
        for (String s : column) {
            if(s.equals(searchFor)){
                return true;
            }
        }
        return  false;
    }

}
