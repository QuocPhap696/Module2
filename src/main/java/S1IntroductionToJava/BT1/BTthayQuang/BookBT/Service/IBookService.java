package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    void updateBookById(long id, Book book);
    void deleteBookById(long id);
}
