package S1IntroductionToJava.BT1.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh A :");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào cạnh B :");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào cạnh C :");
        double c = scanner.nextDouble();
        Triangle triangle = new Triangle();
        triangle.tong3canh(a,b,c);
    }
    private void tong3canh (double a, double b, double c)    {
        try {

            boolean sum = a + b < c || b + c < a || a + c < b;


        } catch (Exception e) {
            System.err.println("là 1 ngoại lệ" + e.getMessage());
        }
    }


}
