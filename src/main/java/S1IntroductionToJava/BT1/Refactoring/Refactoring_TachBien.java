package S1IntroductionToJava.BT1.Refactoring;

public class Refactoring_TachBien {
    // public static String fizzBuzz(int number){
    //        if(number % 3 == 0 && number % 5 == 0)
    //            return "FizzBuzz";
    //
    //        if(number % 3 == 0)
    //            return "Fizz";
    //
    //        if(number % 5 == 0)
    //            return "Buzz";
    //
    //        return number + "";
    //    }

    //tách biến
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isFizz)
            return "Buzz";
        return number + "";
    }
}
