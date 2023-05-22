package S1IntroductionToJava.BT1.BT20bai;

public class BT2 {
    public static void main(String[] args) {


//        //BT2 :Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố trong mảng 1 chiều các số nguyên
        int[] arr = {2, 19, 28, 53, 44};
        System.out.println("Vị trí các số nguyên tố là");
        for (int i = 0; i < arr.length; i++) {
          if (isPrime(arr[i])){
              System.out.print(i + " ");
          }
       }
   }
   //kiểm tra số nguyên tố
    public static boolean isPrime(int n){
        if (n <2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

