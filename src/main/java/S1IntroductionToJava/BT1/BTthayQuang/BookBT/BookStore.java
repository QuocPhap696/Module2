package S1IntroductionToJava.BT1.BTthayQuang.BookBT;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.View.BookView;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.View.CustomerView;

public class BookStore {
    public static void main(String[] args) {
        BookView bookView = new BookView();
        bookView.launcher();

        CustomerView customerView = new CustomerView();
        customerView.launcher();

}
}
