package S1IntroductionToJava.BT1.BTthayQuang;

import java.util.Scanner;

public class Tinhtong {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        tinhtong();
//        Demsochan();
//        MinArray();
          AddArray();
//          DeleteArray();
    }

    public static void tinhtong() {
        int[] array = {15, 7, 3, 13};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Gía trị tổng là : " + sum);
    }

    //Đếm xem mảng đó có bao nhiêu số chẵn
    public static void Demsochan() {
        int[] array = {1, 4, 6, 7, 2, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Số chẵn là : " + array[i]);
            }
        }

    }

    //tìm giá nhỏ nhất của mảng
    public static void MinArray() {
        int[] array = {23, 10, 35, 6, 7};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất là : " + min);
    }

    //Thêm phần tử vào mảng
    public static void AddArray() {
        int[] array = {23, 10, 35, 6, 7};
        int index = 5;
        int[] newArray = new int[6];
        for (int j = 0; j < newArray.length; j++) {
            for (int i = j; i < array.length; i++) {
                newArray[j] = array[i];
                break;
            }
            newArray[newArray.length -1 ] = index;
        }
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }

    }

    //Xoá phần tử khỏi mảng.
//    public static void DeleteArray() {
//        int[] array = {23, 10, 35, 6, 7};
//        int[] newArray = new int[4];
//        for ( int i = 0; i < array.length; i++) {
//            for (int j = 0; j <)
//        }
//    }

}



