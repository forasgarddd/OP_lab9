package lab9;

public class Task4 {

    public static void main(String[] args) {
        printResult("CAFE");
        //printRes("ABCD");
    }

    static int hexStringToInt(String s) {
        return Integer.parseInt(s, 16);
    }

    static void printResult(String s) {
        System.out.println("Given string in hex: " + s);
        System.out.println("Converted to int: " + hexStringToInt(s));
    }
}
