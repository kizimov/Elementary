package utility;

public class FibanacheUtils {
    public static void printUnits(int[] rangeFibanache, int[] numberFibanache) {
        System.out.println("диапозон " + rangeFibanache[0] + ":" + rangeFibanache[1]);
        for (int i = rangeFibanache[0]; i <= rangeFibanache[1]; i++) {

            if (i < rangeFibanache[1]) {
                System.out.print(numberFibanache[i] + ", ");
            } else {
                System.out.print(numberFibanache[i]);
            }
        }
    }
}
