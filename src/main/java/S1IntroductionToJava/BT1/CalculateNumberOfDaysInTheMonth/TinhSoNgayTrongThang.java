package S1IntroductionToJava.BT1.CalculateNumberOfDaysInTheMonth;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bae muốn nhập tháng nào, a chỉ cho?");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                System.out.println("Tháng này có 28 or 29 ngày");;
                break;
            case  1:
            case  3:
            case  5:
            case  7:
            case  8:
            case  10:
            case  12:
                System.out.println(" Tháng " + month + " có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" Tháng " + month + " có 30 ngày má  " );
                break;
            default:
                System.out.println("Vui lòng nhập đúng số tháng chỉ từ 1 > 12 thoai");

        }
    }
}

