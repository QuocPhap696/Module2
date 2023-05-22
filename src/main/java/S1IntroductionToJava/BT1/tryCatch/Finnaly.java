package S1IntroductionToJava.BT1.tryCatch;

public class Finnaly {
    public static void main(String[] args) {
        try {
            int data = 5/0;
        }
//        catch (ArithmeticException e){  //Lỗi là ArithmeticException
//            System.out.println(e);
//       }
        finally {
            System.out.println("Khối finally luôn được thực thi");
        }
        System.out.println("Finished");
    }
}
