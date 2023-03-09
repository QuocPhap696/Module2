package S1IntroductionToJava.BT1.CurrencyMoney;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
       double vnd = 23000;
       double usd;
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập số tiền vô");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Số tiền là : " + quydoi);
    }
}
