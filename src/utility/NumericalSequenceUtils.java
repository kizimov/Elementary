package utility;

import java.util.ArrayList;
import java.util.List;

public class NumericalSequenceUtils {
    public static List printUnits(int number) {
        int i;

        List sequence = new ArrayList<Integer>();
        for (i = 0; i < Math.sqrt(number); i++) {
            sequence.add(i);
        }
        return sequence;
    }
}
