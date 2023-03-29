package S1IntroductionToJava.BT1.BTthayQuang.CustomBT;

import java.util.Comparator;

public class ComparatorByEmail implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
