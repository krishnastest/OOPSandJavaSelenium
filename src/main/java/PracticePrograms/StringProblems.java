package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class StringProblems {

    // count vowel occurences in the string
    public static void countOccurences(String str){
        char[] chars =  str.toCharArray();
        char[] vowelChars = {'a', 'e', 'i', 'o', 'u'};
        Map<Character, Integer> occurences = new HashMap<>();

        for (char c: chars) {
            for (int i = 0; i < vowelChars.length; i++) {
                if (c == vowelChars[i]) {
                    if (occurences.containsKey(c))
                        occurences.put(c, occurences.get(c) + 1);
                    else
                        occurences.put(c, 1);
                }
            }
        }
        System.out.println(occurences);
    }

    public static void main(String[] args) {
        String str=" This is Krishna";
        countOccurences(str);
    }
}
