package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Customer;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.utils.DateUtils;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.utils.FileUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookServiceInFile {
    public List<Book> getAll() {

       List<Book> books = FileUtils.readDataFromFile("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/src/main/java/S1IntroductionToJava/BT1/BTthayQuang/BookBT/Data/book.csv", FileUtils.CLASS_BOOK);
        return books ;
    }
    public void updateBookById(long id, Book book){
    List<Book> books = getAll();
    for (int i = 0; i < books.size(); i++){
        if (books.get(i).getId() == id){
            books.get(i).setName(book.getName());
            books.get(i).setPrice(book.getPrice());
            books.get(i).setDescription(book.getDescription());
            books.get(i).setEntryDate(book.getEntryDate());
        }
    }


    }
    public void deleteBookByID(long id){

    }
}
