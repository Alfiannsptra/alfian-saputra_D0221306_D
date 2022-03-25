package day35_java_stack;

import java.util.Scanner;

public class Day35_Java_Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
            //Complete the code
        }

    }
}
