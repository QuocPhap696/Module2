package S1IntroductionToJava.BT1.Product_________;

import java.util.Comparator;

public class ComparatorByPrice1 implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
