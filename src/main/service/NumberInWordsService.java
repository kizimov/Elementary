package main.service;

public class NumberInWordsService {

    public String numberInWords(int number) throws IllegalArgumentException {

        String prescription = "";
        String[] units0_19 = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
                "десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens10_90 = {"", "десять", "двадцать", "тридцать", "сорок", "пятдесят", "шестдесят",
                "семьдесят", "восемдесят", "девяносто"};
        String[] hundred100_900 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
                "семьсот", "восемьсот", "девятьсот"};

        int caseNumber = 1;
        if (number < 0) prescription = "минус ";
        number = Math.abs(number);
        int million = number / 1000000;
        int thousand = number / 1000;
        if (number == 0) prescription = "ноль";
        // обрабатываем миллионы
        if (number >= 100000000) {
            prescription = prescription + hundred100_900[number / 100000000];
            number = number % 100000000;
        }
        if (number >= 1000000) {
            if (number >= 20000000) {
                prescription = prescription + " " + tens10_90[number / 10000000];
                prescription = prescription + " " + units0_19[number / 1000000 % 10];
            }
            if ((number < 20000000) && (number > 1000000)) {
                prescription = prescription + " " + units0_19[number / 1000000];
            }
        }
        if (million > 0) {
            caseNumber = number / 1000000;
            if ((caseNumber >= 5) && (caseNumber < 21)) {
                prescription += " миллионов";
            } else {
                caseNumber = caseNumber % 10;
                if (caseNumber == 0) prescription += " миллионов";
                if (caseNumber == 1) prescription += " миллион";
                if ((caseNumber > 1) && (caseNumber < 5)) prescription += " миллиона";
                if (caseNumber >= 5) prescription += " миллионов";
            }
        }
        number = number % 1000000;
        //обрабатываем тысячи
        if (number >= 100000) {
            prescription = prescription + " " + hundred100_900[number / 100000];
            number = number % 100000;
        }
        if (number >= 1000) {
            if (number >= 20000) {
                prescription = prescription + " " + tens10_90[number / 10000];
                prescription = prescription + " " + units0_19[number / 1000 % 10];
            }
            if ((number < 20000) && (number > 1000)) {
                prescription = prescription + " " + units0_19[number / 1000];
            }
        }
        if (thousand > 0) {
            caseNumber = number / 1000;
            if ((caseNumber >= 5) && (caseNumber < 21)) {
                prescription += " тысяч";
            } else {
                caseNumber = caseNumber % 10;
                if (caseNumber == 0) prescription += " тысяч";
                if (caseNumber == 1) prescription += " тысяча";
                if ((caseNumber > 1) && (caseNumber < 5)) prescription += " тысячи";
                if (caseNumber >= 5) prescription += " тысяч";
            }
        }
        number = number % 1000;
        //обрабатываем сотни
        if (number >= 100) {
            prescription = prescription + " " + hundred100_900[number / 100];
            number = number % 100;
        }
        if (number >= 1) {
            if (number >= 20) {
                prescription = prescription + " " + tens10_90[number / 10];
                prescription = prescription + " " + units0_19[number % 10];
            }
            if ((number < 20) && (number > 1)) {
                prescription = prescription + " " + units0_19[number];
            }
        }
        return prescription;
    }

    public String clearingSpace(String extraSpaces) {
        return extraSpaces.trim().replace("  ", " ");
    }
}
