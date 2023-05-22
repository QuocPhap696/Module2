package S1IntroductionToJava.BT1.BT20bai;

public class BT1 {
    public static void main(String[] args) {
        //BT1 : Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
        int[] arr = {2, 19, 28, 53, 44};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0 ){
                System.out.println(arr[i] + "là số lẽ");
            }
        }
    }
}
