package day58_java_singleton_pattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {

    private volatile static Singleton instance;
    public static String str;

    private Singleton() {
    }

    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

public class Day58_Java_Singleton_Pattern {

}
