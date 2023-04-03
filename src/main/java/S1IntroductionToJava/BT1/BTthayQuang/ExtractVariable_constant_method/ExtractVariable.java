package S1IntroductionToJava.BT1.BTthayQuang.ExtractVariable_constant_method;

public class ExtractVariable {
    //    public static void main(String[] args) {
//
//    }
    //kiểm tra năm nhuận
    //private static boolean isLeapYear(int year) { if(year % 4 == 0){
        //if (year % 100 == 0){ if(year % 400 == 0)
            //return true;
            //} else {
                //return true;
            //}
        //}
        //return false;
    // }
    private static boolean isLeapYear(int year) {
        //tách thành biến isDivisibleBy
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) return true;
            } else {
                return true;
            }
        }
        return false;
    }
}
