package S1IntroductionToJava.BT1.tryCatch;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int data = 5/0;
            //khi chạy sẽ ra lỗi " ArithmeticException "
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Phép chi cho 0");
    }
}
