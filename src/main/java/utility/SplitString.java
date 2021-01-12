package utility;

import java.util.Arrays;
import java.util.List;

public class SplitString {
    public static List<String> asList(String input , String separator) {
        String[] selectedColumn = input.split(separator);
        List<String> sl = Arrays.asList(selectedColumn);
        return sl;
    }

    public static String[] asArray(String input, String separator) {
        String[] selectedColumn = input.split(separator);
        return selectedColumn;
    }
}
