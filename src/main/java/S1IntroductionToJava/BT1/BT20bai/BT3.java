package S1IntroductionToJava.BT1.BT20bai;

public class BT3 {
    public static void main(String[] args) {
        //Đếm số lượng giá trị tận cùng bằng 5 trong mảng
        int[] arr = {2, 19,0, 28, 53, 44};
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 10 == 5){
                count++;
            }
        }
        System.out.println("Số lượng tận cùng bằng 5 trong mảng " + count);
    }
}
