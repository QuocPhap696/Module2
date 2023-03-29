package S1IntroductionToJava.BT1.BTthayQuang.BookBT;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 2;
        } else {
            return -1;
        }
    }
}
