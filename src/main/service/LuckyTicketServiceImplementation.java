package main.service;

public class LuckyTicketServiceImplementation {

    public boolean methodMoscow(int[] unit) {
        int sum1 = unit[0] + unit[1] + unit[2];
        int sum2 = unit[3] + unit[4] + unit[5];
        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean methodPiter(int[] unit) {
        int sum1 = unit[0] + unit[2] + unit[4];
        int sum2 = unit[1] + unit[3] + unit[5];
        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }

    public int[] getUnit(String fromConsole) {
        byte i;
        int[] unit = new int[6];
        for (i = 0; i < 6; i++) {
            unit[i] = Character.getNumericValue(fromConsole.charAt(i));
        }
        return unit;
    }
}