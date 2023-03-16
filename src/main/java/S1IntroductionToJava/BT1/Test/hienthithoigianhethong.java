package S1IntroductionToJava.BT1.Test;

import java.util.Date;
import java.util.Scanner;

public class hienthithoigianhethong {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        tinhsochan();
        tingTong();

    }

    //    public static void main (String[] args) {
//        Date now = new Date();
//        System.out.println("Now is: " + now);
//    public static void main(String[] args) {
//        double vnd = 23000;
//        double usd;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời bạn nhập số tiền bằng USD :");
//        usd = scanner.nextDouble();
//        double Gia = usd * 23000;
//        System.out.println("Giá tiền là : " + Gia);
//    }
//Tính số chẵn
//    public static void tinhsochan() {
//        System.out.println("Nhập vào một con số mà e thích");
//        int number = scanner.nextInt();
//        int total = 0;
//        for ( int i = 0; i < number; i++) {
//            if (i % 2 == 0){
//                total += 1;
//            }
//        }
//        System.out.printf("Tổng các số chẵn giá trị từ 1 đến %s là %s\n", number, total);
//    }
      public static void tingTong() {
          System.out.println("Nhập số đếm tính số chẵn");
          int number = scanner.nextInt();
          int total = 0;
          for (int i = 0; i < number; i++) {
              if (i % 2 == 0) {
                  total +=1;
              }
          }
          System.out.printf("Tổng các giá trị từ 1 đến %s là %s\n", number,total);
      }
}
