package PracticePrograms;

import java.io.*;
import java.util.*;

public class Testtest {



        public static void main(String[] args) throws IOException {
            int N = 3;
            System.out.println(Solve(N));
        }
        static String Solve(int N){
            int[] divisors = new int[N];
            for(int i=1; i<N; i++){
                if(N%i == 0){
                    divisors[i] = i;
                }
            }
            int sum = Arrays.stream(divisors).sum();
            if(sum == N){
                return "YES";
            }
            else{
                return "NO";
            }

        }

}
