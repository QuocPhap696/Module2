package S1IntroductionToJava.BT1.InvertElement;

import java.util.Scanner;
import java.util.Stack;

public class daonguocMang {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Stack<String> daonguocMang = new Stack<String>();
//        // đảo ngược chuỗi
//        System.out.println("Nhập số chuỗi");
//        String s = scanner.nextLine();
//
//        //QUOC PHAP
//        for (int i = 0; i < s.length(); i++) {
//            daonguocMang.push(s.charAt(i) + "");
//        }
//        System.out.println("chuỗi đảo ngược là");
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(daonguocMang.pop());
//        }
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> daonguocmang = new Stack<Integer>();
    // đảo ngược mảng interger
    System.out.println("Nhập số vô");
    String s = scanner.nextLine();

    for (int i = 0; i < s.length();  i++) {
        daonguocmang.push(Integer.valueOf(s.charAt(i) + ""));
    }
    System.out.println("chuỗi đảo ngược là");
    for (int i = 0; i < s.length(); i++) {
        System.out.print(daonguocmang.pop());
    }
}
}
