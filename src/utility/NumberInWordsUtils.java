package utility;

public class NumberInWordsUtils {

    public String clearingSpace(String extraSpaces) {
        return extraSpaces.trim().replace("  ", " ");
    }

    public int absNumber(int number) {
        return Math.abs(number);
    }
}
