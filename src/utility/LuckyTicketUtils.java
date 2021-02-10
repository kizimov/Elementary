package utility;

public class LuckyTicketUtils {
    public int[] getUnit(String fromConsole) {
        byte i;
        int[] unit = new int[6];
        for (i = 0; i < 6; i++) {
            unit[i] = Character.getNumericValue(fromConsole.charAt(i));
        }
        return unit;
    }

}
