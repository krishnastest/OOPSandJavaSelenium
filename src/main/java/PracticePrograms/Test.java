package PracticePrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    // intArray = [10,5,0,9,3,4,2,1];
    public static int secondLowestVal(int[] intArray){
        int temp = 0;
        // This will sort the array in descending order
        for(int i =0; i<intArray.length; i++){
            for(int j =0; j< intArray.length; j++){
                if(intArray[i]>intArray[j]){
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray[intArray.length-2];

    }
    public static int secondHighVal(int[] intArray){
        int temp = 0;
        // This will sort the array in ascending order
        for(int i =0; i<intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray[intArray.length-2];

    }

    public static void main(String[] args) {
        int[] intArray = new int[]{10,5,0,9,3,4,2,1};
        System.out.println(secondLowestVal(intArray));
        System.out.println(secondHighVal(intArray));

    }
}
