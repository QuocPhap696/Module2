package S1IntroductionToJava.BT1.BTthayQuang.StackYoutube;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackDemo = new Stack<String>();
        //đảo ngược chuỗi
        System.out.println("Nhập vào chuỗi");
        String s = scanner.nextLine();
        //PHAT
        for (int i = 0; i < s.length(); i++) {
            stackDemo.push(s.charAt(i) + "");
        }
        System.out.println("Chuõi đảo ngược");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackDemo.pop());
    }
        System.out.println();
        //chuyển từ hệ thập phân sang nhị phân
        Stack<String> stacksoDu = new Stack<String>();
        System.out.println("Nhập số nguyên dương");
        int x = scanner.nextInt();
        while (x > 0) {
            int soDu = x%2;
            System.out.println(soDu);
            stacksoDu.push(soDu + "");
            x = x/2;
        }
        //đảo ngược lại
        System.out.println("Số nhị phân là :");
        int n = stacksoDu.size();
        for (int i = 0; i< n; i++) {
            System.out.print(stacksoDu.pop());
        }
}
}
