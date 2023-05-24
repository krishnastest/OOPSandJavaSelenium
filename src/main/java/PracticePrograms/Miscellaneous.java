package PracticePrograms;

public class Miscellaneous {

    public static String reverse(String in){
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();
        for(int i= chars.length-1; i>=0; i--){
            out.append(chars[i]);
        }
        return out.toString();
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*aeiou.*");
    }

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    public static int factorial(int n){
        if(n==1)
            return 1;
        return (n*factorial(n-1));
    }

    public static int arraySum(int[] array){
        int sum = 0;
        for (int i: array){
            sum+= i;
        }
        return sum;
    }



    public static void main(String[] args) {
        String in = "abcdef";
        System.out.println(reverse(in));

        String vowel = "sdv";
        System.out.println(stringContainsVowels(vowel));

        int length = 10;
        System.out.println(fibonacci(length));

        int n = 5;
        System.out.println(factorial(n));

        int[] array = {1,4,6,9,3,2,5,7};
        System.out.println(arraySum(array));
    }
}
