package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Customer;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.utils.DateUtils;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.utils.FileUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerSerViceInFile {
    public List<Book> getAll() {
            List<Book> books = FileUtils.readDataFromFile("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/src/main/java/S1IntroductionToJava/BT1/BTthayQuang/BookBT/Data/customer.csv", FileUtils.CLASS_CUSTOMER);


        return null;
    }
    public void updateCustomerById(long id, Customer customer){

    }
    public void deleteCustomerById(long id) {

    }
}
