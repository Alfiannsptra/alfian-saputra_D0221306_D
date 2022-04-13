
package day54_java_reflection_attributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


public class Day54_Java_Reflection_Attributes {

   
    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
    
}
