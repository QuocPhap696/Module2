package S1IntroductionToJava.BT1.BT20bai;

public class BT4 {
    //Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
    public static void main(String[] args) {
        int[] arr = {2, 19,0, 28, 53, 44};
        int count = 0;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == 0) {
                count++;
            }
        }
        if (count > 0){
            System.out.println("chứa giá trị 0");
        }else {
            System.out.println("không chứa giá trị 0");
        }
    }
}
