package service;

public class LuckyTicketService {

    public void methodMoscow(int[] unit) {
        int sum1 = unit[0] + unit[1] + unit[2];
        int sum2 = unit[3] + unit[4] + unit[5];
        if (sum1 == sum2) {
            System.out.println("Счастливый билетик!");
        } else {
            System.out.println("Не счастливый билет");
        }
    }

    public void methodPiter(int[] unit) {
        int sum1 = unit[0] + unit[2] + unit[4];
        int sum2 = unit[1] + unit[3] + unit[5];
        if (sum1 == sum2) {
            System.out.println("Счастливый билетик!");
        } else {
            System.out.println("Не счастливый билет");
        }
    }


}