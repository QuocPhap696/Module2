package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;
import S1IntroductionToJava.BT1.BTthayQuang.CustomBT.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceInMemory {
    private List<Customer> customers;

    public CustomerServiceInMemory() {
        customers = new ArrayList<>();
        //thêm dữ liệu cho customers
    }
    public List<Book> getAll() {
        return null;
    }
    public void updateCustomerByID(long id, Customer customer){

    }

    public void deleteCustomerByID(long id) {

    }
}
