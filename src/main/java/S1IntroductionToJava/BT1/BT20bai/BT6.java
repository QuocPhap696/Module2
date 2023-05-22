package S1IntroductionToJava.BT1.BT20bai;

public class BT6 {
    //Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 8};
//        int[] b = { 1 ,7, 2, 6, 9};
        int[] b = { 2,4,6,9};
        boolean c = checkArr(a, b);
        System.out.println(c);
}

public static boolean checkArr(int[]a, int[]b){

    for (int i =0; i<a.length; i++){
        for (int j = 0; j < b.length; j++){
            if (b[j] == a[i]){
                return true;
            }
        }
    }
    return false;
}

}
