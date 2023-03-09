package S1IntroductionToJava.BT1.CurrencyMoney;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
      double vnd = 23000;
      double usd;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dạ mời anh chai nhập số tiền usd");
      usd = sc.nextDouble();
      double quydoi = usd * 23000;
        System.out.println(quydoi);
    }
}
