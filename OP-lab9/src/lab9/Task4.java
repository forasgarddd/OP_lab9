package lab9;

public class Task4 {

    public static void main(String[] args) {
        printResult("CAFE");
        printResult("LOST");
        printResult("");
    }

    static boolean isHex(String s) {
        boolean ret;
        try {
            Integer.parseInt(s, 16);
            ret = true;
        } catch (NumberFormatException ex) {
            ret = false;
        }
        return ret;
    }

    static int hexStringToInt(String s) {
        if (isHex(s) == false) {
            throw new NumberFormatException("Given string is not hex");
        }
        return Integer.parseInt(s, 16);
    }

    static void printResult(String s) {
        try {
            System.out.println("Given string: " + s);
            System.out.println("Converted to int: " + hexStringToInt(s));
        } catch (NumberFormatException ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
