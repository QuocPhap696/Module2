package S1IntroductionToJava.BT1.CheckForPrimes;

import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số vào");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + "Không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;

            }
            if (check) {
                System.out.println("là số nguyên tố");
            } else
                System.out.println("không phải là số nguyên tố");
        }
    }
    }

