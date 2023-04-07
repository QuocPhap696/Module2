package S1IntroductionToJava.BT1.BTthayQuang.Finally;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Nhập số nguyên n :");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng");
        }

        System.out.println("Giá trị nhập là : " + n);
        System.out.println("Kết thúc chương trình");
    }
}
