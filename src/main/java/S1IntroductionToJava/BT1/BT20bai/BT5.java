package S1IntroductionToJava.BT1.BT20bai;

public class BT5 {
    //Kiểm tra mảng có giảm dần hay không

    public static void main(String[] args) {
//        int[] arr = {2, 19, 28, 53};

            int[] arr = {10,9,8,6,5,4};
        boolean check = isDecreaing(arr);
        System.out.println(check);

    }
    public static boolean isDecreaing(int[]arr) {
    for (int i = 1;  i< arr.length; i++ ){
        if (arr[i] < arr[i- 1]){
            return  true;
            //nếu giảm dần là true
        }
    }
    return false;
    }
}
