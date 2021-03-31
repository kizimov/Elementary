package main.service;

public class PowService {
    public static int pow(int x, int n) {
        int t = 1;
        boolean notFin = true;
        while (notFin) {
            if (odd(n)) t = t * x;
            n = n / 2;
            if (n > 0) {
                x = x * x;
            } else notFin = false;
        }
        return t;
    }

    public static boolean odd(int n) {
        if (n % 2 == 0) {
            return false;
        } else return true;
    }

    public static int[] getParams(String fromConsole) {
        int[] powParams = new int[2];
        String clianStr = fromConsole.trim().replace(" ", "").replace("  ", "");//очищаем от мусора
        String[] item;
        item = clianStr.split(",");
        powParams[0] = Integer.parseInt(item[0]);
        powParams[1] = Integer.parseInt(item[1]);
        return powParams;
    }
}