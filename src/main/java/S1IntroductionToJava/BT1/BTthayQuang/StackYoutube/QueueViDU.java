package S1IntroductionToJava.BT1.BTthayQuang.StackYoutube;

import java.util.LinkedList;
import java.util.Queue;

public class QueueViDU { // thằng nào vào trước thì ra trước (Firts in firts out)
    public static void main(String[] args) {
        Queue<String> danhsachsinhvien = new LinkedList<String>();

        danhsachsinhvien.offer("PHAP 1"); //offer: đưa dữ liệu vào
        danhsachsinhvien.offer("DANG NAM");
        danhsachsinhvien.offer("NGUYEN VAN");
        danhsachsinhvien.offer("HIHI");

        while (true) {
            String  ten = danhsachsinhvien.poll(); //peek lấy ra nhưng ko xoá
                                                   // poll lấy ra rồi xoá luôn
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
