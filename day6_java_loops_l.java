package day6_java_loops_l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class day6_java_loops_l {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 1;
        while(i<=10){
            int result = N * i;
            System.out.printf("%d x %d = %d%n",N,i,result);
            i++;
        }


        bufferedReader.close();
    }
}
