//package S1IntroductionToJava.BT1.ReadFileExample;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class readFileText {
//    public void readFileText(String filePath) {
//        try {
//            //đọc file theo đường dẫn
//            File file = new File(filePath);
//            //kiểm tra nếu file ko tồn tại thì ném ra ngoại lệ
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            // đọc từng dòng của file và tiến hành cộng tổng
//            BufferedReader br = new BufferedReader(new BufferedReader(file));
//            String line = "";
//            int sum = 0;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//                sum += Integer.parseInt(line);
//
//            }
//            br.close();
//            //hiển thị ra màn hình
//            System.out.println("Tổng" + sum);
//        } catch (Exception e) {
//            //nếu file ko tồn tại hoặc file lỗi thì hiển thị thông báo lỗi
//            System.out.println("File ko tồn tại hoặc nội dung có lỗi");
//
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Nhập đường dẫn file :");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//
//        ReadFileExample readfileEx = new ReadFileExample();
//        readfileEx.readFileText(path);
//    }
//
//}
