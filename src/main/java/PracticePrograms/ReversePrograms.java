package PracticePrograms;

import java.sql.Array;
import java.util.Arrays;

public class ReversePrograms {

    // n = 12345

    public static int integerReverse(int n) {

        int reverseNum = 0;
        int remainder;
        while (n!= 0){
            remainder = n%10;
            reverseNum = reverseNum*10 + remainder;
            n = n/10;
        }
        return reverseNum;
    }

    public static String stringReverse(String s){
        char[] chars =  s.toCharArray();
        StringBuilder reverse = new StringBuilder();
//        char[] out = new char[s.length()];
        for (int i =chars.length-1; i>=0; i--){
             reverse.append(chars[i]);
        }
//        return Arrays.toString(out);
        return reverse.toString();

    }

    public static void main(String[] args) {
        System.out.println(integerReverse(-12345));
        System.out.println(stringReverse("krishna"));
    }
}
