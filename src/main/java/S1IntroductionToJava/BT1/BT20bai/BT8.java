package S1IntroductionToJava.BT1.BT20bai;

public class BT8 {
    //Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static void main(String[] args) {
        int []a ={3,1,9,5,4,7,6};
        int temp;
        for (int i = 0;  i < a.length;i++) {
            if (a[i] > 0){
                for (int j = i +1; j <a.length; j++){
                    if (a[i] > a[j] && a[j] >0) {

                    }
                }
            }
        }
    }
}
