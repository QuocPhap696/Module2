package S1IntroductionToJava.BT1.BTthayQuang.StackYoutube;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ViDuDeque {
    public static void main(String[] args) {
        //Deque : muốn linh hoạt hơn (chèn đầu chèn cuối)
        // hàng đợi 2 đầu
        Deque<String> danhsachSV = new ArrayDeque<String>();
        danhsachSV.offer("Quoc Phap");
        danhsachSV.offer("Hoi Lam Chi");
        danhsachSV.offer("HiHi");
        danhsachSV.offer("Chi Rua");
        // chèn vô đâu và chèn vô cuối
        danhsachSV.offerLast("Cuoi Cung");
        danhsachSV.offerFirst("Đau Tien");
        // dautien > quocphap > hoilamchi > hihi > chirua > cuoicung
        while (true) {
            String ten = danhsachSV.poll(); //lấy ra và xoá
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
