package S1IntroductionToJava.BT1.BTthayQuang.BookBT;

import S1IntroductionToJava.BT1.BTthayQuang.CustomBT.ComparatorById;

import java.util.*;

public class BookStore {
      List<Book> books;

      private Scanner scanner = new Scanner(System.in);

      public BookStore() {
            books = new ArrayList<>();
            // long id, String name, String description, Date entrydate, double price
            Book book = new Book(1, "Đắc Nhân Tâm", "Đạo Lý", new Date(), 300000.0d);
            books.add(book);
            books.add(new Book(2, "Doraemon", "Truyện con nít", new Date(), 50000.0d));
            books.add(new Book(3, "Kimi no Na wa", "Anime", new Date(), 150000.0d));
            books.add(new Book(2, "HiHi", "Cười", new Date(), 30000));
            books.add(new Book(2, "Chi rứa", "Giải trí", new Date(), 70000.0d));
      }

      //hiển thị danh sách
      public void showBooks() {
            System.out.printf("%5s | %20s | %20s | %20s | %20s \n", "ID", "Name", "Description", "Date", "Price");
            for (int i = 0; i < books.size(); i++) {
                  Book book = books.get(i);
                  System.out.printf("%5s | %20s | %20s | %20s | %20s \n",
                          book.getId(), book.getName(), book.getDescription(), book.getEntryDate(), book.getPrice());
            }
      }

      public void showBooks(List<Book>books) {
            System.out.printf("%5s | %20s | %20s | %20s | %20s \n", "ID", "Name", "Description", "Date", "Price");
            for (int i = 0; i < books.size(); i++) {
                  Book book = books.get(i);
                  System.out.printf("%5s | %20s | %20s | %20s | %20s \n",
                          book.getId(), book.getName(), book.getDescription(), book.getEntryDate(), book.getPrice());
            }
      }
      //hiển thị danh sách
      public void addBook() {
            System.out.println("Nhập thông tin sách");
            System.out.println("Nhập tên sách");
            String name = scanner.nextLine();
            System.out.println("Nhập mô tả sách");
            String description = scanner.nextLine();

            System.out.println("Nhập giá");
            double price = Double.parseDouble(scanner.nextLine());

            Comparator comparator = new ComparatorById();
            books.sort(comparator);
            long maxId = books.get(books.size()-1).getId();

            Book book = new Book();
            book.setId(maxId + 1);
            book.setName(name);
            book.setDescription(description);
            book.setPrice(price);
            book.setEntryDate(new Date());

            books.add(book);
            showBooks();
      }

      //chỉnh sửa sách
      public void editBook() {
            System.out.println("Nhập Id mà bạn muốn sửa");
            long id = Long.parseLong(scanner.nextLine());

            System.out.println("Nhập tên mới");
            String newName = scanner.nextLine();
            System.out.println("Nhập mô tả mới");
            String newInfor = scanner.nextLine();
            System.out.println("Nhập giá mới");
            double newPrice = Double.parseDouble(scanner.nextLine());

            //chạy vòng lặp
            for (int i = 0; i < books.size(); i++) {
                  if ( id == books.get(i).getId()) {
                       books.get(i).setName(newName);
                       books.get(i).setDescription(newInfor);
                       books.get(i).setPrice(newPrice);
                  }
            }
            showBooks();
      }

      //xoá sách
      public void deleteBook() {
            System.out.println("Nhập tên mà bạn muốn xoá");
            long id = Long.parseLong(scanner.nextLine());

            //chạy vòng lặp
            for (int i = 0; i < books.size(); i++) {
                  if (id == books.get(i).getId()) {
                        books.remove(i);
                  }
            } showBooks();
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BookStore bookStore = new BookStore();
            boolean checkActionMenu = true;
            do {
                  System.out.println("Menu quản lý sách");
                  System.out.println("Nhấn 1 Xem danh sách");
                  System.out.println("Nhấn 2 Thêm sách");
                  System.out.println("Nhấn 3 Sửa sách");
                  System.out.println("Nhấn 4 Xoá sách");
                  System.out.println("Nhấn 5 Sắp xếp sách theo giá");
                  System.out.println("Nhấn 6 Sắp xếp theo tên");
                  System.out.println("Nhấn 7 Tìm kiếm sách theo tên");
                  System.out.println("Nhấn 8 Tìm kiếm sách hoặc theo mô tả");
                  int actionMenu = Integer.parseInt(scanner.nextLine());
            }
      }

      //tìm theo tên
      private void searchByName() {
            System.out.println("Nhập tên mà bạn muốn tìm kiếm");
            String tim = scanner.nextLine();
            List<Book> results = new ArrayList<>();
            for (int i = 0; i < books.size(); i++) {
                  if (books.get(i).getName().contains(tim)) {
                        results.add(books.get(i));
                  }
            }  showBooks(results);
      }
      // sắp xếp theo tên
      private void sortByName() {
            books.sort(new ComparatorByName());
            showBooks();
      }
      // sắp xếp theo giá
      private void sortByPrice() {
            books.sort(new ComparatorByPrice());
            showBooks();
      }
}


















































































































































































