package utility;

public class NumericalSequenceUtils {
    public static void printUnits(int number) {
        int i;
        for (i = 0; i < Math.sqrt(number); i++) {
            if (i < Math.sqrt(number) - 1) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
    }
}
