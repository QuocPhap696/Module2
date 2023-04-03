package S1IntroductionToJava.BT1.Product_________;

import java.util.*;

public class ProductManager {
    List<Product> products;

     private Scanner scanner = new Scanner(System.in);
     public ProductManager() {
         products = new ArrayList<>();

         //long id, String name, String description, Date entryDate, double price
         Product product = new Product(1, "Quần Jeans", "Form SLim", new Date(), 400000 );
         products.add(product);
         products.add(new Product(2, "Áo sơ mi", "Oversize", new Date(), 300000));
         products.add(new Product(3, "Mũ", "Form Vừa Đẹp", new Date(), 250000));
         products.add(new Product(4, "Hoodie", "Màu xám ", new Date(), 490000));
     }

     public void showProduct() {
         System.out.printf("%5s | %10s | %15s | %25s | %10s \n",
                 "ID", "Name", "Description", "Date", "Price" );
         for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
             System.out.printf("%5s | %10s | %15s | %10s | %10s \n",
                     product.getId(), product.getName(), product.getDescription(),
                     product.getEntryDate(), product.getPrice());
         }
     }
    public void showProduct(List<Product> products) {
        System.out.printf("%5s | %10s | %15s | %25s | %10s \n",
                "ID", "Name", "Description", "Date", "Price" );
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf("%5s | %10s | %15s | %10s | %10s \n",
                    product.getId(), product.getName(), product.getDescription(),
                    product.getEntryDate(), product.getPrice());
        }
    }

    public void addProduct() {
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả");
        String description = scanner.nextLine();
        //date tự cập nhật
        System.out.println("Nhập giá mới");
        double price = Double.parseDouble(scanner.nextLine());

        Comparator comparator = new ComparatorById();
        products.sort(comparator);

        long maxID = products.get(products.size()-1).getId();

        Product product = new Product();
        product.setId(maxID +1);
        product.setName(name);
        product.setDescription(description);
        product.setEntryDate(new Date());
        product.setPrice(price);

        products.add(product);
        showProduct();
    }

    public void editProduct() {
        System.out.println("Nhập ID mà muốn sửa");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên mới");
        String newName = scanner.nextLine();
        System.out.println("Nhập mô tả mới");
        String newDescription = scanner.nextLine();
        System.out.println("Nhập giá mới");
        double newPrice = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i< products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.get(i).setName(newName);
                products.get(i).setDescription(newDescription);
                products.get(i).setPrice(newPrice);
            }
        }
        showProduct();
    }

    //xoá product
    public void deleteProduct() {
        System.out.println("Nhập ID sản phẩm mà bạn muốn xoá");
        long id = Long.parseLong(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
        showProduct();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean checkActionMenu = false;
        do {
            System.out.println("Nhấn 1 để xem sản phẩm");
            System.out.println("Nhấn 2 thêm sản phẩm");
            System.out.println("Nhấn 3 sửa  sản phẩm");
            System.out.println("Nhấn 4 Nhập ID xoá  sản phẩm");
            System.out.println("Nhấn 5 Tìm kiếm sản phẩm theo tên");
            System.out.println("Nhấn 6 Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1 :
                    productManager.showProduct();
                    break;
                case 2 :
                    productManager.addProduct();
                    break;
                case 3 :
                    productManager.editProduct();
                    break;
                case 4 :
                    productManager.deleteProduct();
                    break;
                case 5 :
                    productManager.searchByName();
                    break;
                case 6 :
                    productManager.sortByPrice1();
                    break;
                default:
                    System.out.println("Nhập sai rồi");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục ? y/n");
                String actionMenuContinue = scanner.nextLine();
                switch (actionMenuContinue) {
                    case "y" :
                        checkActionMenu = true;
                         checkActionMenuContinue= false;
                        break;
                    case "n" :
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default: checkActionMenuContinue = true;
                }
            } while (checkActionMenuContinue);
        } while (checkActionMenu);
    }

    private void searchByName() {
        System.out.println("Nhập tên mà bạn muốn tìm kiếm");
        String search = scanner.nextLine();
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(search)) {
                result.add(products.get(i));
            }
        }
        showProduct(result);
    }

    private void sortByPrice1() {
         products.sort(new ComparatorByPrice1());
         showProduct();
    }


    private void sortByName() {
         products.sort(new ComparatorByName());
         showProduct();
    }
}
