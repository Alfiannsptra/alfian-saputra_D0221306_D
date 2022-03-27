package day37_java_generic;
import java.io.IOException;
import java.lang.reflect.Method;

public class Day37_Java_Generic {

    class Printer {
        //Write your code here

        public void printArray(Object[] array) {
            for (Object obj : array) {
                System.out.println(obj);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }

    }
}


