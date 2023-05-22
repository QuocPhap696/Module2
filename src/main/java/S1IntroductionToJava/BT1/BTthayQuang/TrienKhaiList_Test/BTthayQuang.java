package S1IntroductionToJava.BT1.BTthayQuang.TrienKhaiList_Test;

import java.util.Scanner;

public class BTthayQuang {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean checkActionMenu = false;
        do {
            System.out.println("Tính tổng");

            int actionMenu = scanner.nextInt();
            switch (actionMenu) {
                case 1:
                    tinhtong();
                    break;
            }
        } while (checkActionMenu);
    }
    public static  void tinhtong(){
        int[] array = {15, 7, 3, 13};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Gía trị tổng là : " + sum);
    }

}

