package S1IntroductionToJava.BT1.compareTo;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(200, "Hihih", "Lop 1", 9);
        SinhVien sv2 = new SinhVien(100, "Anh Pháp", "Lop 2", 6);
        SinhVien sv3 = new SinhVien(300, "Xoài Non", "Lop 3", 4);
        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv3.compareTo(sv2));
    }
}
