package S1IntroductionToJava.BT1.NumbersReadIntoWords;

import java.util.Scanner;

public class BT2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        excerciseEven();
        exerciseTotal();
    }

//tính tổng
    public static void excerciseEven () {
    System.out.println("Nhập vào một số");
    int number = scanner.nextInt();
    for (int i = 0; i < number;i++) {
        if(i % 2 == 0) {
            System.out.println(i);
        }
    }
}

//tìm số nguyên tố
 public static void exerciseTotal() {
     System.out.println("Nhập vào 1 số, tính tổng từ 1 đến số đó");
     int number = scanner.nextInt();
     int total = 0;
     for (int i = 0; i < number; i++) {
         if (i % 2 == 0) {
             total +=i;
         }
     }
     System.out.println("Tổng các giá trị từ 1 đến %s là %s\n");
 }

}