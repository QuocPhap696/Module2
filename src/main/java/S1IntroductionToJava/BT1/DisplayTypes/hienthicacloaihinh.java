package S1IntroductionToJava.BT1.DisplayTypes;

import java.util.Scanner;

public class hienthicacloaihinh {
    public static void main(String[] args) {
//        printRectangle();
//          printTriangle();
        printTriangleBottonLeft();
    }
    public static int size = 5;
    //in hình chữ nhật.
//    private static void printRectangle() {
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//
//    }
    //in hình tam giác vuông top-left
//    private static void printTriangle(){
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size - i; j++) {
//                System.out.print("* ");
//            }System.out.println();
//        }
//    }
    // in tam giác vuông botton-left
    private static void printTriangleBottonLeft() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            } System.out.println();
        }

    }
}
