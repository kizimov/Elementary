package service;

public class FibanacheService {
    public static int[] getRange(String fromConsole) {
        int[] rangeFibanache = new int[2];
        String clianStr = fromConsole.trim().replace(" ", "").replace("  ", "");
        String[] item;
        item = clianStr.split(",");
        rangeFibanache[0] = Integer.parseInt(item[0]);
        rangeFibanache[1] = Integer.parseInt(item[1]);
        return rangeFibanache;
    }

    public static int[] fibanacheSeries(int[] rangeFibanache) {
        int[] numberFibanache = new int[rangeFibanache[1] + 1];
        numberFibanache[0] = 0;
        numberFibanache[1] = 1;
        for (int i = 2; i <= rangeFibanache[1]; i++) {
            numberFibanache[i] = numberFibanache[i - 1] + numberFibanache[i - 2];
        }
        return numberFibanache;
    }
}