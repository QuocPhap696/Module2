package S1IntroductionToJava.BT1.Test;

//khởi tạo biến local
public class Test {
 public void sayHello() {
     int n = 10;
     System.out.println("Gia tri cua n la : " + n);
 }

    public static void main(String[] args) {
        Test bienLocal = new Test();
        bienLocal.sayHello();
    }

}
// khởi tạo biến toàn cục

