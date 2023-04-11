package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Comparator;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
