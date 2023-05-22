package S1IntroductionToJava.BT1.ThreadCreate.MyThreadExtendsThread;

import S1IntroductionToJava.BT1.ThreadCreate.Thread;

public class MyThread implements Runnable {
 @Override
 public void run() {
     System.out.println("thread is running ...");
 }

//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.run();
//    }
//    // kết quả : thread is running...

//    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        //sử dụng hàm khởi tạo Thread (Runnable r)
//        Thread t1 = new Thread(m1);
//                t1.start();
//    }
}
