package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        printResult("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago");
        printResult("");
    }

    static String wordsInStringToUpperCase(String s) {
        if (s.length() == 0) {
            throw new IllegalArgumentException("Given string is empty");
        }
        String upper_s = s.toUpperCase();
        List<String> s_arrlist = new ArrayList<>(Arrays.asList(upper_s.split(" ")));
        for (String word : s_arrlist) {
            if (word.matches("\\S*\\d+\\S")) {
                String nickname = word.toLowerCase();
                int index_of_nickname = s_arrlist.indexOf(word);
                s_arrlist.set(index_of_nickname, nickname);
            }
        }
        return String.join(" ", s_arrlist);
    }

    static void printResult(String s) {
        try {
            System.out.println("Given string: " + s);
            System.out.println("String with uppercase words: " + wordsInStringToUpperCase(s));
        } catch (IllegalArgumentException ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
