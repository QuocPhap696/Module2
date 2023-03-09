package S1IntroductionToJava.BT1.BodyWeightIndex;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Cân nặng (in kilogram)");
        weight = scanner.nextDouble();

        System.out.print("Chiều cao (in meter)");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}


