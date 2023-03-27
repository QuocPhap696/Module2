package S1IntroductionToJava.BT1.BTthayQuang.StackYoutube;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhsachsinhvien = new PriorityQueue<String>();
            //PriorityQuue (ưu tiên thứ tự): sắp xếp dựa trên nguyên tắc so sánh(so sánh chữ đầu tiên)
        danhsachsinhvien.offer("PHAP 1");
        danhsachsinhvien.offer("NGUYEN VAN");
        danhsachsinhvien.offer("DANG NAM");
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

