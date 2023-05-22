package S1IntroductionToJava.BT1.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> setA= new HashSet<String>();
        setA.add("hihi");
        setA.add("Chirua");
        setA.add("Caichi");
        setA.add("Dimo");
        System.out.println("Số phần tử của a " + setA.size());
        System.out.println("Các phần tử của a" +setA);
        System.out.println("setA có chứa java không ? " +setA.contains("Caichi"));
        System.out.println("setA có chứa c++ không ? " + setA.contains("c++"));
    }
}
