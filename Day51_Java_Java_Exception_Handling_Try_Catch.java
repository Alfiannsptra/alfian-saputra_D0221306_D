package day51_java_java_exception_handling_.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day51_Java_Java_Exception_Handling_Try_Catch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if (e instanceof InputMismatchException) {
                System.out.println("java.util.InputMismatchException");
            }
        }
        scan.close();
    }

}
