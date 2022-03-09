
package day19_java_strings_tokens;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Day19_java_strings_tokens {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
        // print bisa pakai while atau for 
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(st.nextToken());
        // }
        
        scan.close();
    }
    }
    

