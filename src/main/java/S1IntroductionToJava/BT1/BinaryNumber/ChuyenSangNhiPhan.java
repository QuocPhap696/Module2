package S1IntroductionToJava.BT1.BinaryNumber;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackNhiPhan = new Stack<String>();
        System.out.println("Nhập số");
        int x = scanner.nextInt();
        while (x > 0) {
            int soDu = x % 2;

            stackNhiPhan.push(soDu + "");
            x /= 2;


            }
        //đảo ngược chuỗi s
        System.out.println("số nhị phân là ");
        int du = stackNhiPhan.size();
        for (int i = 0; i < du; i++) {
            System.out.print(stackNhiPhan.pop());
    }

    }
}