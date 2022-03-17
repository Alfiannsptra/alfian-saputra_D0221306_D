package day27_java_biginteger;

import java.util.*;
import java.math.*;

public class Day27_Java_BigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger C = A.add(B);
        BigInteger D = A.multiply(B);
        System.out.println(C);//hasil penjumlahan
        System.out.println(D);//hasil perkalian
        sc.close();
    }

}
