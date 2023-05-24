package PracticePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class CountingPrograms {

    public static void countOccurrence(String str){
        char[] chars = str.toCharArray();
        Map<Character, Integer> count = new HashMap<>();

        for (char c : chars){
            if (count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }
            else
                count.put(c,1);
        }
        System.out.println(count);
    }

    public static int longestSubstring(String str){
        int n = str.strip().length();
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i<n; i++){
            if(str.charAt(i) == '('){
                stack.push(i);
            }
            else {
                if (!stack.isEmpty()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    result = Math.max(result, i - stack.peek());
                    System.out.println(result);
                }
                else
                    stack.push(i);
            }
        }
        return result;
    }

    public static boolean isAnagram(String a,String b)
    {
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        Map<Character,Integer> firstString = new HashMap<>();
        Map<Character,Integer> secondString = new HashMap<>();
        for(char c : chars1){
            if (firstString.containsKey(c)){
                firstString.put(c, firstString.get(c)+1);
            }
            else
                firstString.put(c,1);
        }
        for(char c : chars2){
            if (secondString.containsKey(c)){
                secondString.put(c, secondString.get(c)+1);
            }
            else
                secondString.put(c,1);
        }
        int n = Math.max(firstString.size(), secondString.size());
        boolean what = false;
        for(int i=0; i<=n; i++){
            if(firstString.equals(secondString))
                what = true;
        }
        return what;

    }

    public static void main(String[] args) {
//        String str = "kkrrisssnaaaab";
//        countOccurrence(str);
        String str = "((()()";
        System.out.println(longestSubstring(str));

        String a = "allergy";
        String b = "allergic";
        System.out.println(isAnagram(a,b));
    }
}
