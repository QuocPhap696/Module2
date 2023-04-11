package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Book> getAll();

    void updateCustomerById(long id, Customer customer);
    void deleteCustomerById(long id);
}
