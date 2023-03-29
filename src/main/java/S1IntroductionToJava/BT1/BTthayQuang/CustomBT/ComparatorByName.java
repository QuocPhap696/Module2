package S1IntroductionToJava.BT1.BTthayQuang.CustomBT;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
      return o1.getFullname().compareTo(o2.getFullname());
    }

//    public static void main(String[] args) {
//        //a, b, c, d
//        String a1 = "aPhap";
//        String a2 = "cPhap";
//        System.out.println(a1.compareTo(a2));
//        System.out.println(a2.compareTo(a1));
//    }
}
