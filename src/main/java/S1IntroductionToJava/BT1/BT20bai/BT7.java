package S1IntroductionToJava.BT1.BT20bai;

import java.util.Arrays;

public class BT7 {
    //Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
    public static void main(String[] args) {
        int [] a = {2, 1,6,4, -2, 9};
        int temp = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) {
                for (int j = i +1; j < a.length; j++){
                    if (a[i] > a[j] && a[j] > 0){
                        temp = a[j];
                        a[j] = a[i];
                        a[i]= temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
