package S1IntroductionToJava.BT1.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
    //check đầu vào
        Scanner scanner = new Scanner(System.in);
        //vd1 : chỉ nhận 1 số
        //vd2:  nhập nhiều số (thêm dấu + trước $)
        //vd3 : nhập số lớn hơn 6 ký tự (thêm dấu {6,} sau [0-9])
        //vd4 : nhập chính xác 6 ký tự (thêm số 6 {6} bỏ dấu ,)
        //vd5 : nhập từ 6 > 10 ký tự (thêm {6,10})
        //vd6 : nhập đầu vào chỉ là chữ (thêm [a-zA-Z] thay cho [0-9])
        //vd7 : nhập cả số và chữ (thêm[a-zA-Z0-9])
        //nếu thêm dấu cách thì [a-zA-Z0-9 ]

        //("^.*$")  : . bất kỳ ký tự nào
                   // * xuất hiện ít nhất là 0 lần
        //Kiểm tra định dạng Email  ^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$
        //Kiểm tra username  ^[a-z0-9_-]{6,12}$

        Pattern p = Pattern.compile("^[a-zA-Z ]+$"); // bắt đầu bằng ^, kết thúc bằng $
        while (true) {
            System.out.printf("Nhập chuỗi :");
            String txt = scanner.nextLine();
            if (p.matcher(txt).find()) {
                System.out.println("Hợp Lệ");
                break;
            } else {
                System.err.println("Cú pháp sai. Vui lòng nhập lại "); //err: chữ thông báo màu đỏ
            }
        }
    }
}
