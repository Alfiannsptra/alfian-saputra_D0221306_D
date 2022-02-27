package day9_Java_end_of_life;

import java.util.Scanner;

public class day9_Java_end_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int k = 1;
        while (sc.hasNext()) {//Deteksi EOF
            String s = sc.nextLine();
            System.out.println(k + " " + s);
            k++;
        }
    }
}
