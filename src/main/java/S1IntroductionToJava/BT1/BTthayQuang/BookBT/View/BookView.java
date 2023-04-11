package S1IntroductionToJava.BT1.BTthayQuang.BookBT.View;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Comparator.ComparatorByName;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Comparator.ComparatorByPrice;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Model.Book;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service.BookServiceInMemory;
import S1IntroductionToJava.BT1.BTthayQuang.BookBT.utils.ValiDateUtils;
import S1IntroductionToJava.BT1.BTthayQuang.CustomBT.ComparatorById;

import java.util.*;

public class BookView {
      private BookServiceInMemory bookService;

      private Scanner scanner = new Scanner(System.in);

      public BookView() {
            bookService  = new BookServiceInMemory();
      }

      //hiển thị danh sách
      public void showBooks() {
            System.out.printf("%5s | %20s | %20s | %20s | %20s \n", "ID", "Name", "Description", "Date", "Price");
            for (int i = 0; i < bookService.getAll().size(); i++) {
                  Book book = bookService.getAll().get(i);
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
      public void inputBookName(Book book){
            String name;
            boolean checkValid = false;
            do {
                  System.out.println("Nhập tên sách");
                  name = scanner.nextLine();

                  checkValid = ValiDateUtils.isValiBookName(name);
                  if (checkValid == false){
                        System.out.println("Tên ko hợp lệ, vui lòng nhập lại");
                  }
            }while (!checkValid);
            book.setName(name);
      }
      public void inputBookDescription(Book book) {
            String description;
            boolean checkValid = false;
            do {
                  System.out.println("Nhập mô tả");
                  description = scanner.nextLine();
                  checkValid = ValiDateUtils.isValiBooDescription(description);
                  if (!checkValid) {
                        System.out.println("Nhập lại đi bạn");
                  }
            } while (!checkValid);
            book.setDescription(description);
      }

      public void inputBookPrice(Book book) {
            double price = 0;
            boolean checkValid = false;
            do {
                  System.out.println("Nhập giá");
                  try {
                        price = Double.parseDouble(scanner.nextLine());
                  } catch (NumberFormatException numberFormatException) {
                        System.out.println("Giá ko hợp lệ");
                        price = 0;
                        continue;
                  }
                  checkValid = ValiDateUtils.isValiPrice(price);
                  if (checkValid == false){
                        System.out.println("Giá ko hợp lệ ");
                  }
            } while (checkValid == false);
            book.setPrice(price);
      }
      //hiển thị danh sách
      public void addBook() {
            Comparator comparator = new ComparatorById();

            List<Book> books = bookService.getAll();
            books.sort(comparator);
            Book book = new Book();
            System.out.println("Nhập thông tin sách");
            System.out.println("Nhập tên sách");
            String name = scanner.nextLine();
            System.out.println("Nhập mô tả sách");
            String description = scanner.nextLine();
            inputBookPrice(book);

            long maxId = books.get(books.size()-1).getId();


            book.setId(maxId + 1);
            book.setName(name);
            book.setDescription(description);
//            book.setPrice(price);
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

            //long id, String name, String description, Date entryDate, double price
            Book bookNew = new Book(id, newName, newInfor,new Date(), newPrice);
            bookService.updateBookByID(id, bookNew);
            showBooks();
      }

      //xoá sách
      public void deleteBook() {
            System.out.println("Nhập tên mà bạn muốn xoá");
            String name = scanner.nextLine();


            bookService.deleteBookByName(name); //nguyên lý Single reponsibility principle trong SOLID
            showBooks();
      }

      public void launcher() {
            Scanner scanner = new Scanner(System.in);
            BookView bookStore = new BookView();
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
                  switch (actionMenu) {
                        case 1:
                              bookStore.showBooks();
                              break;
                        case 2:
                              bookStore.addBook();
                              break;
                        case 3 :
                              bookStore.editBook();
                              break;
                        case 4:
                              bookStore.deleteBook();
                              break;
                        case 5:
                              bookStore.sortByPrice();
                              break;
                        case 6:
                              bookStore.sortByName();
                              break;
                        case 7:
                              bookStore.searchByName();
                              break;
                        case 8:

                        default:
                              System.out.println("Nhập sai rồi bae");
                  }
                  boolean checkActionMenuContinue = true;
                  do {
                        System.out.println("Bạn có muốn tiếp tục ? y/n");
                        String actionMenuContinue = scanner.nextLine();
                        switch (actionMenuContinue) {
                              case "y" :
                                    checkActionMenu = true;
                                    checkActionMenuContinue = false;
                                    break;
                              case "n" :
                                    checkActionMenu = false;
                                    checkActionMenuContinue = false;
                                    break;
                              default:
                                    checkActionMenuContinue = true;
                        }
                  }   while (checkActionMenuContinue);
            }   while (checkActionMenu);
      }


      //tìm theo tên
      private void searchByName() {
            System.out.println("Nhập tên mà bạn muốn tìm kiếm");
            String tim = scanner.nextLine();
            List<Book> results = new ArrayList<>();

            List<Book> books = bookService.getAll();
            for (int i = 0; i < books.size(); i++) {
                  if (books.get(i).getName().contains(tim)) {
                        results.add(books.get(i));
                  }
            }  showBooks(results);
      }
      // sắp xếp theo tên
      private void sortByName() {
            List<Book> books = bookService.getAll();
            books.sort(new ComparatorByName());
            showBooks();
      }
      // sắp xếp theo giá
      private void sortByPrice() {
            List<Book> books = bookService.getAll();
            books.sort(new ComparatorByPrice());
            showBooks();
      }
}


















































































































































































