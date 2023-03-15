package S1IntroductionToJava.BT1;

import java.util.Scanner;

public class UseTheOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Diện tích hình chữ nhật : " + area);
    }
}
