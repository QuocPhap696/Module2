package S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class BookServiceInMemory {
    List<Book> books;
    public BookServiceInMemory() {
        books = new ArrayList<>();
        // long id, String name, String description, Date entrydate, double price
        Book book = new Book(1, "Đắc Nhân Tâm", "Đạo Lý", new Date(), 300000.0d);
        books.add(book);
        books.add(new Book(2, "Doraemon", "Truyện con nít", new Date(), 50000.0d));
        books.add(new Book(3, "Kimi no Na wa", "Anime", new Date(), 150000.0d));
        books.add(new Book(4, "HiHi", "Cười", new Date(), 30000));
        books.add(new Book(5, "Chi rứa", "Giải trí", new Date(), 70000.0d));
    }
    public List<Book> getAll() {
        return this.books;
    }
    public void updateBookByID(long id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if ( id == books.get(i).getId()) {
                books.get(i).setName(book.getName());
                books.get(i).setDescription(book.getDescription());
                books.get(i).setPrice(book.getPrice());
            }
        }
    }
    public void deleteBookByName(String name){
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (Objects.equals(name, books.get(i).getName())) {
                index = i;
            }
        }

        if(index != -1) {
            books.remove(index);
        }
    }
}
