package CheckLeapYear;

import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d không phải là năm nhuận", year);
                }
            } else {
                    System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
